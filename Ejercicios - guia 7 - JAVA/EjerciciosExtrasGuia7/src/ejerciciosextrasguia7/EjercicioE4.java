
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
public class EjercicioE4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        do{
            System.out.print("Ingrese un número entre 1 y 10: ");
            numero = entrada.nextInt();
            if(numero<1 || numero>10){
                System.out.println("¡RANGO NO VÁLIDO!");
            }
        }while(numero<1 || numero>10);        
        switch(numero){
            case 1:
                System.out.println("Romano de " + numero + " es: I");
                break;
            case 2:
                System.out.println("Romano de " + numero + " es: II");
                break;
            case 3:
                System.out.println("Romano de " + numero + " es: III");
                break;
            case 4:
                System.out.println("Romano de " + numero + " es: IV");
                break;
            case 5:
                System.out.println("Romano de " + numero + " es: V");
                break;
            case 6:
                System.out.println("Romano de " + numero + " es: VI");
                break;
            case 7:
                System.out.println("Romano de " + numero + " es: VII");
                break;
            case 8:
                System.out.println("Romano de " + numero + " es: VIII");
                break;
            case 9:
                System.out.println("Romano de " + numero + " es: IX");
                break;
            case 10:
                System.out.println("Romano de " + numero + " es: X");
                break;    
        }
    }
}
