
package Servicios;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;


// @author new53
 
public class ServicioCurso {
    private final Scanner entrada = new Scanner(System.in, "ISO-8859-1");   
    
    private String[] cargarAlumnos(){
        String[] alum = new String[5];
        for(int i=0; i<alum.length; i++){
            System.out.print("Ingrese el nombre del alumno " + (i+1) + ": ");
            alum[i] = entrada.nextLine();
        }     
        return alum;
    }
    
    public Curso crearCurso(){
        System.out.print("Ingresa el nombre del curso: ");
        String curso = entrada.nextLine();
        System.out.print("Ingresa la cantidad de horas por día: ");
        int horasDia = entrada.nextInt();
        System.out.print("Ingresa la cantidad de días por semana: ");
        int diasSemana = entrada.nextInt();
        entrada.nextLine();
        String turno = "";
        System.out.print("Ingrese el turno: ");
        do{
            turno = entrada.nextLine();
            if(!"mañana".equalsIgnoreCase(turno) && !"tarde".equalsIgnoreCase(turno)){
                System.out.print("Turno no válido. Inténtalo de nuevo: ");
            }
        }while(!"mañana".equalsIgnoreCase(turno) && !"tarde".equalsIgnoreCase(turno));
        System.out.print("Ingrese el precio por hora: ");
        double precio = entrada.nextDouble();
        entrada.nextLine();
        System.out.println("");
        String[] alumnos = cargarAlumnos();
        return new Curso(curso, horasDia, diasSemana, turno, precio, alumnos);
    }
    
    public static double calcularGananciaSemana(Curso objeto){
        return ((double)(objeto.getPrecioPorHora()*objeto.getCantidadHorasPorDia()
                *objeto.getCantidadDiasPorSemana()*objeto.getAlumnos().length));
    }
    
    public static void detalleCurso(Curso objeto){
        System.out.println("\nDETALLES DEL CURSO");
        System.out.println("Nombre del curso: " + objeto.getNombreCurso() + 
                           "\nCantidad de horas por día: " + objeto.getCantidadHorasPorDia() +
                           "\nCantidad de días por semana: " + objeto.getCantidadDiasPorSemana() + 
                           "\nTurno: " + objeto.getTurno() + 
                           "\nPrecio por hora: " + objeto.getPrecioPorHora() + 
                           "\nAlumnos: " + Arrays.toString(objeto.getAlumnos()));
    }
}
