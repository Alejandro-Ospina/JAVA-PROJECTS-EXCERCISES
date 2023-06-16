
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/
public class EjercicioE8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalNumeros = 0;
        int numero;
        int pares = 0;
        int impares = 0;        
        while(true){
            System.out.print("Ingrese un número: ");
            numero = entrada.nextInt();
            if(numero % 5 == 0){
                System.out.println("¡SE HA DETECTADO UN NÚMERO MÚLTIPLO DE 5!");
                break;
            }else if(numero < 0){               
                continue;
            }else if(numero % 2 == 0){
                pares += 1; 
            }else{
                impares += 1;
            }   
            totalNumeros += 1;                                     
        }
        System.out.println("\nCantidad de numeros pares leidos: " + pares);
        System.out.println("Cantidad de numeros impares leidos: " + impares);
        System.out.println("Cantidad de numeros leidos: " + totalNumeros);
    }
}