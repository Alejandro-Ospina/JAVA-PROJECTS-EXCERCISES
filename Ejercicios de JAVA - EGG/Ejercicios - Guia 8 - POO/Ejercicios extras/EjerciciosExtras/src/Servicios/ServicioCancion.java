
package Servicios;

import java.util.Scanner;
import Entidades.Cancion;


// @author new53
 
public class ServicioCancion {
    private final Scanner entrada = new Scanner(System.in).useDelimiter("\n");     
    private Cancion cancion;
    
    public ServicioCancion() {
        cancion = new Cancion();
        System.out.print("Ingrese el título de la canción: ");
        cancion.setTitulo(entrada.nextLine());
        System.out.print("Ingrese el autor de la canción: ");
        cancion.setAutor(entrada.nextLine());
    }
    
    public ServicioCancion(String autor, String titulo){
        cancion = new Cancion(titulo,autor);
    }
        
    public void mostrarCancion(){
        System.out.println("\nDETALLES DE LA CANCIÓN..." + 
                           "\nAutor: " + cancion.getAutor() + 
                           "\nTítulo de la canción: " + cancion.getTitulo());
    }
}