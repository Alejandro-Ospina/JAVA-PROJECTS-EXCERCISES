
package ejerciciosextrasguia7;
import java.util.Scanner;
import java.util.Random;
//  @author new53
/* Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos. */
public class EjercicioE22 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese las filas de la matriz: ");
        int filas = entrada.nextInt();
        System.out.print("Ingrese las columnas de la matriz: ");
        int columnas = entrada.nextInt();
        int[][] matriz = llenarMatrizAleatorio(filas,columnas);
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("\nSuma total de los elementos de la matriz: " + sumarMatriz(matriz));
    }
    
    public static int[][] llenarMatrizAleatorio(int filas, int columnas){
        Random aleatorio = new Random();
        int[][] matriz = new int[filas][columnas];
        for(int i=0; i<filas; i++){
            for(int j=0; j<columnas; j++){
                matriz[i][j] = aleatorio.nextInt(9) + 1;
            }
        }
        return matriz;
    }
    
    public static int sumarMatriz(int[][] matriz){
        int suma = 0;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}