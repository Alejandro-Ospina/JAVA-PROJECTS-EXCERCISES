
package Prueba.Servicios;

import Prueba.Entidades.Persona;
import Prueba.Excepciones.Excepciones;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


// @author new53
 
public class PersonaService {
    
    private EntityManager getEntityManager(){
        return Persistence.createEntityManagerFactory("EjercicioExtraPU").createEntityManager();
    }
         
    public void crearPersona(Persona persona) throws Excepciones.UsuarioRepetido{
        EntityManager em = null;
        EntityTransaction et = null;
        try{
            em = getEntityManager();            
            TypedQuery<Persona> consulta = em.createQuery("SELECT p FROM Persona p WHERE p.apellido"
                    + " = :variable", Persona.class);
            List<Persona> listaPersonas = consulta.setParameter("variable", persona.getApellido()).getResultList();
            if(!listaPersonas.isEmpty()){
                throw new Excepciones.UsuarioRepetido("El usuario ya se encuentra repetido");
            }
            et = em.getTransaction();
            et.begin();
            em.persist(persona);
            et.commit();
            System.out.println("¡Persona agregada exitosamente!");           
        }catch (Excepciones.UsuarioRepetido ex){
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