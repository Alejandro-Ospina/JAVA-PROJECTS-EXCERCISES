
package ejerciciosparte1;
import java.util.Scanner;

//  @author new53
/* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma */

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        System.out.print("Digita el número 1: ");
        int numero1 = numeros.nextInt();
        System.out.print("Digita el número 2: ");
        int numero2 = numeros.nextInt();
        System.out.println("Suma = " + (numero1+numero2));
    }
}
