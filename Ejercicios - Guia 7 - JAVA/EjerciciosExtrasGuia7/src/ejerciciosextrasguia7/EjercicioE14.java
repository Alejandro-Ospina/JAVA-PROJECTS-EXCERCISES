
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias. */
public class EjercicioE14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de familias: ");
        int numeroFamilias = entrada.nextInt();
        int numeroHijos;
        int sumaEdades;
        int edadesHijos;
        for(int i=1; i<=numeroFamilias; i++){
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            numeroHijos = entrada.nextInt();
            sumaEdades = 0;
            for(int j=1; j<=numeroHijos; j++){                
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                edadesHijos = entrada.nextInt();
                sumaEdades += edadesHijos;                
            }
            System.out.println("\nMedia de edad de los hijos de la familia " + i + ": " + ((float)sumaEdades/numeroHijos) + "\n");
        }
    }
}