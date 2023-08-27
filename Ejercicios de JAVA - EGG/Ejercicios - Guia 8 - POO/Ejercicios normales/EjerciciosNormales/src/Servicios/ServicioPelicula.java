
package Servicios;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;


// @author new53
 
public class ServicioPelicula {
    private static Scanner entrada = new Scanner(System.in);
    private Pelicula pelicula;
    public static ArrayList<Pelicula> listaPelicula = new ArrayList<>();
    
    public ServicioPelicula(){
        pelicula = crearPelicula();
    }
    
    private Pelicula crearPelicula(){
        pelicula = new Pelicula();
        System.out.print("Ingrese el nombre de la película: ");
        pelicula.setTitulo(entrada.nextLine());
        System.out.print("Ingrese el género de la película: ");
        pelicula.setGenero(entrada.nextLine());
        System.out.print("Ingrese el año de la película: ");
        pelicula.setAnio(entrada.nextInt());
        System.out.print("Ingrese la duración de la película: ");
        pelicula.setDuracion(entrada.nextInt());
        entrada.nextLine();
        listaPelicula.add(pelicula);        
        return pelicula;
    }
    
    public static void listarPeliculas(){        
        System.out.println("Menú de películas");
        for(int i=0; i<listaPelicula.size(); i++){ 
            System.out.println("Pelicula" + (i+1));
            System.out.println(
                    "\nTítulo: " + listaPelicula.get(i).getTitulo() +
                    "\nGénero: " + listaPelicula.get(i).getGenero() + 
                    "\nAño: " + listaPelicula.get(i).getAnio() + 
                    "\nDuración: " + listaPelicula.get(i).getDuracion());
            System.out.println("");
        }
    }
    
    public static boolean buscarPeliculaTitulo(){
        System.out.print("Ingrese el título de la película que desea buscar: ");
        String titulo = entrada.nextLine();
        for(int i=0; i<listaPelicula.size(); i++){ 
            if(titulo.equalsIgnoreCase(listaPelicula.get(i).getTitulo())){
                return true;              
            }                
        }
        return false;
    }
    
    public static boolean buscarPeliculaGenero(){
        System.out.print("Ingrese el género de la película que desea buscar: ");
        String genero = entrada.nextLine();
        for(int i=0; i<listaPelicula.size(); i++){ 
            if(genero.equalsIgnoreCase(listaPelicula.get(i).getGenero())){
                return true;              
            }                
        }
        return false;
    }
}
