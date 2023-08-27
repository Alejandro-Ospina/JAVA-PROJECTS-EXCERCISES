
package Servicio;

import Entidad.Cliente;
import Entidad.Rutina;
import java.util.ArrayList;
import java.util.Scanner;


// @author new53
 
public class RoutineService {
    private static final ArrayList<Rutina> rutina = new ArrayList<>();
    private static final Scanner leer = new Scanner(System.in);

    public RoutineService() {
    }
    
    public static void crearRutina(Rutina rutinax){
        if(rutinax == null){
            System.out.print("Ingrese el id de la rutina: ");
            rutinax.setId(leer.nextLine());       
            System.out.print("Ingrese el nombre de la rutina: ");
            rutinax.setNombre(leer.nextLine());
            System.out.print("Ingrese el nivel de dificultad de la rutina: ");
            rutinax.setNivelDificultad(leer.nextLine());
            System.out.print("Ingrese la descripción de la rutina: ");
            rutinax.setDescripcion(leer.nextLine());
            System.out.print("Ingrese la duración de la rutina: ");
            rutinax.setDuracion(leer.nextInt());
            leer.nextLine();
            rutina.add(rutinax);
            System.out.println("¡Rutina agregada correctamente!");
        }else{
            rutina.add(rutinax);
            System.out.println("¡Rutina agregada correctamente!");
        }       
    }
    
    public static ArrayList<Rutina> obtenerRutinas(){
        return rutina;
    }
    
    public static void actualizarRutina(int id, String nombre, int duracion, 
            String nivelDificultad, String descripcion){
        boolean comprobar = false;
        for(Rutina cli : rutina){
            if(cli.getId().equalsIgnoreCase(Integer.toString(id))){
                rutina.get(rutina.indexOf(cli)).setNombre(nombre);
                rutina.get(rutina.indexOf(cli)).setDuracion(duracion);
                rutina.get(rutina.indexOf(cli)).setNivelDificultad(nivelDificultad);
                rutina.get(rutina.indexOf(cli)).setDescripcion(descripcion);               
                break;
            }
        }
        if(!comprobar){
            System.out.println("¡No se ha actualizado ls rutina!");
        }else{
            System.out.println("¡Rutina actualizada correctamente!");
        }
    }
    
    public static void eliminarRutina(int id){
        boolean comprobar = false;
        for(Rutina cli : rutina){
            if(cli.getId().equalsIgnoreCase(Integer.toString(id))){
                rutina.remove(cli);
                comprobar = true;
                break;
            }
        }
        if(!comprobar){
            System.out.println("¡No se encontró rutina para eliminar");
        }else{
            System.out.println("...¡Rutina eliminada correctamente!");
        }
    }
}