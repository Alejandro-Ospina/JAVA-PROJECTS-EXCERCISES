
package libreria.servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import libreria.entities.Autor;
import libreria.servicios.exceptions.LibreriaExcepciones;


// @author new53
 
public class AutorService {
    
    /**
     * Devuelve un objeto de la clase EntityManager
     * @return Instancia de la clase EntityManager
     */
    private EntityManager getEntityManager(){
        return Persistence.createEntityManagerFactory("EjerciciosNormalesPU").createEntityManager();
    }
    
    /**
     * Devuelve una instancia de la clase Autor si encuentra un registro en la entidad Autor
     * @param idAutor Recibe el ID del Autor como argumento
     * @return objeto de la clase Autor si encuentra registro dentro de la entidad Autor
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoEncontrada 
     */
    private Autor encontrarAutor(int idAutor) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = getEntityManager();
        try{
            return em.find(Autor.class, idAutor);
        }catch(Exception ex){
            throw new LibreriaExcepciones.EntidadNoEncontrada("Autor no encontrado");
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    /**
     * Añade un autor a la entidad Autor
     * @param autor Recibe un objeto de la clase Autor como argumento
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoCreada Si no se puede añadir un autor a la entidad respectiva
     */
    public void crearAutor(Autor autor) throws LibreriaExcepciones.EntidadNoCreada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nomb", Autor.class);
            List<Autor> autores = query.setParameter("nomb", autor.getNombre()).getResultList();
            if(!autores.isEmpty()){
                throw new LibreriaExcepciones.EntidadNoCreada("¡Ya existe un autor con dicho nombre en la base de datos!");
            }
            em.getTransaction().begin(); em.persist(autor); em.getTransaction().commit();
            System.out.println("¡Autor agregado exitosamente!");
        }catch (LibreriaExcepciones.EntidadNoCreada ex){
            throw new LibreriaExcepciones.EntidadNoCreada("Algo ha salido mal en la creación del autor");
        }finally{
            if (em != null){
                em.close();
            }
        }       
    }
    
    /**
     * Actualiza un registro dentro de la entidad Autor
     * @param autor Recibe un objeto de la clase Autor como argumento
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoEncontrada Si no se encuentra el regsitro respectivo dentro de la entidad Autor
     */
    public void actualizarAutor(Autor autor) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            int idAutor = autor.getId();
            if(encontrarAutor(idAutor) == null){
                throw new LibreriaExcepciones.EntidadNoEncontrada("¡El autor no se actualizó debido a que no existe"
                        + "\nen la base de datos!");
            }else{
                em.merge(autor); em.getTransaction().commit();
            }
        }
        finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    /**
     * Elimina un registro dentro de la entidad Autor
     * @param idAutor Recibe el id de un autor como argumento.
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoEncontrada Si no ecuentra el registro a eliminar dentro de la entidad Autor.
     */
    public void eliminarAutor(int idAutor) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            Autor autor = encontrarAutor(idAutor);
            if(autor == null){
                throw new LibreriaExcepciones.EntidadNoEncontrada("No se ha podido remover el autor de la base"
                        + "\nde datos debido a que no existe");
            }else{
                em.remove(autor);
                em.getTransaction().commit();
            }
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    /**
     * Devuelve una lista de autores que tienen un nombre en específico
     * @param nombreAutor
     * @return Lista de autores con un nombre específico.
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.ExcepcionBusqueda
     */
    public List<Autor> consultaAutorNombre(String nombreAutor) throws LibreriaExcepciones.ExcepcionBusqueda{
        EntityManager em = null;
        try{
            em = getEntityManager();
            TypedQuery<Autor> query = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre", Autor.class);
            List<Autor> autores = query.setParameter("nombre", "%" + nombreAutor + "%").getResultList();
            return autores;
        }catch(Exception ex){
            throw new LibreriaExcepciones.ExcepcionBusqueda("Ha habido un error de consulta", ex);
        }finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }
}