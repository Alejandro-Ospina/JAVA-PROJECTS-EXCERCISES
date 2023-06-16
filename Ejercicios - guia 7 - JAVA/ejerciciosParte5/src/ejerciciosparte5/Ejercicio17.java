
package ejerciciosparte5;
import java.util.Arrays;
import java.util.Scanner;
//  @author new53
/* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos). */
public class Ejercicio17 {
    
    public static void contarDigitosVector(int[] vector){
        int[] digitos = new int[vector.length];
        System.out.println(Arrays.toString(vector));
        for(int i=0; i<vector.length; i++){
            digitos[i] = 1;
            int auxiliar = 10;
            while(vector[i] % auxiliar != vector[i]){
                digitos[i] += 1;
                auxiliar = (int) (Math.pow(10, digitos[i]));               
            }
            System.out.println("Digitos del valor " + (i+1) + ": " + digitos[i]);
        }
    }
    
    public static int[] crearVector(int dimension){
        int[] vector = new int[dimension];
        for(int i=0; i<dimension-1 ; i++){
            vector[i] = (int) (Math.random()*100000);         
        }
        return vector;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int dimension = entrada.nextInt();
        // Ahora invocamos las funciones
        contarDigitosVector(crearVector(dimension));
    }
}
