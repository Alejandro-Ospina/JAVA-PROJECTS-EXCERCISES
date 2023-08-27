
package MainFile;

//  @author new53

import Servicios.ServicioAlquiler;
import Servicios.ServicioPelicula;
import java.util.Scanner;


public class ActividadCooperativa3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menú de opciones para alquiler de películas");
        System.out.println(
                "1. Cargar Película\n" +
                "2. Listar películas disponibles\n" + 
                "3. Alquilar película\n" + 
                "4. Listar Alquileres\n" +
                "5. Buscar película por título\n" + 
                "6. Buscar película por género\n" + 
                "7. Buscar alquiler por fecha \n" +
                "8. Salir\n");
        int opcion;
        boolean iterador = true;
        do{
            System.out.print("\nIngrese una opción: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    ServicioPelicula obj = new ServicioPelicula();
                    break;
                case 2:
                    ServicioPelicula.listarPeliculas();
                    break;
                case 3:
                    entrada.nextLine();
                    ServicioAlquiler obj2 = new ServicioAlquiler();
                    break;
                case 4:
                    ServicioAlquiler.listarAlquiler();
                    break;
                case 5:
                    String disponiblidad = 
                            ServicioPelicula.buscarPeliculaTitulo() ? "Disponible" :
                            "No disponible";
                    System.out.println(disponiblidad);
                    break;
                case 6:
                    String disponiblidadG = 
                            ServicioPelicula.buscarPeliculaGenero() ? "Disponible" :
                            "No disponible";
                    System.out.println(disponiblidadG);
                    break;
                case 7:
                    ServicioAlquiler.buscarAlquilerFecha();
                    break;
                case 8:
                    System.out.println("Hasta pronto!!");
                    iterador = false;
                    break;
                default:
                    System.out.println("\n¡Opción inválida!");
                    break;
            }
        }while(iterador);
    }
}