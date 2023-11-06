
package Prueba;

//  @author new53

import Prueba.Entidades.Mascota;
import Prueba.Entidades.Persona;
import Prueba.Excepciones.Excepciones;
import Prueba.Servicios.PersonaService;
import java.util.Calendar;

public class EjercicioExtra {

    public static void main(String[] args) {      
        try{
            Calendar calendar = Calendar.getInstance();
            calendar.set(1995, 04, 25);
            new PersonaService().crearPersona(new Persona("Juan", "Arango Rodriguez", 
            27, calendar, new Mascota("trosky", "Bulldog")));
        }catch (Excepciones.UsuarioRepetido ex){
            System.out.println("Error: " + ex);           
        }  
    }
}