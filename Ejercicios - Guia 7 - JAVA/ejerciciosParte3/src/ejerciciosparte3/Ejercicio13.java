
package ejerciciosparte3;
import java.util.Scanner;
//  @author new53
/* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();
        for (int i=1; i<=numero; i++){
            for(int j=1; j<=numero; j++){
                if (i==1 || i== numero || j == 1 || j == numero){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
