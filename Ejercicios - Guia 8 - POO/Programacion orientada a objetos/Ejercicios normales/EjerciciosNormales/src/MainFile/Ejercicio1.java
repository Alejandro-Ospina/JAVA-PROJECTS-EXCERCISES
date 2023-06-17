
package MainFile;
import Entidad.Libro;
import java.util.Scanner;
//  @author new53
/* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Libro objetoLibro = new Libro();
        System.out.print("Ingrese el autor del libro: ");
        String autor = entrada.nextLine();
        System.out.print("Ingrese el título del libro: ");
        String titulo = entrada.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        int paginas = entrada.nextInt();
        System.out.print("Ingrese el ISBN: ");
        int isbn = entrada.nextInt();
        
        // llamamos el método de cargar libro
        objetoLibro.cargarLibro(autor, titulo, paginas, isbn);
        // mostramos los datos
        System.out.println("");
        objetoLibro.getInfoLibro();
    }
}
