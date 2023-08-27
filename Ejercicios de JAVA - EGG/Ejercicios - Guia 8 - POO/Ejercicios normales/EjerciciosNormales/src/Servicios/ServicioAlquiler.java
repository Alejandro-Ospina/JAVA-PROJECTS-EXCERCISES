
package Servicios;

import Entidad.Alquiler;
import Servicios.ServicioPelicula;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.Scanner;


// @author new53
 
public class ServicioAlquiler {
    private static Scanner entrada = new Scanner(System.in);
    private Alquiler alquiler;
    private static ArrayList<Alquiler> listaAlquileres = new ArrayList<>();
    
    public ServicioAlquiler(){
        alquiler = crearAlquiler();
    }
    
    private Alquiler crearAlquiler(){
        alquiler = new Alquiler();
        System.out.print("Ingrese el nombre de la película que desea alquilar: ");
        int i = 0;
        String nombrePeli = "";
        do{
            nombrePeli = entrada.nextLine();
            if(nombrePeli.equalsIgnoreCase(ServicioPelicula.listaPelicula.get(i).getTitulo())){
                alquiler.setNombrePelicula(ServicioPelicula.listaPelicula.get(i).getTitulo());
                break;
            }else if(i==ServicioPelicula.listaPelicula.size()-1 && 
                    !nombrePeli.equalsIgnoreCase(ServicioPelicula.listaPelicula.get(ServicioPelicula.listaPelicula.size()-1).getTitulo())){
                System.out.println("¡La película no se encuentra en el inventario!");                
                System.out.print("Intenta un nombre nuevo: ");
                i = -1;
            }
            i++;
        }while(!nombrePeli.equalsIgnoreCase(ServicioPelicula.listaPelicula.get(i).getTitulo()));
        System.out.print("Ingrese la fecha en la que desea alquilar la película (AAAA-MM-DD): ");
        String fechaIn = entrada.nextLine();
        alquiler.setFechaInicio(LocalDate.parse(fechaIn));
        System.out.print("Ingrese la fecha en la que desea devolver la película (AAAA-MM-DD): ");
        String fechaF = entrada.nextLine();
        alquiler.setFechaFin(LocalDate.parse(fechaF));              
        listaAlquileres.add(alquiler);
        return alquiler;
    }
    
    public static void listarAlquiler(){ 
        double costoAlquiler;
        long diasAlquiler;
        System.out.println("Lista de Alquileres");
        for(int i=0; i<listaAlquileres.size(); i++){
            diasAlquiler = DAYS.between(listaAlquileres.get(i).getFechaInicio(),listaAlquileres.get(i).getFechaFin());
            costoAlquiler = diasAlquiler > 3 ? (listaAlquileres.get(i).getPrecio()+(diasAlquiler-3)*0.1) : listaAlquileres.get(i).getPrecio();
            System.out.println("Alquiler película" + (i+1));
            System.out.println(
                    "\nTítulo película: " + listaAlquileres.get(i).getNombrePelicula()+
                    "\nFecha de inicio: " + listaAlquileres.get(i).getFechaInicio()+ 
                    "\nFecha de devolución: " + listaAlquileres.get(i).getFechaFin() + 
                    "\nPrecio ($10/3 días): " + costoAlquiler);
            System.out.println("");
        }
    }
    
    public static void buscarAlquilerFecha(){
        System.out.print("Ingrese la fecha por alquiler que desea buscar (AAAA-MM-DD): ");
        String fecha = entrada.nextLine();
        boolean flag = false;
        for(int i=0; i<listaAlquileres.size(); i++){ 
            if(fecha.equalsIgnoreCase(listaAlquileres.get(i).getFechaInicio().toString())
                    || fecha.equalsIgnoreCase(listaAlquileres.get(i).getFechaFin().toString())){
                flag = true;               
                System.out.println(
                    "\nTítulo película: " + listaAlquileres.get(i).getNombrePelicula()+
                    "\nFecha de inicio: " + listaAlquileres.get(i).getFechaInicio()+ 
                    "\nFecha de devolución: " + listaAlquileres.get(i).getFechaFin());
                 System.out.println("");            
            }                
        }
        if(!flag){
            System.out.println("No se encontró alquiler en la fecha dada");
        }      
    }
}