
package ejerciciosextrasguia7;
import java.util.Scanner;
import java.util.Random;
//  @author new53
/* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector. */
public class EjercicioE20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);      
        System.out.print("Ingrese la dimensión del vector: ");
        int dimension = entrada.nextInt();
        int[] vector = new int[dimension];
        int[] recibirVector = llenarVector(vector);
        System.out.println("Vector: " + mostrarVector(recibirVector));
    }
    
    public static int[] llenarVector(int[] vector){
        Random aleatorio = new Random();
        for(int i=0; i<vector.length; i++){
            vector[i] = aleatorio.nextInt(20) + 1;
        }
        return vector;
    }
    
    public static String mostrarVector(int[] vector){
        String vectorLleno = "[";
        for(int i=0; i<vector.length; i++){
            if(i == vector.length - 1){
                vectorLleno = vectorLleno + Integer.toString(vector[i]) + "]";
            }else{
                vectorLleno = vectorLleno + Integer.toString(vector[i]) + " ";
            }                        
        }
        return vectorLleno;
    }
}
