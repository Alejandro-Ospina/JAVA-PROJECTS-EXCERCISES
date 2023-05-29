
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. */
public class EjercicioE11 {
    
    public static int digitosNumero(long numero){
        int contadorDigitos = 1;
        long cociente = (long) Math.floor(numero/10);
        while(cociente != 0){
            contadorDigitos += 1;
            cociente = (long) Math.floor(cociente/10);
        }
        return contadorDigitos;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        long numero = entrada.nextLong();
        System.out.println("Cantidad de digitos del número " + numero + " :" + digitosNumero(numero));
    }
}