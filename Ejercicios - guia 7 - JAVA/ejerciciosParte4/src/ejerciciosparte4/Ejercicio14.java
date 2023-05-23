
package ejerciciosparte4;
import java.util.Scanner;
//  @author new53
/* Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */
public class Ejercicio14 {
    
    public static void convertirEuros(double euros, String moneda){
        switch(moneda){
            case "l":
                System.out.println(euros + " € equivale a " + (euros*0.86) + " libras");
                break;
            case "d":
                System.out.println(euros + " € equivale a $" + (euros*1.28611) + "  USD");
                break;
            case "y":
                System.out.println(euros + " € equivale a " + (euros*129.852) + " yenes");
                break;
            default:
                System.out.println("¡Not converted!");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor en euros a convertir: ");
        double euros = entrada.nextDouble();
        System.out.println("Conversión de moneda");
        System.out.println("Libras (L)");
        System.out.println("Dolar (D)");
        System.out.println("Yen (Y)");
        System.out.print("Ingrese la letra según la moneda a convertir (L, D o Y): ");
        String opcion = entrada.next();
        switch(opcion.toLowerCase()){
            case "l":
                convertirEuros(euros,"l");
                break;
            case "d":
                convertirEuros(euros,"d");
                break;
            case "y":
                convertirEuros(euros,"y");
                break;
            default:
                convertirEuros(euros,opcion.toLowerCase());
        }
    }

}
