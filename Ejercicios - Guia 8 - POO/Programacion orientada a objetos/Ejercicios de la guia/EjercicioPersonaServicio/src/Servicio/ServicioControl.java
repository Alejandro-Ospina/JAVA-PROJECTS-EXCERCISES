
package Servicio;

import Entidad.Persona;


// @author new53
 
public class ServicioControl {
    Persona per = new Persona();
    
    public void crearPersona(String nombre, String apellido, int edad){
        per.setNombre(nombre);
        per.setApellido(apellido);
        per.setEdad(edad);
    }
            
    public void mostrarPersona(ServicioControl persona){       
        System.out.println(per.getNombre());
        System.out.println(per.getApellido());
        System.out.println(per.getEdad());
    }  
}
