
package ejerciciosparte1;
import java.util.Scanner;

//  @author new53
/* Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla. */

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String name = nombre.nextLine();
        String nombrePersona = name;
        System.out.println("Nombre: " + nombrePersona);
    }
}
