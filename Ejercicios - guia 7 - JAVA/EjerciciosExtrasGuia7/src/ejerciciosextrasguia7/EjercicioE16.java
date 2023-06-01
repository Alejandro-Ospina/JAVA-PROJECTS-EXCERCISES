
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
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
            System.out.print("\n¿Desea finalizar la lectura de nombre y edades de personas (S/N)?: ");
            String respuesta = entrada.nextLine().toLowerCase();
            if(respuesta.equalsIgnoreCase("s")){
                break;
            }
            System.out.println();
        }
    }
    
    public static String nombreEdadPersona(String nombre, int edad){
        return "Nombre: " + nombre + " - Edad: " + Integer.toString(edad);
    }
}