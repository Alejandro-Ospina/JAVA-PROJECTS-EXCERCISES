
package ejerciciosextrasguia7;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
//  @author new53
/* Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos). */
public class EjercicioE19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la dimension de los 2 vectores a comparar: ");
        int dimension = entrada.nextInt();
        int[] vectorA = llenarVector(dimension);
        int[] vectorB = llenarVector(dimension);
        System.out.println("Vector A: " + Arrays.toString(vectorA) + "\n" + "Vector B: " + Arrays.toString(vectorB));
        if(compararVectores(vectorA,vectorB)){
            System.out.println("¡Vectores iguales!");
        }else{
            System.out.println("¡Vectores NO iguales!");
        }
    }
    
    public static int[] llenarVector(int dimension){
        Random aleatorio = new Random();
        int[] vector = new int[dimension];
        for(int i=0; i<dimension; i++){
            vector[i] = aleatorio.nextInt(9) + 1;
        }
        return vector;
    }
    
    public static boolean compararVectores(int[] vectorA, int[] vectorB){
        int i = 0;
        boolean esIgual = true;
        while(i < vectorA.length){
            if(vectorA[i] != vectorB[i]){
                return false;
            }
            i = i + 1;
        }
        return esIgual;
    }
}