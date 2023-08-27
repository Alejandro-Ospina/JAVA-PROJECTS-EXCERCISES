
package ejerciciosparte5;
import java.util.Scanner;
//  @author new53
/* Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9. */
public class Ejercicio20 {
    
    public static void imprimirMatriz(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }
    
    public static boolean comprobarMatriz(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if (matriz[i][j] > 9 || matriz[i][j] < 1){
                    return false;
                }
            }            
        }
        return true;
    }
    
    public static boolean cuadradoEsMagico(int[][] matriz){ 
        int[] vectorSumas = new int[2*matriz.length+2];
        vectorSumas[2*matriz.length] = 0;
        vectorSumas[2*matriz.length+1] = 0;
        for(int i=0; i<matriz.length; i++){
            vectorSumas[i] = 0;
            vectorSumas[matriz.length+i] = 0;            
            for(int j=0; j<matriz[i].length; j++){
                vectorSumas[i] = vectorSumas[i] + matriz[i][j];
                vectorSumas[matriz.length+i] = vectorSumas[matriz.length+i] + matriz[j][i];             
                if (i == j){
                    vectorSumas[2*matriz.length] = vectorSumas[2*matriz.length] + matriz[i][j];
                }
                if (j == matriz.length-1-i){
                    vectorSumas[2*matriz.length+1] = vectorSumas[2*matriz.length+1] + matriz[i][j];
                }
            }                
        }
        for(int i=0; i<=vectorSumas.length-2; i++){
            if (vectorSumas[i] != vectorSumas[i+1]){
                return false;              
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //construimos el cuadrado mágico
        int[][] matriz = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Ingrese el valor de la posición (" + (i+1) + "," + (j+1) + "): ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nMatriz ingresada por el usuario");
        imprimirMatriz(matriz);
        // Comprobamos la matriz ingresada
        if(!comprobarMatriz(matriz)){
            System.out.println("\nUno o varios valores ingresados no están entre 1 y 9");
        }else{
            if(cuadradoEsMagico(matriz)){
                System.out.println("\nLa matriz es mágica\n");
            }else{
                System.out.println("\nLa matriz NO es mágica\n");
            }
        }
    }
}