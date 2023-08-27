
package ejerciciosextrasguia7;
import java.util.*;
//  @author new53
/* Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. */
public class EjercicioE10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        int aleatorio1 = aleatorio.nextInt(10) + 1;
        int aleatorio2 = aleatorio.nextInt(10) + 1;
        int numeroOculto = aleatorio1*aleatorio2;
        int descifrarOculto;
        System.out.print("Intenta descifrar el número oculto. Ingresa un valor: ");
        do{
            descifrarOculto = entrada.nextInt();
            if(descifrarOculto != numeroOculto){
                if(descifrarOculto > numeroOculto){
                    System.out.println("¡El valor ingresado está por encima del número oculto!");
                    System.out.print("Ingresa un valor más pequeño: ");
                }else if(descifrarOculto < numeroOculto){
                    System.out.println("¡El valor ingresado está por debajo del número oculto!");
                    System.out.print("Ingresa un valor más grande: ");
                }
            }
        }while(descifrarOculto != numeroOculto);
        System.out.println("\n¡FELICITACIONES! " + descifrarOculto + " es el número oculto\n");
    }
}