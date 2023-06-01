
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general. */
public class EjercicioE6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        System.out.print("Ingrese la cantidad de personas que desea evaluar: ");
        int personas = entrada.nextInt();
        float[] vectorPersonas = new float[personas];       
        for(int i=0; i<personas; i++){
            System.out.print("Ingrese la altura de la persona " + (i+1) + ": ");
            vectorPersonas[i] = entrada.nextFloat();
        }
        promedioEstaturas(vectorPersonas);
    }
    
    public static void promedioEstaturas(float[] personas){
        float sumaGeneral = 0.0f;
        float suma160 = 0.0f;
        int contador160 = 0;
        for(int i=0; i<personas.length; i++){
            if(personas[i] <= 1.60){
                contador160 +=1;
                suma160 += personas[i];
            }
            sumaGeneral += personas[i];
        }
        System.out.println("Promedio de estaturas inferiores a 1.60m: " + (suma160/contador160));
        System.out.println("Promedio general de estaturas: " + (sumaGeneral/personas.length));
    }
}