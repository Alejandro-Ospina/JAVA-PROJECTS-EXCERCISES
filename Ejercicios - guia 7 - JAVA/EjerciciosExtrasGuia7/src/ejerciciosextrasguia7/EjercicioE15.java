
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main. */
public class EjercicioE15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número 1: ");
        int numero1 = entrada.nextInt();
        System.out.print("Ingrese el número 2: ");
        int numero2 = entrada.nextInt();
        System.out.println("\nIngrese la operación a realizar con los números ingresados");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.print("Opción: ");
        int opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Suma: " + sumar(numero1,numero2));
                break;
            case 2:
                System.out.println("Resta: " + restar(numero1,numero2));
                break;
            case 3:
                System.out.println("Multiplicación: " + multiplicar(numero1,numero2));
                break;
            case 4:
                System.out.println("División: " + dividir(numero1,numero2));
                break;
            default:
                System.out.println("¡Opción no válida!");
        }
    }
    
    public static int sumar(int numero1, int numero2){
        return numero1 + numero2;
    }
    
    public static int restar(int numero1, int numero2){
        return numero1 < numero2 ? numero2 - numero1: numero1 - numero2;
    }
    
    public static int multiplicar(int numero1, int numero2){
        return numero1*numero2;
    }
    
    public static String dividir(int numero1, int numero2){
        try{
            return Double.toString((double) numero1/numero2);
        }
        catch(ArithmeticException excepcion){
            return excepcion.getMessage();
        }
    }
}