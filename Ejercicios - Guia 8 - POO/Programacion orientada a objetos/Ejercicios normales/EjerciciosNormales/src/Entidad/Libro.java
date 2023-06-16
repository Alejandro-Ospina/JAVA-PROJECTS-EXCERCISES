
package Entidad;


// @author new53
 
public class Libro {
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public void cargarLibro(String nombreAutor, String tituloLibro, int numeroPaginas, int isbn){
        this.ISBN = isbn;
        this.autor = nombreAutor;
        this.titulo = tituloLibro;
        this.numeroPaginas = numeroPaginas;
    }
    
    public void getInfoLibro(){
        System.out.println("Nombre autor: " + this.autor);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Título libro: " + this.titulo);
        System.out.println("Noúmero de páginas: " + this.numeroPaginas);
    }
}
