
package ejerciciosparte5;
import java.util.Arrays;
import java.util.Scanner;
//  @author new53
/* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. */
public class Ejercicio15 {
    
    public static int[] llenarVectorYMostrarVector(int dimension){
        int[] vector = new int[dimension];
        for(int i=dimension-1; i>=0; i--){
            vector[dimension-1-i] = i;  
        }  
        return vector;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int dimension = entrada.nextInt();
        System.out.println(Arrays.toString(llenarVectorYMostrarVector(dimension)));
    }
}
