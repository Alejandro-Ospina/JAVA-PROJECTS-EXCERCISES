
package libreria.servicios;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import libreria.entities.Cliente;
import libreria.servicios.exceptions.LibreriaExcepciones;


// @author new53
 
public class ClienteService {
    
    private EntityManager getEntityManager(){
        return Persistence.createEntityManagerFactory("EjerciciosExtras").createEntityManager();
    }
    
    private Cliente encontrarCliente(int idCliente) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            return em.find(Cliente.class, idCliente);
        }catch (Exception ex){
            throw new LibreriaExcepciones.EntidadNoEncontrada ("¡No se ha encontrado el cliente en la base de datos!");
        }finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }      
    }
    
    /**
     * El método permite insertar un nuevo cliente en la base de datos, solo en caso de que no exista
     * @param cliente Correspondiente a un objeto de la entidad Cliente.
     * @throws libreria.servicios.exceptions.LibreriaExcepciones.EntidadNoCreada Si encuentra un cliente con el mismo documento 
     */
    public void crearCliente(Cliente cliente) throws LibreriaExcepciones.EntidadNoCreada{
        EntityManager em = null;
        EntityTransaction et = null;
        try{
            em = getEntityManager();           
            TypedQuery<Cliente> query = em.createQuery("SELECT c FROM Cliente c WHERE c.documento = :doc", Cliente.class);
            List<Cliente> clientes = query.setParameter("doc", cliente.getDocumento()).getResultList();
            if (!clientes.isEmpty()){
                throw new LibreriaExcepciones.EntidadNoCreada("¡Ya existe un cliente con el documento dado!");
            }          
            et = em.getTransaction(); 
            et.begin(); em.persist(cliente); et.commit();
            System.out.println("¡Cliente agregado exitosamente!");
        }catch (LibreriaExcepciones.EntidadNoCreada ex){
            if(et != null && et.isActive()){
                et.rollback();
            }
            System.out.println("No se ha creado un cliente nuevo en la base de datos");
        }finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }
    
    public void actualizarCliente(Cliente cliente) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = null;
        EntityTransaction et = null;
        try{
            em = getEntityManager();
            Cliente client = encontrarCliente(cliente.getId());
            if (client == null){
                throw new LibreriaExcepciones.EntidadNoEncontrada ("¡No se actualizó el cliente debido a que no existe en la base de datos!");
            }
            et = em.getTransaction();
            et.begin(); em.merge(cliente); et.commit();
        }catch (LibreriaExcepciones.EntidadNoEncontrada ex){
            System.out.println("¡Ha habido un error en la actualización del cliente!");
            if(et != null && et.isActive()){
                et.rollback();
            }
        }finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }
    
    public void eliminarCliente(int idCliente) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = null;
        EntityTransaction et = null;
        try{
            em = getEntityManager();
            Cliente cliente = encontrarCliente(idCliente);
            if(cliente == null){
                throw new LibreriaExcepciones.EntidadNoEncontrada("¡No se ha eliminado el cliente debido a que no existe en la base de datos!");
            }
            et = em.getTransaction();
            et.begin(); em.remove(cliente); et.commit();
        }catch(LibreriaExcepciones.EntidadNoEncontrada ex){
            System.out.println("¡Ha habido un error en la eliminación del cliente!");
            if(et != null && et.isActive()){
                et.rollback();
            }
        }finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }
}