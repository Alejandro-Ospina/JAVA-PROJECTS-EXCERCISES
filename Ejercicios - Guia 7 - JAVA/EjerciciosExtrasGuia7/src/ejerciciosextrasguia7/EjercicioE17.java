
package ejerciciosextrasguia7;
import java.util.Scanner;
/* Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false. */
//  @author new53
public class EjercicioE17 {
    
    public static boolean esPrimo(int numero){
        for(int i=2; i<numero; i++){
            if (numero==1 || numero==2){
                return true;
            }else{
                if(numero % i == 0){
                    return false;
                }
            }               
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese por favor un número: ");
        int numero = entrada.nextInt();
        if(esPrimo(numero)){
            System.out.println(numero + " Es primo");
        }else{
            System.out.println(numero + " NO es primo");
        }
    }
}
