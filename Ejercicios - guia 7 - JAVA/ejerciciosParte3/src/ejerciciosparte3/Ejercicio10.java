
package ejerciciosparte3;
import java.util.Scanner;
//  @author new53
/* Escriba un programa en el cual se ingrese un valor límite positivo, y a con-
tinuación solicitenúmeros al usuario hasta que la suma de los números introduci-
dos supere el límite inicial. */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Ingrese un valor límite positivo: ");
            numero = valor.nextInt();
            if (numero < 0){
                System.out.println("¡NO SE ADMITEN NEGATIVOS!");}
        } while(numero<0);
        
        int suma = 0;
        while (suma <= numero){
            System.out.print("Ingrese un valor a sumar: ");
            int adicion = valor.nextInt();
            suma += adicion;
            System.out.println("Valor acumulado: " + suma);
        }
    }
}
