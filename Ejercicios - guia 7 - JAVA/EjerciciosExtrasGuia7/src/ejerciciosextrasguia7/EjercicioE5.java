
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
public class EjercicioE5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una clase de socio: ");
        String claseSocio = entrada.next().toLowerCase(); 
        System.out.print("Ingrese el costo del tratamiento sin descuento: $");
        int costo = entrada.nextInt();
        float costoTratamiento = costo;
        switch(claseSocio){
            case "a":
                System.out.println("Importe a pagar por el socio " + claseSocio.toUpperCase() + ": $" + (costoTratamiento*0.5));
                break;
            case "b":
                System.out.println("Importe a pagar por el socio " + claseSocio.toUpperCase() + ": $" + (costoTratamiento*0.65));
                break;
            case "c":
                System.out.println("Importe a pagar por el socio " + claseSocio.toUpperCase() + ": $" + costoTratamiento);
                break;
            default:
                System.out.println("Socio no reconocido");    
        }
    }
}
