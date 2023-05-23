
package ejerciciosparte1;
import java.util.Scanner;

//  @author new53
/* Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java. */

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner frase = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frasePalabra = frase.nextLine();
        System.out.println("Frase en mayúscula: " + frasePalabra.toUpperCase());
        System.out.println("Frase en minúscula: " + frasePalabra.toLowerCase());
    }
}
