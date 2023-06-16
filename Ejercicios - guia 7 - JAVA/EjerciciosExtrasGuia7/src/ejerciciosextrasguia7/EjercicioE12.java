
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. */
public class EjercicioE12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numero = "";
        while(true){
            System.out.print("Ingrese por favor la lectura del contador (ejm: 000): ");
            do{
                numero = Integer.toString(entrada.nextInt());                
                if(numero.length() != 3){
                    System.out.print("LECTURA NO VÁLIDA \nIngrese un valor nuevo de lectura: ");
                }            
            }while(numero.length() != 3);
            numero = numero.contains("3") ? numero.replace("3","E") : numero;
            System.out.print("\nLectura del contador: " + numero.substring(0,1) + "-" + numero.substring(1,2) + "-" + numero.substring(2,3));            
            System.out.println("\n");
            System.out.print("Desea continuar ingresando lecturas de contador (S/N): ");
            String respuesta = entrada.nextLine();
            if(respuesta.toLowerCase().equals("n")){
                break;
            }
        }
    }
}