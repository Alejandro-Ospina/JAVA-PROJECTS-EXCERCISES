
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/
public class EjercicioE16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = entrada.nextLine();
            System.out.print("Ingrese la edad de la persona: ");
            int edad = entrada.nextInt();
            entrada.nextLine();
            System.out.println("\n" + nombreEdadPersona(nombre,edad));
            System.out.print("\n¿Desea continuar con la lectura de nombre y edades de personas (S/N)?: ");
            String respuesta = entrada.nextLine().toLowerCase();
            if(respuesta.equalsIgnoreCase("n")){
                break;
            }
            System.out.println();
        }
    }
    
    public static String nombreEdadPersona(String nombre, int edad){
        String tipoCiudadano = edad < 18? "Menor de edad" : "Mayor de edad"; 
        return "Nombre: " + nombre + "\nEdad: " + Integer.toString(edad) + "\nCiudadano: " + tipoCiudadano;
    }
}