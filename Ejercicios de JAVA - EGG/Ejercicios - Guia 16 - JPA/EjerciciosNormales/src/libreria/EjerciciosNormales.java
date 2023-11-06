
package libreria;

//  @author new53

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import libreria.entities.Autor;
import libreria.entities.Editorial;
import libreria.entities.Libro;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;
import libreria.servicios.exceptions.LibreriaExcepciones;

public class EjerciciosNormales {

    public static void main(String[] args) {
        System.out.println("Menú de persistencia en base de datos 'Libreria'\n"
                + "A continuación se muestran las opciones que puede usar...\n"
                + "\n1. Agregar registro de Libro, Editorial o Autor"
                + "\n2. Actualizar registro (Libro, Editorial o Autor)"
                + "\n3. Eliminar registro de (Libro, Editorial o Autor)"
                + "\n4. Buscar autor por nombre"
                + "\n5. Buscar libro por ISBN"
                + "\n6. Buscar libro por título"
                + "\n7. Buscar libro por nombre de autor"
                + "\n8. Buscar libro por nombre de editorial"
                + "\n9. Salir\n");
        boolean repetir = true;
        do{
            System.out.print("Ingrese una opción: ");
            int opcion;
            try{
                opcion = new Scanner(System.in).nextInt(); 
                switch(opcion){
                    case 1:
                        System.out.println("¿Qué registro deseas agregar?"
                                + "\n1. Libro"
                                + "\n2. Editorial"
                                + "\n3. Autor\n");                    
                        try{
                            System.out.print("Digita una opción: ");
                            int op = new Scanner(System.in).useDelimiter("\n").nextInt();
                            switch(op){
                                case 1:
                                    System.out.println("Se agregará un registro de libro, editorial y autor a la base de datos libreria");
                                    System.out.println("Agregando libro a la base de datos...");
                                    System.out.print("Título del libro: ");
                                    String nombre = new Scanner(System.in).useDelimiter("\n").nextLine();
                                    System.out.print("Año del libro: ");
                                    int anio = new Scanner(System.in).useDelimiter("\n").nextInt();
                                    System.out.print("Ejemplares prestados del libro: ");
                                    int ejemplaresPrestados = new Scanner(System.in).useDelimiter("\n").nextInt();
                                    System.out.print("Ejemplares restantes del libro: ");
                                    int ejemplaresRestantes = new Scanner(System.in).useDelimiter("\n").nextInt();
                                    int ejemplaresTotales = ejemplaresPrestados + ejemplaresRestantes;
                                    System.out.print("¿Está dado de alta el libro?: ");
                                    boolean alta = new Scanner(System.in).useDelimiter("\n").nextBoolean();
                                    System.out.print("Nombre del autor: ");
                                    String nombreAutor = new Scanner(System.in).useDelimiter("\n").nextLine();
                                    System.out.print("¿Está dado de alta el autor?: ");
                                    boolean altaAutor = new Scanner(System.in).useDelimiter("\n").nextBoolean();
                                    System.out.print("Nombre de la editorial: ");
                                    String nombreEditorial = new Scanner(System.in).useDelimiter("\n").nextLine();
                                    System.out.print("¿Está dada de alta la editorial?: ");
                                    boolean altaEditorial = new Scanner(System.in).useDelimiter("\n").nextBoolean();
                                    new LibroService().crearLibro(new Libro(nombre, 
                                    anio, ejemplaresTotales, ejemplaresPrestados, ejemplaresRestantes, alta,
                                    new Autor(nombreAutor, altaAutor), new Editorial(nombreEditorial, altaEditorial)));
                                    break;
                                case 2:
                                    System.out.println("Agregando editorial a la base de datos...");
                                    System.out.print("Nombre de la editorial: ");
                                    String nombreEditorial1 = new Scanner(System.in).useDelimiter("\n").nextLine();
                                    System.out.print("¿Está dada de alta la editorial?: ");
                                    boolean altaEditorial1 = new Scanner(System.in).useDelimiter("\n").nextBoolean();
                                    new EditorialService().crearEditorial(new Editorial(nombreEditorial1, altaEditorial1));
                                    break;
                                case 3:
                                    System.out.println("Agregando editorial a la base de datos...");
                                    System.out.print("Nombre del autor: ");
                                    String nombreAutor1 = new Scanner(System.in).useDelimiter("\n").nextLine();
                                    System.out.print("¿Está dado de alta el autor?: ");
                                    boolean altaAutor1 = new Scanner(System.in).useDelimiter("\n").nextBoolean();
                                    new AutorService().crearAutor(new Autor(nombreAutor1, altaAutor1));
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                                    break;
                            }
                        }catch(InputMismatchException | LibreriaExcepciones.EntidadNoCreada ex){
                            System.out.println("Error: " + ex.getMessage() + ""
                                    + "\nPila: " + Arrays.toString(ex.getStackTrace()));
                        }         
                        break;
                    case 2:
                        System.out.println("¿Qué registro deseas actualizar?"
                                + "\n1. Libro"
                                + "\n2. Editorial"
                                + "\n3. Autor\n");                    
                        try{
                            System.out.print("Digita una opción: ");
                            int op = new Scanner(System.in).useDelimiter("\n").nextInt();
                            switch(op){
                                case 1:
                                    Libro libro = new Libro();
                                    System.out.print("Ingrese el ISBN del libro que desea editar: ");
                                    libro.setIsbn(new Scanner(System.in).useDelimiter("\n")
                                            .nextInt());  
                                    System.out.print("Título del libro: ");
                                    String nombre = new Scanner(System.in).useDelimiter("\n").nextLine();
                                    libro.setTitulo(nombre);
                                    System.out.print("Año del libro: ");
                                    libro.setAnio(new Scanner(System.in).useDelimiter("\n").nextInt());
                                    System.out.print("Ejemplares prestados del libro: ");
                                    libro.setEjemplaresPrestados(new Scanner(System.in).useDelimiter("\n").nextInt());
                                    System.out.print("Ejemplares restantes del libro: ");
                                    libro.setEjemplaresRestantes(new Scanner(System.in).useDelimiter("\n").nextInt());
                                    libro.setEjemplares(libro.getEjemplaresPrestados() + libro.getEjemplaresRestantes());
                                    System.out.print("¿Está dado de alta el libro?: ");
                                    libro.setAlta(new Scanner(System.in).useDelimiter("\n").nextBoolean());
                                    System.out.print("Nombre del autor: ");
                                    String nombreAutor = new Scanner(System.in).useDelimiter("\n").nextLine();
                                    System.out.print("¿Está dado de alta el autor?: ");        
                                    boolean altaAutor = new Scanner(System.in).useDelimiter("\n").nextBoolean();
                                    libro.setAutor(new Autor(nombreAutor, altaAutor));
                                    System.out.print("Nombre de la editorial: ");
                                    String nombreEditorial = new Scanner(System.in).useDelimiter("\n").nextLine();
                                    System.out.print("¿Está dada de alta la editorial?: ");
                                    boolean altaEditorial = new Scanner(System.in).useDelimiter("\n").nextBoolean();
                                    libro.setEditorial(new Editorial(nombreEditorial, altaEditorial));
                                    new LibroService().actualizarLibro(libro);
                                    break;
                                case 2:
                                    Editorial editorial = new Editorial();
                                    System.out.print("Ingrese el id de la editorial que desea editar: ");
                                    editorial.setId(new Scanner(System.in).useDelimiter("\n")
                                            .nextInt());
                                    System.out.print("Nombre de la editorial: ");
                                    editorial.setNombre(new Scanner(System.in).useDelimiter("\n").nextLine());
                                    System.out.print("¿Está dada de alta la editorial?: ");
                                    editorial.setAlta(new Scanner(System.in).useDelimiter("\n").nextBoolean());
                                    new EditorialService().actualizarEditorial(editorial);
                                    break;
                                case 3:
                                    Autor autor = new Autor();
                                    System.out.print("Ingrese el id del Autor que desea editar: ");
                                    autor.setId(new Scanner(System.in).useDelimiter("\n")
                                            .nextInt());
                                    System.out.print("Nombre del autor: ");
                                    autor.setNombre(new Scanner(System.in).useDelimiter("\n").nextLine());
                                    System.out.print("¿Está dado de alta el autor?: ");
                                    autor.setAlta(new Scanner(System.in).useDelimiter("\n").nextBoolean());
                                    new AutorService().actualizarAutor(autor);
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                                    break;
                            }
                        }catch(InputMismatchException | LibreriaExcepciones.EntidadNoEncontrada ex){
                            System.out.println("Error: " + ex.getMessage() + ""
                                    + "\nPila: " + Arrays.toString(ex.getStackTrace()));
                        }                       
                        break;
                    case 3:
                        System.out.println("¿Qué registro deseas eliminar?"
                                + "\n1. Libro"
                                + "\n2. Editorial"
                                + "\n3. Autor\n");                    
                        try{
                            System.out.print("Digita una opción: ");
                            int op = new Scanner(System.in).useDelimiter("\n").nextInt();
                            switch(op){
                                case 1:                                   
                                    System.out.print("Ingrese el ISBN del libro que desea eliminar: ");
                                    int isbn = new Scanner(System.in).useDelimiter("\n")
                                            .nextInt();                                 
                                    new LibroService().eliminarLibro(isbn);
                                    break;
                                case 2:
                                    System.out.print("Ingrese el id de la editorial que desea eliminar: ");
                                    int idE = new Scanner(System.in).useDelimiter("\n")
                                            .nextInt();
                                    new EditorialService().eliminarEditorial(idE);
                                    break;
                                case 3:
                                    System.out.print("Ingrese el id del Autor que desea editar: ");
                                    int idA = new Scanner(System.in).useDelimiter("\n")
                                            .nextInt();
                                    new AutorService().eliminarAutor(idA);
                                    break;
                                default:
                                    System.out.println("Opción no válida");
                                    break;
                            }
                        }catch(InputMismatchException | LibreriaExcepciones.EntidadNoEncontrada ex){
                            System.out.println("Error: " + ex.getMessage() + ""
                                    + "\nPila: " + Arrays.toString(ex.getStackTrace()));
                        }
                        break;
                    case 4:
                        System.out.print("Ingrese el nombre del autor: ");
                        String nombre = new Scanner(System.in).useDelimiter("\n")
                                            .nextLine();
                        System.out.println("Lista...\n" + new AutorService().consultaAutorNombre(nombre));
                        break;
                    case 5:
                        System.out.print("Ingrese el ISBN del libro: ");
                        int isbn = new Scanner(System.in).useDelimiter("\n")
                                            .nextInt();
                        System.out.println("Lista...\n" + new LibroService().consultarLibroISBN(isbn));
                        break;
                    case 6:
                        System.out.print("Ingrese el ISBN del libro: ");
                        String titulo = new Scanner(System.in).useDelimiter("\n")
                                            .nextLine();
                        System.out.println("Lista...\n" + new LibroService().consultarLibroTitulo(titulo));
                        break;
                    case 7:
                        System.out.print("Ingrese el nombre del autor: ");
                        String nombreA = new Scanner(System.in).useDelimiter("\n")
                                            .nextLine();
                        System.out.println("Lista...\n" + new LibroService().consultarLibroAutor(nombreA));
                        break;
                    case 8:
                        System.out.print("Ingrese el ISBN del libro: ");
                        String nombreE = new Scanner(System.in).useDelimiter("\n")
                                            .nextLine();
                        System.out.println("Lista...\n" + new LibroService().consultarLibroEditorial(nombreE));
                        break;
                    case 9:
                        repetir = false;
                        System.out.println("\n¡Proceso finalizado con éxito...!\n");
                        break; 
                    default:
                        System.out.println("\n¡Opción NO válida!\n");
                }
            }catch(InputMismatchException | LibreriaExcepciones.ExcepcionBusqueda ex){
                System.out.println("\nError: " + ex.getMessage());
                System.out.println("Pila: " + Arrays.toString(ex.getStackTrace()) + "\n");
            }finally{
                
            }
                       
        }while(repetir);
    }
}