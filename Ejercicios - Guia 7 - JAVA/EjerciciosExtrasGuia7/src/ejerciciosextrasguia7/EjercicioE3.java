
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String. */
public class EjercicioE3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un caracter: ");
        String palabra = entrada.next();
        if(palabra.equalsIgnoreCase("a") || palabra.equalsIgnoreCase("e") || palabra.equalsIgnoreCase("i") || palabra.equalsIgnoreCase("o") || palabra.equalsIgnoreCase("u")){
             System.out.println("ES VOCAL");           
        }else{
            System.out.println("ES CONSONANTE O FRASE");
        }
    }
}
