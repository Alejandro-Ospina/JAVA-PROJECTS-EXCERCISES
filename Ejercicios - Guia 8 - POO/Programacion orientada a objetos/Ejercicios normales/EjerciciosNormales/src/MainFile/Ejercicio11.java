
package MainFile;

//  @author new53

import java.util.Date;
import java.util.Scanner;


public class Ejercicio11 {    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Date actualDate = new Date();
        System.out.print("Ingrese el año: ");
        int year = entrada.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = entrada.nextInt();
        System.out.print("Ingrese el día: ");
        int dia = entrada.nextInt();
        Date date = new Date(year-1900, mes, dia);
        
        System.out.println("\n" + date.toLocaleString());
        System.out.println("Diferencia en años: " + (actualDate.getYear() - (date.getYear())));
    }
}
