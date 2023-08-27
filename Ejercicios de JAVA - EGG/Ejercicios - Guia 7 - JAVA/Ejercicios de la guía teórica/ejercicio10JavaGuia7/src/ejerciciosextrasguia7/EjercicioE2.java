
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. */
public class EjercicioE2 {

    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        int A, B, C, D, auxiliar;
        System.out.print("Ingrese el valor de la variable A: ");
        A = entrada.nextInt();
        System.out.print("Ingrese el valor de la variable B: ");
        B = entrada.nextInt();
        System.out.print("Ingrese el valor de la variable C: ");
        C = entrada.nextInt();
        System.out.print("Ingrese el valor de la variable D: ");
        D = entrada.nextInt();
        System.out.println("\nVariables antes del cambio");
        System.out.println("(A: " + A + "), (B: " + B + "), (C: " + C + "), (D: " + D + ")\n");
        //Efectuamos cambio de variable
        auxiliar = B;
        B = C;
        C = A;
        A = D;
        D = auxiliar;
        System.out.println("Variables después del cambio");
        System.out.println("(A: " + A + "), (B: " + B + "), (C: " + C + "), (D: " + D + ")\n");    
    }
}
