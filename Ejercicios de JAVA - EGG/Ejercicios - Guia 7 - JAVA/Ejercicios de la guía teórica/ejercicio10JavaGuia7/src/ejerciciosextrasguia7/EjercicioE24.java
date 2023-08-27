
package ejerciciosextrasguia7;
import java.util.Scanner;
import java.util.Arrays;
//  @author new53
/* Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números: 
1, 1, 2, 3, 5, 8, 13, 21, 34, ... */
public class EjercicioE24 {
    
    public static int[] vectorFibbonacci(int dimensionVector){
        int[] vectorFib = new int[dimensionVector];
        if(dimensionVector == 1){
            vectorFib[0] = 0;
            return vectorFib;
        }else if(dimensionVector == 2){
            vectorFib[0] = 0;
            vectorFib[1] = 1;
            return vectorFib;
        }else if(dimensionVector > 2){
            vectorFib[0] = 0;
            vectorFib[1] = 1;
            for(int i=2; i<dimensionVector; i++){
                vectorFib[i] = vectorFib[i-1] + vectorFib[i-2];
            }           
        }
        return vectorFib;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector Fibbonacci: ");
        int dimensionFibbonacci = entrada.nextInt();
        System.out.println("\nVector de Fibbonnaci");
        System.out.println(Arrays.toString(vectorFibbonacci(dimensionFibbonacci)));
    }
}
