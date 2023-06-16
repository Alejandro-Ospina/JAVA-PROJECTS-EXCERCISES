
package ejerciciosextrasguia7;
import java.util.Scanner;
/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”. */
public class EjercicioE7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números que desea ingresar al arreglo: ");
        int numero = entrada.nextInt();
        int[] numeros = new int[numero];       
        for(int i=0; i<numero; i++){
            System.out.print("Ingrese el número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        primeraAlternativa(numeros);
        segundaAlternativa(numeros);
    }
    
    public static void primeraAlternativa(int[] numeros){
        int i = 0;
        int maximo = 0;
        int minimo = numeros[0];
        int sumador = 0;
        while(i<numeros.length){
            if(numeros[i] >= maximo){
                maximo = numeros[i];
            }else{
                maximo = maximo;
            }
            if(numeros[i] <= minimo){
                minimo = numeros[i];
            }else{
                minimo = minimo;
            }
            sumador += numeros[i];
            i += 1;
        }
        System.out.println("\nNumero máximo del arreglo: " + maximo);
        System.out.println("Numero mínimo del arreglo: " + minimo);
        System.out.println("Promedio de los números: " + (float) (sumador/numeros.length));
    }
    
    public static void segundaAlternativa(int[] numeros){
        int i = 0;
        int maximo = 0;
        int minimo = numeros[0];
        int sumador = 0;
        do{
            if(numeros[i] >= maximo){
                maximo = numeros[i];
            }else{
                maximo = maximo;
            }
            if(numeros[i] <= minimo){
                minimo = numeros[i];
            }else{
                minimo = minimo;
            }
            sumador += numeros[i];
            i += 1;
        }while(i<numeros.length);
        System.out.println("\nNumero máximo del arreglo: " + maximo);
        System.out.println("Numero mínimo del arreglo: " + minimo);
        System.out.println("Promedio de los números: " + (float) (sumador/numeros.length));
    }
}