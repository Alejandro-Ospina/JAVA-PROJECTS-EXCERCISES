
package ejerciciopersona;

//  @author new53

import Entidad.Persona;

public class EjercicioPersona {

    public static void main(String[] args) {
        Persona objetoPersona = new Persona();
        Persona objetoPersona2 = new Persona("Alejandro", "Ospina", 27);
        
        objetoPersona.setNombre("Eriberto");
        objetoPersona.setApellido("Casas de Bareque");
        objetoPersona.setEdad(69);
        System.out.println("Nombre: " + objetoPersona.getNombre() + 
                "\nApellidos: " + objetoPersona.getApellido() + 
                "\nEdad: " + objetoPersona.getEdad());
        
        System.out.println("\nNombre persona 2: " + objetoPersona2.getNombre() + 
                "\nApellidos persona 2: " + objetoPersona2.getApellido() + 
                "\nEdad persona 2: " + objetoPersona2.getEdad());
    }
}
