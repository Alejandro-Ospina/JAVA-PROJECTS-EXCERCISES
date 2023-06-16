
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente. */
public class EjercicioE9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = entrada.nextInt();
        System.out.print("Ingrese el divisor: ");
        int divisor = entrada.nextInt();
        divisionRestaSucesiva(dividendo,divisor);
    }
    
    public static void divisionRestaSucesiva(int dividendo, int divisor){
        if(dividendo < divisor){
            System.out.println("\nCociente: " + 0);
            System.out.println("Residuo: " + 0);
        }else {
            int cociente = 1;
            int residuo = dividendo - divisor;
            while(residuo >= divisor){
                cociente += 1;
                residuo -= divisor;
            }
            System.out.println("\nCociente: " + cociente);
            System.out.println("Residuo: " + residuo);
        }            
    }
}