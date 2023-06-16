
package holamundo;
import java.util.Scanner;
//  @author new53
public class EjercicioDeteccionError2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        String nombre = leer.nextLine();

        System.out.println("Ingresa tu nombre");
        int edad = leer.nextInt();
    }
}
