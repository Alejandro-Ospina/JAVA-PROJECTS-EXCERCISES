
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas. */
public class EjercicioE1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el tiempo que desea convertir (minutos): ");
        int tiempo = entrada.nextInt();               
        float tiempoHoras = tiempo/60;
        if (tiempoHoras < 0){
            System.out.println(tiempo + " minutos Equivale a: " + 0 + " dias " + " y " + 0 + " horas.");
        }else if(tiempoHoras >= 0 && tiempoHoras<24){
            System.out.println(tiempo + " minutos Equivale a: " + 0 + " dias " + "y " + Math.round(tiempoHoras) + " horas.");
        }else{
            System.out.println(tiempo + " minutos Equivale a: " + Math.floor(tiempoHoras/24) + " dias " + " y " + Math.round(((tiempoHoras/24)-Math.floor(tiempoHoras/24))*24) + " horas.");
        }                 
    }
}
