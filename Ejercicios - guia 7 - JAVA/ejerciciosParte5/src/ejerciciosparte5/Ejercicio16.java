
package ejerciciosparte5;
import java.util.Arrays;
import java.util.Scanner;
//  @author new53
/* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido */
public class Ejercicio16 {
    
    public static int[] crearVector(int dimension){
        int[] vectorAleatorio = new int[dimension];
        for(int i = 0; i<=dimension-1;i++){
            vectorAleatorio[i] = (int) (Math.random()*5);                       
        }
        return vectorAleatorio;
    }
    
    public static void encontrarValor(int[] vector, int valor) {
        int contadorRepetidor = 0;
        System.out.println(Arrays.toString(vector));
        for (int i=0; i<vector.length; i++){
            if (vector[i] == valor) {
                contadorRepetidor += 1;
                if (contadorRepetidor == 1) {
                    System.out.println("Posición donde se halla " + valor + ": " + i);
                }
            }
        }
        if(contadorRepetidor == 0) {
            System.out.println("No match found!");
        }else {
            System.out.println("Veces que se encuentra repetido el número " + valor + ": " + contadorRepetidor);
        }
    }
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int dimension = entrada.nextInt();
        //Creamos y llamamos al vector aleatorio        
        System.out.print("Ingrese el valor que desea buscar: ");
        int buscarValor = entrada.nextInt();
        encontrarValor(crearVector(dimension),buscarValor);
    }
}
