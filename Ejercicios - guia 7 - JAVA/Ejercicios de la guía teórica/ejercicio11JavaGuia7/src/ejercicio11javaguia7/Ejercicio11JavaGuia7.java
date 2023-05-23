package ejercicio11javaguia7;
import java.util.Scanner;
//  @author new53
public class Ejercicio11JavaGuia7 {

    public static void main(String[] args) {
        Scanner palabraEntrada = new Scanner(System.in);
        System.out.println("Ingrese una frase por teclado");
        String palabra = palabraEntrada.nextLine();
        // Ahora invocamos la frase codificada
        System.out.println("Frase codificada \n" + codificarFrase(palabra));
    }
    
    public static String codificarFrase(String palabra){
        String mensaje = "";
        for (int i=0; i<=palabra.length()-1;i++){
            String letra = palabra.toLowerCase().substring(i,i+1);
            switch (letra) {
                case "a":
                    letra = "@";
                    mensaje = mensaje.concat(letra);
                    break;
                case "e":
                    letra = "#";
                    mensaje = mensaje.concat(letra); 
                    break;
                case "i":
                    letra = "$";
                    mensaje = mensaje.concat(letra);
                    break;
                case "o":
                    letra = "%";
                    mensaje = mensaje.concat(letra);
                    break;
                case "u":
                    letra = "*";
                    mensaje = mensaje.concat(letra);
                    break;
                default:
                    mensaje = mensaje.concat(letra);                    
            }
        }
        return mensaje;
    }
}
