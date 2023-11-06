
package libreria.servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import libreria.entities.Autor;
import libreria.entities.Editorial;
import libreria.entities.Libro;
import libreria.servicios.exceptions.LibreriaExcepciones;


// @author new53
 
public class LibroService {
    
    /**
     * El método devuelve una instancia de la clase EntityManager
     * @return Instancia de la clase EntityManager para ser trabajada dentro del servicio
     */
    private EntityManager getEntityManager(){
        return Persistence.createEntityManagerFactory("EjerciciosNormalesPU").createEntityManager();
    }
    
    /**
     * El método devuelve un objeto de la entidad libro, solo si se encuentra indexado en la
     * base de datos
     * @param idLibro Recibe el ISBN del libro de interés.
     * @return instancia de la clase libro, si el match coincide con la entidad Libro
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoEncontrada 
     */
    private Libro encontrarLibro(long idLibro) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = getEntityManager();
        try{
            return em.find(Libro.class, idLibro);
        }catch(Exception ex){
            throw new LibreriaExcepciones.EntidadNoEncontrada("Libro no encontrado");
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    /**
     * El método añade un objeto de la clase libro a la base de datos.
     * @param libro Recibe un objeto de la clase libro como argumento.
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoCreada si no se puede añadir el objeto a la base de datos
     */
    public void crearLibro(Libro libro) throws LibreriaExcepciones.EntidadNoCreada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            TypedQuery<Libro> query = em.createQuery("SELECT l from Libro l where l.titulo = :tit", Libro.class);   
            List<Libro> libros = query.setParameter("tit", libro.getTitulo()).getResultList();            
            if (!libros.isEmpty()){
                throw new LibreriaExcepciones.EntidadNoCreada("¡El título del libro está repetido. No se admiten duplicados!");
            }
            TypedQuery<Autor> query2 = em.createQuery("SELECT a from Autor a where a.nombre = :nom", Autor.class);
            TypedQuery<Editorial> query3 = em.createQuery("SELECT e from Editorial e where e.nombre = :nomb", Editorial.class);
            Autor autor = null; 
            Editorial editorial =  null;
            try{
                autor = query2.setParameter("nom", libro.getAutor().getNombre()).getSingleResult();
                editorial = query3.setParameter("nomb", libro.getEditorial().getNombre()).getSingleResult();
            }catch(NoResultException ignored){
                System.out.println("Transacción en curso...");
            }
            if(autor != null){
                System.out.println("El autor ya se encuentraba validado en la base de datos");
                libro.setAutor(autor);
            }
            if(editorial != null){
                System.out.println("La editorial ya se encontraba validada en la base de datos");
                libro.setEditorial(editorial);
            }
            em.getTransaction().begin(); em.persist(libro); em.getTransaction().commit();
            System.out.println("¡Libro agregado exitosamente!");
        }catch (LibreriaExcepciones.EntidadNoCreada ex){
            throw new LibreriaExcepciones.EntidadNoCreada("Algo ha salido mal en la creación del libro");
        }finally{
            if (em != null){
                em.close();
            }
        }       
    }
    
    /**
     * El método actualiza un registro de la entidad Libro, si el match coincide
     * @param libro Recibe un objeto de la clase libro como argumento
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoEncontrada Si no se encuentra un match en la entidad Libro
     */
    public void actualizarLibro(Libro libro) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            long idLibro = libro.getIsbn();
            if(encontrarLibro(idLibro) == null){
                throw new LibreriaExcepciones.EntidadNoEncontrada("¡El libro no se actualizó debido a que no existe"
                        + "\nen la base de datos!");
            }else{
                em.merge(libro); em.getTransaction().commit();
            }
        }
        finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    /**
     * El método elimina un registro de la entidad Libro, solo si el match coincide.
     * @param idLibro Recibe el id de un libro como argumento
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoEncontrada Si no se encuentra una coincidencia.
     */
    public void eliminarLibro(int idLibro) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            Libro libro = encontrarLibro(idLibro);
            if(libro == null){
                throw new LibreriaExcepciones.EntidadNoEncontrada("No se ha podido remover el libro de la base"
                        + "\nde datos debido a que no existe");
            }else{
                em.remove(libro);
                em.getTransaction().commit();
            }
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    /**
     * Devuelve un registro de la clase libro el cual se busca por ISBN
     * @param isbn Número de ISBN del libro.
     * @return Registro con ISBN respectivo.
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.ExcepcionBusqueda 
     */
    public List<Libro> consultarLibroISBN(long isbn) throws LibreriaExcepciones.ExcepcionBusqueda{
        EntityManager em = null;
        try{
            em = getEntityManager();
            TypedQuery<Libro> query = em.createQuery("SELECT l from Libro l WHERE l.isbn = :value", Libro.class);
            List<Libro> libros = query.setParameter("value", isbn).getResultList();
            return libros;
        }catch (Exception ex){
            throw new LibreriaExcepciones.ExcepcionBusqueda("Ha habido un error de consulta");
        }finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }
    
    /**
     * Devuelve un registro de la clase libro el cual se busca por título
     * @param titulo Título del libro.
     * @return Registro del libro con el título respectivo.
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.ExcepcionBusqueda 
     */
    public List<Libro> consultarLibroTitulo(String titulo) throws LibreriaExcepciones.ExcepcionBusqueda{
        EntityManager em = null;
        try{
            em = getEntityManager();
            TypedQuery<Libro> query = em.createQuery("SELECT l from Libro l WHERE l.titulo LIKE :titu", Libro.class);
            List<Libro> libros = query.setParameter("titu", "%" + titulo + "%").getResultList();
            return libros;
        }catch (Exception ex){
            throw new LibreriaExcepciones.ExcepcionBusqueda("Ha habido un error de consulta");
        }finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }
    
    /**
     * Devuelve una lista con el o los libros de determinado Autor
     * @param nombreAutor Nombre del autor.
     * @return lista con el o los libros de determinado Autor.
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.ExcepcionBusqueda 
     */
    public List<Libro> consultarLibroAutor(String nombreAutor) throws LibreriaExcepciones.ExcepcionBusqueda{
        EntityManager em = null;
        try{
            em = getEntityManager();
            TypedQuery<Libro> query = em.createQuery("SELECT l from Libro l WHERE l.autor.nombre LIKE :nombre", Libro.class);
            List<Libro> libros = query.setParameter("nombre", "%" + nombreAutor + "%").getResultList();
            return libros;
        }catch (Exception ex){
            throw new LibreriaExcepciones.ExcepcionBusqueda("Ha habido un error de consulta");
        }finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }
    
    /**
     * Devuelve una lista del o los libros bajo del nombre de determinada editorial.
     * @param nombreEditorial  Nombre de la editorial.
     * @return lista del o los libros bajo del nombre de determinada editorial.
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.ExcepcionBusqueda 
     */
    public List<Libro> consultarLibroEditorial(String nombreEditorial) throws LibreriaExcepciones.ExcepcionBusqueda{
        EntityManager em = null;
        try{
            em = getEntityManager();
            TypedQuery<Libro> query = em.createQuery("SELECT l from Libro l WHERE l.editorial.nombre LIKE :nombre", Libro.class);           
            List<Libro> libros = query.setParameter("nombre", "%" + nombreEditorial + "%").getResultList();                
            return libros;
        }catch (Exception ex){
            throw new LibreriaExcepciones.ExcepcionBusqueda("Ha habido un error de consulta", ex);
        }finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }      
}