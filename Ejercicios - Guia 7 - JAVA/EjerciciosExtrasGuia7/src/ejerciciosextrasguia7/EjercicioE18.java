
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario. */
public class EjercicioE18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la dimensión del vector: ");
        int dimension = entrada.nextInt();
        int[] vector = new int[dimension];
        for(int i=0; i<dimension; i++){
            System.out.print("Ingrese un número: ");
            vector[i] = entrada.nextInt();
        }        
        System.out.println("Resultado de la suma: " + sumarVectorEnteros(vector));
    }
        
    public static int sumarVectorEnteros(int[] vector){
        int suma = 0;
        for(int i: vector){
            suma += i;
        }
        return suma;
    }
}
