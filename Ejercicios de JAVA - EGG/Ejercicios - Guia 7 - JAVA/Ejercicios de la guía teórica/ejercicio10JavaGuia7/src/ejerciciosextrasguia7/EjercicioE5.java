
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio. */
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
