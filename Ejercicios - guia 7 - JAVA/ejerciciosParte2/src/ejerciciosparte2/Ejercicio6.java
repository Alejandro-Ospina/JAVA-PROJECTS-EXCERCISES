
package ejerciciosparte2;
import java.util.Scanner;
//  @author new53
/* Crear un programa que dado un numero determine si es par o impar. */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = valor.nextInt();
        if (numero % 2 == 0){
            System.out.println(numero + " es PAR");
        } else {
            System.out.println(numero + " es IMPAR");
        }
    }
}
