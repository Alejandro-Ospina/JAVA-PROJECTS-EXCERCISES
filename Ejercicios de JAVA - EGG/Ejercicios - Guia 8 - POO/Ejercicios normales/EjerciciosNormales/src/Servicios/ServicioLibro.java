
package Servicios;

import Entidad.Libro;
import java.util.Scanner;


// @author new53
 
public class ServicioLibro {
    private final Scanner entrada = new Scanner(System.in);
    private static Libro objeto = new Libro();
    
    public ServicioLibro(){
        cargarLibro();
    }
    
    private void cargarLibro(){
        System.out.print("Ingrese el autor del libro: ");
        objeto.setAutor(entrada.nextLine());
        System.out.print("Ingrese el título del libro: ");
        objeto.setTitulo(entrada.nextLine());
        System.out.print("Ingrese el número de páginas del libro: ");
        objeto.setNumeroPaginas(entrada.nextInt());
        System.out.print("Ingrese el ISBN: ");
        objeto.setISBN(entrada.nextInt());
    }
    
    public static void getInfoLibro(){
        System.out.println("Nombre del autor: " + objeto.getAutor() +
                           "\nTítulo del libro: " + objeto.getTitulo() +
                           "\nNúmero de páginas del libro: " + objeto.getNumeroPaginas() +
                           "\nISBN: " + objeto.getISBN());
    }
}
