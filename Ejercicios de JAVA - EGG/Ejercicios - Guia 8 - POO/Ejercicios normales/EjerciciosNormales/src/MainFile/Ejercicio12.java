
package MainFile;

//  @author new53

import Entidad.PersonaDate;
import Servicios.ServicioFecha;

public class Ejercicio12 {

    public static void main(String[] args) {
        ServicioFecha objeto = new ServicioFecha();
        PersonaDate persona = objeto.crearPersona(); // creamos la persona
        
        //Calculamos la edad de la persona
        ServicioFecha.calcularEdad(persona);
        //Realizamos una prueba de edad
        System.out.println("Probamos que un número sea menor a la edad de"
                + "\nla persona, en este caso probamos con 60 años: " + ServicioFecha.menorQue(persona, 60));
        //Imprimimos los datos de la persona
        System.out.println("\nRESUMEN DE LA PERSONA\n" + ServicioFecha.mostrarPersona(persona));
    }
}
