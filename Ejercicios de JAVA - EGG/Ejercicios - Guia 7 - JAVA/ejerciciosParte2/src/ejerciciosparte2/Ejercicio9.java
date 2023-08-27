
package ejerciciosparte2;
import java.util.Scanner;
//  @author new53
/* Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java. */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner palabra = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String frase = palabra.nextLine();
        if (frase.toLowerCase().substring(0,1).equals("a")){
            System.out.println("CORRECTO");
        }else {
            System.out.println("INCORRECTO");
        }
    }
}
