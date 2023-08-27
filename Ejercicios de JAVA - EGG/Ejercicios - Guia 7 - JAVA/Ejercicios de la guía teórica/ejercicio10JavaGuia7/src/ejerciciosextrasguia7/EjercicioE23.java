
package ejerciciosextrasguia7;
import java.util.*;
/* Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada. */
//  @author new53
public class EjercicioE23 {
    
    public static String[][] crearSopaLetras(String[] vectorPalabras){
        String[][] sopaLetras = new String[20][20];
        List<Integer> filaAleatoria = new ArrayList<>();
        Random aleatoria = new Random();      
        for(int a=0; a<vectorPalabras.length; a++){
            do{
                filaAleatoria.add(aleatoria.nextInt(20));
            }while(!filaAleatoria.contains(aleatoria.nextInt(20)));
        }
        for(int i=0, j=0; i<vectorPalabras.length & j<filaAleatoria.size(); i++, j++){           
            for(int k=0; k<vectorPalabras[i].length(); k++){
                sopaLetras[filaAleatoria.get(j)][k] = vectorPalabras[i].substring(k,k+1);
            }
        } 
        return sopaLetras;
    }
    
    public static void llenarSopaLetras(String[][] sopaLetras){
        Random aleatorio = new Random();
        for(int i=0; i<sopaLetras.length; i++){
            for(int j=0; j<sopaLetras[i].length; j++){
                if(Objects.isNull(sopaLetras[i][j])){
                    sopaLetras[i][j] = String.valueOf(aleatorio.nextInt(9));                    
                } 
            System.out.print(sopaLetras[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vectorPalabras = new String[5];
        for(int i=0; i<vectorPalabras.length; i++){
            do{
                System.out.print("Ingrese la palabra " + (i+1) + " a la sopa de letras: ");
                vectorPalabras[i] = entrada.next();
                if(vectorPalabras[i].length()<3 || vectorPalabras[i].length()>5){
                    System.out.println("¡Longitud de palabra no se encuentra entre 3 y 5!");
                }
            }while(vectorPalabras[i].length()<3 || vectorPalabras[i].length()>5);           
        }
        llenarSopaLetras(crearSopaLetras(vectorPalabras));
    }
}