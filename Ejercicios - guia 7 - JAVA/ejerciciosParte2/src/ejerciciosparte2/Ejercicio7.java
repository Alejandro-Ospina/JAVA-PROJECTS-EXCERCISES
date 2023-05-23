
package ejerciciosparte2;
import java.util.Scanner;
//  @author new53
/* Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java. */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner palabra = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = palabra.nextLine();
        if (frase.equals("eureka")){
            System.out.println("Match: " + true);
        }else {
            System.out.println("Match: " + false);
        }
    }
}
