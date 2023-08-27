
package ejerciciosparte3;
import java.util.Scanner;
//  @author new53
/* El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú. */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int opcion;
        boolean salida = false;
        System.out.println("MENÚ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        do {
            System.out.print("Elija una opción: ");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Resultado de la suma: " + (numero1 + numero2));
                    break;
                case 2:
                    if (numero1 < numero2){
                        System.out.println("Resultado de la resta: " + ((numero1 - numero2)*-1));
                    } else {
                        System.out.println("Resultado de la resta: " + (numero1 - numero2));
                    }
                    break;
                case 3:
                    System.out.println("Resultado de la multiplicación: " + (numero1*numero2));
                    break;
                case 4:
                    try {
                        float division = (float) numero1/numero2;
                        System.out.println("Resultado de la división: " + division);
                    } catch (Exception e) {
                        System.out.println("No se puede dividir por cero");
                    }
                    break;
                case 5:
                    System.out.print("¿Estás seguro que desea salir del programa (s/n)?: ");
                    String respuesta = entrada.nextLine(); // no lee esta linea de código
                    String answer = entrada.nextLine(); 
                    if (answer.toLowerCase().equals("s")) {
                        salida = true;
                    }
                    break;
                default:
                    System.out.println("¡OPCIÓN INVÁLIDA!");
                    break;
            }  
        } while (!salida);
    }
}
