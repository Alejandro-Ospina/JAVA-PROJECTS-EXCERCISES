
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
public class EjercicioE13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera: ");
        int altura = entrada.nextInt();
        escaleraNumeros(altura);
    }
    
    public static void escaleraNumeros(int altura){
        for(int i=1; i<=altura; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
