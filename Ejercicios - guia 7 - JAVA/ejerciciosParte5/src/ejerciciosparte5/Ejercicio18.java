
package ejerciciosparte5;
import java.util.Scanner;
//  @author new53
/* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa). */
public class Ejercicio18 {
    
    public static int[][] crearMatrizAleatoria(int dimension){
        int[][] matriz = new int[dimension][dimension];
        for(int i = 0; i < dimension-1; i++){
            for(int j = 0; j < dimension-1; j++){
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        return matriz;
    }
    
    public static int[][] matrizTranspuesta(int[][] matriz){
        int[][] matTranspuesta = matriz;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matTranspuesta[i][j] = matriz[j][i];
            }
        }
        return matTranspuesta;
    }
    
    public static void imprimirMatriz(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la dimensión de la matriz: ");
        int dimension = entrada.nextInt();
        int[][] matriz = crearMatrizAleatoria(dimension);
        System.out.println("Matriz normal");
        imprimirMatriz(matriz);
        System.out.println("\nMatriz transpuesta");
        imprimirMatriz(matrizTranspuesta(matriz));
    }
}