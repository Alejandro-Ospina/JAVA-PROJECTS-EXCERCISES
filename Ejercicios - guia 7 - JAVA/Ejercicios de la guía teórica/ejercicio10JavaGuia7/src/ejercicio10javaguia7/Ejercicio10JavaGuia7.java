package ejercicio10javaguia7;
import java.util.Scanner;

//  @author new53
public class Ejercicio10JavaGuia7 {

    public static void main(String[] args) {
        Scanner leerNumero = new Scanner(System.in);
        int numero;
        for (int i=1; i<=4;i++){
            do {
                System.out.print("Ingrese el número " + i + ": ");
                numero = leerNumero.nextInt();
                if (numero < 1 || numero > 20 ){
                    System.out.println("Número fuera de límite");
                }
            } while (numero < 1 || numero > 20);
            System.out.print(numero + " ");
            for (int j=1; j<=numero; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
