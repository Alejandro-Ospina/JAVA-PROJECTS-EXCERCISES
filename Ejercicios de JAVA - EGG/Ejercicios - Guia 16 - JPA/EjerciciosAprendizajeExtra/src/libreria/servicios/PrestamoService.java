
package libreria.servicios;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import libreria.entities.Prestamo;
import libreria.servicios.exceptions.LibreriaExcepciones;


// @author new53
 
public class PrestamoService {
    
    public EntityManager getEntityManager(){
        return Persistence.createEntityManagerFactory("EjerciciosExtras").createEntityManager();
    }
    
    private Prestamo encontrarPrestamo(int idPrestamo) throws LibreriaExcepciones.EntidadNoEncontrada{
        EntityManager em = null;
        try{
            em = getEntityManager();
            return em.find(Prestamo.class, idPrestamo);
        }catch(Exception ex){
            throw new LibreriaExcepciones.EntidadNoEncontrada("¡No se ha encontrado un registro asociado al préstamo establecido!");
        }finally{
            if(em != null && em.isOpen()){
                em.close();
            }
        }
    }
    
    public void crearPrestamo(Prestamo prestamo) throws LibreriaExcepciones.EntidadNoCreada{
        EntityManager em = null;
        EntityTransaction et = null;
        try{
            em = getEntityManager();
            TypedQuery<Prestamo> prestam = em.createQuery("SELECT p from Prestamo p WHERE p.libro.titulo = :nombre", Prestamo.class);
            Prestamo p = prestam.setParameter("nombre", prestamo.getLibro().getTitulo()).getSingleResult();
            if(p == null){
                throw new LibreriaExcepciones.EntidadNoCreada("No se pudo crear un préstamo debido a que no existe el libro");
            }
            if(p != null && p.getLibro().getEjemplaresRestantes() == 0){
                throw new LibreriaExcepciones.EntidadNoCreada("No se pudo crear un préstamo debido a que no hay más ejemplares del libro");
            }
            if(p != null && prestamo.getLibro().getEjemplaresPrestados() > p.getLibro().getEjemplaresRestantes()){
                throw new LibreriaExcepciones.EntidadNoCreada("No se pudo crear un préstamo debido a que la cantidad de ejemplares a prestar es mayor a los ejemplares restantes");
            }
            if(p != null && prestamo.getFechaPrestamo().compareTo(prestamo.getFechaDevolucion()) > 0){
                throw new LibreriaExcepciones.EntidadNoCreada("No se pudo crear un préstamo debido a que la fecha de devolución es anterior a la fecha de préstamo");
            }
            et = em.getTransaction(); et.begin();           
            int prestados = p.getLibro().getEjemplaresPrestados() + 1;
            int restantes = p.getLibro().getEjemplares() - prestados;
            prestamo.getLibro().setEjemplaresPrestados(prestados);
            prestamo.getLibro().setEjemplaresRestantes(restantes);
            em.persist(prestamo);
            et.commit();
        }catch (LibreriaExcepciones.EntidadNoCreada ex){
            System.out.println("¡Algo ha salido mal con la creación del préstamo!");
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
