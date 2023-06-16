
package ejerciciosparte5;

//  @author new53
/* Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/
public class Ejercicio19 {
    
    public static int[][] transponerMatriz(int[][] matriz){
        int[][] transpuesta = new int[matriz.length][matriz.length];
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                transpuesta[i][j] = matriz[j][i];
            }
        }
        return transpuesta;
    }
    
    public static void antiSimetrica(int[][] matriz, int[][] transpuesta){
        boolean confirmar = true;
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if (matriz[i][j] == (transpuesta[i][j])*-1){
                } else {
                    confirmar = false;
                    break;
                }
            }
        }
        if (confirmar){
            System.out.println("Es anti simétrica");
        }else {
            System.out.println("NO es anti simétrica");
        }
    }

    public static void main(String[] args) {
        int[][] matriz = {{0,-2, 4},
                          {2, 0, 2},
                         {-4,-2, 0}};
        // Transponemos matriz
        int[][] transpuesta = transponerMatriz(matriz);
        antiSimetrica(matriz,transpuesta);
    }

}
