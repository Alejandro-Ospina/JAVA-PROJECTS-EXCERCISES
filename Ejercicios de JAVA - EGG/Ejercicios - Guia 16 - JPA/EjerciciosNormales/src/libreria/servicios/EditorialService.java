
package libreria.servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import libreria.entities.Editorial;
import libreria.servicios.exceptions.LibreriaExcepciones;


// @author new53
 
public class EditorialService {
    
    /**
     * El método devuelve una instancia de la clase EntityManager
     * @return objeto de la clase EntityManager
     */
    private EntityManager getEntityManager(){
        return Persistence.createEntityManagerFactory("EjerciciosNormalesPU").createEntityManager();
    }
    
    /**
     * Devuelve un objeto de la entidad Editorial
     * @param idEditorial Recibe como parámetro el ID de la editorial de interés
     * @return objeto de la entidad Editorial si lo encuentra.
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoEncontrada 
     */
    private Editorial encontrarEditorial(int idEditorial) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = getEntityManager();
        try{
            return em.find(Editorial.class, idEditorial);
        }catch(Exception ex){
            throw new LibreriaExcepciones.EntidadNoEncontrada("Editorial no encontrada");
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    /**
     * Añade un objeto de la clase editorial a la base de datos.
     * @param editorial Recibe como argumento un objeto de la clase editorial.
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoCreada Si no se puede añadir un registro a la entidad Editorial
     */
    public void crearEditorial(Editorial editorial) throws LibreriaExcepciones.EntidadNoCreada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            TypedQuery<Editorial> query = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nomb", Editorial.class);
            List<Editorial> editoriales = query.setParameter("nomb", editorial.getNombre()).getResultList();
            if(!editoriales.isEmpty()){
                throw new LibreriaExcepciones.EntidadNoCreada("¡Ya existe una editorial con dicho nombre en la base de datos!");
            }
            em.getTransaction().begin(); em.persist(editorial); em.getTransaction().commit();
            System.out.println("¡Editorial agregada exitosamente!");
        }catch (LibreriaExcepciones.EntidadNoCreada ex){
            throw new LibreriaExcepciones.EntidadNoCreada("Algo ha salido mal en la creación de la editorial");
        }finally{
            if (em != null){
                em.close();
            }
        }       
    }
    
    /**
     * Actualiza un registro de la entidad Editorial.
     * @param editorial Recibe un objeto de la clase Editorial como argumento
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoEncontrada Si no se encuentra un match en la entidad Editorial
     */
    public void actualizarEditorial(Editorial editorial) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            int idEditorial = editorial.getId();
            if(encontrarEditorial(idEditorial) == null){
                throw new LibreriaExcepciones.EntidadNoEncontrada("¡La editorial no se actualizó debido a que no existe"
                        + "\nen la base de datos!");
            }else{
                em.merge(editorial); em.getTransaction().commit();
            }
        }
        finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }
    
    /**
     * Elimina un registro de la entidad Editorial
     * @param idEditorial Recibe el id de una editorial como argumento
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoEncontrada Si no se encuentra un match en  la Entidad editorial
     */
    public void eliminarEditorial(int idEditorial) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            Editorial editorial = encontrarEditorial(idEditorial);
            if(editorial == null){
                throw new LibreriaExcepciones.EntidadNoEncontrada("No se ha podido remover la editorial de la base"
                        + "\nde datos debido a que no existe");
            }else{
                em.remove(editorial);
                em.getTransaction().commit();
            }
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
}