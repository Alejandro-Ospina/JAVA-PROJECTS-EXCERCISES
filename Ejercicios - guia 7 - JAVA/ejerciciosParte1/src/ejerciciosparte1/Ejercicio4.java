
package ejerciciosparte1;
import java.util.Scanner;

//  @author new53
/* Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner grados = new Scanner(System.in);
        System.out.print("Ingrese el valor en grados a convertir a F: ");
        float valor = grados.nextFloat();
        System.out.println(valor + "°C equivale a: " + (32+((9*valor)/5)) + "F");
    }
}
