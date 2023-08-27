
package Servicios;

import Entidad.PersonaDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


// @author new53
 
public class ServicioFecha {
    private Scanner entrada = new Scanner(System.in);
    private static Date fecha = new Date();
    private static SimpleDateFormat formato = new SimpleDateFormat("dd - MMMM - yyyy");
    
    public PersonaDate crearPersona(){
        System.out.print("Ingrese el nombre: "); String nombre = entrada.nextLine();
        System.out.print("Ingrese el año de nacimiento: ");int year = entrada.nextInt();
        System.out.print("Ingrese el mes de nacimiento: ");int mes = entrada.nextInt();
        System.out.print("Ingrese el día de nacimiento: ");int dia = entrada.nextInt();
        return new PersonaDate(nombre, new Date(year-1900, mes-1, dia));
    }
    
    public static int calcularEdad(PersonaDate persona){
        return fecha.getYear() - persona.getFechaNacimiento().getYear();
    }
    
    public static boolean menorQue(PersonaDate persona, int edad){
        return calcularEdad(persona) > edad ? true : false;
    }
    
    public static String mostrarPersona(PersonaDate persona){
        return "Nombre de la persona: " + persona.getNombre() + "\nFecha de nacimiento: "
                + formato.format(persona.getFechaNacimiento()) + "\nEdad: " + 
                calcularEdad(persona);
    }
}
