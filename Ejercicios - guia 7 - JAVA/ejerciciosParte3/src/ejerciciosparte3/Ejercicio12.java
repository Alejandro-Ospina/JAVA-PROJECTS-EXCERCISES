
package ejerciciosparte3;
import java.util.Scanner;
//  @author new53
/* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroCadenas;
        do {
            System.out.print("Ingrese el número de cadenas a enviar: ");
            numeroCadenas = entrada.nextInt();
            if (numeroCadenas<=0){
                System.out.println("¡Valor no válido!");
            }
        } while(numeroCadenas <= 0);
        int lecturasCorrectas = 0;
        for (int i=1; i<=numeroCadenas; i++){
            System.out.print("Ingrese la secuencia de caracter " + i + " :");            
            String secuencia = entrada.next();
            if (secuencia.length() == 5 && secuencia.toLowerCase().substring(0,1).equals("x") && secuencia.toLowerCase().substring(4,5).equals("o")){
                lecturasCorrectas += 1;
            }else {
                
            }
        }
        System.out.println("Informe de lecturas");
        System.out.println("Lecturas FDE correctas: " + lecturasCorrectas);
        System.out.println("Lecturas FDE incorrectas: " + (numeroCadenas - lecturasCorrectas));
    }
}
