
package ejerciciosextrasguia7;
import java.util.Scanner;
//  @author new53
/* Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso. */
public class EjercicioE21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[][] tiposTrabajo = {{"primer trabajo práctico evaluativo", "0.1"},
                                   {"segundo trabajo práctico evaluativo", "0.15"},
                                   {"primer integrador", "0.25"},
                                   {"segundo integrador", "0.50"}};
        double[][] matrizNotas = new double[10][tiposTrabajo.length+1];
        double ponderacionNota = 0.0d;
        double promedio;
        int aprobados = 0;
        int noAprobados = 0;
        for(int i=0; i<matrizNotas.length; i++){
            promedio = 0.0d;
            for(int j=0; j<tiposTrabajo.length; j++){
                System.out.print("Ingrese la nota del " + tiposTrabajo[j][0] + " del alumno " + (i+1) + ": ");
                matrizNotas[i][j] = entrada.nextInt();
                ponderacionNota = (Double.parseDouble(tiposTrabajo[j][1]))*matrizNotas[i][j];
                promedio += ponderacionNota;               
            }           
            if(matrizNotas[i][tiposTrabajo.length] >= 7){
                aprobados ++;
            }else{
                noAprobados ++;
            }
        }       
        System.out.println("\nAprobados: " + aprobados + "\nNo aprobados: " + noAprobados);
    }
}