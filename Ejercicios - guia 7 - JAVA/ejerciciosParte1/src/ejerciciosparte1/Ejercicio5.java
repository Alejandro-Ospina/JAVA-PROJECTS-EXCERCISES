
package ejerciciosparte1;
import java.util.Scanner;

//  @author new53
/* Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt(). */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int valor = numero.nextInt();
        float raiz = (float) Math.sqrt(valor);
        System.out.println("El doble de " + valor + " es: " + (2*valor));
        System.out.println("El triple de " + valor + " es: " + (3*valor));
        System.out.println("La raiz cuadrada de " + valor + " es: " + raiz);
    }
}
