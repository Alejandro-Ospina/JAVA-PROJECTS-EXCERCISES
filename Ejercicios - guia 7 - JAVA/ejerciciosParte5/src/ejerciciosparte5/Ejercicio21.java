
package ejerciciosparte5;
//  @author new53

/* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P. */
public class Ejercicio21 {
    
    public static void contieneMatriz(int[][] matrizContenedora, int[][] indexMatriz){  
        int[][] comparador = new int[indexMatriz.length][indexMatriz.length];
        int inicioI = 0;
        int inicioJ = 0;
        int finI = indexMatriz.length;
        int finJ = indexMatriz.length; 
        int match = 0;
        int posicionX = 0;
        int posicionY = 0;
        while (finI < matrizContenedora.length+1 && finJ < matrizContenedora.length+1){                         
            for(int i=inicioI, k=0; i<finI && k<indexMatriz.length; i++, k++){
                for(int j=inicioJ, l=0; j<finJ && l<indexMatriz[k].length; j++, l++){                    
                    comparador[k][l] = matrizContenedora[i][j];
                    if(comparador[k][l] == indexMatriz[k][l]){
                        match += 1;
                        if (match == 1){
                            posicionX = i;
                            posicionY = j;
                        }
                        if (match == indexMatriz.length*indexMatriz.length){
                            System.out.println("Matriz encontrada");
                            System.out.println("Posicion a partir de la cual se halla la submatriz: (" + posicionX + "," + posicionY + ")");
                            break;
                        }
                    }
                }                                
            }                       
            if(match != indexMatriz.length*indexMatriz.length){
                match = 0;
            }else {
                break;
            }
            inicioJ += 1;
            finJ += 1;
            if(inicioJ == matrizContenedora.length-indexMatriz.length+1){
                inicioI += 1;
                finI += 1;
                inicioJ = 0;
                finJ = indexMatriz.length;
            }            
        }
        if (match != indexMatriz.length*indexMatriz.length){
            System.out.println("Matriz NO encontrada");
        }
    }
    public static void main(String[] args) {
        int[][] matrizGeneral = {
            { 1, 26, 36, 47,  5,  6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90,  9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79,  1, 36,  5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 97, 90, 67, 12, 41, 65, 12}
        };       
        int [][] matrizIndex = {            
            {36,  5, 67},
            {89, 90, 75},
            {14, 22, 26}
        };       
        contieneMatriz(matrizGeneral, matrizIndex);
    }
}