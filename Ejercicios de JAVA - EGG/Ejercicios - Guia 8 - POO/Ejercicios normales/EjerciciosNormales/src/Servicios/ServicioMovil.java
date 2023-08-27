
package Servicios;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;


// @author new53
/**
* El constructor vacío se encarga de crear los objetos de la clase entidad
* "Movil"
*/
public class ServicioMovil {
    private Scanner entrada = new Scanner(System.in);
    private Movil objeto = new Movil();
    
    
    public ServicioMovil(){
        cargarCelular();
    }
    
    /**
     * El método cargar celular es privado, y solo se accede desde el constructor
     * vacío de la clase servicio. Se encarga de crear el objeto de la clase 
     * entidad: "Movil"
     */
    private void cargarCelular(){
        System.out.print("Ingrese la marca del celular: ");
        objeto.setMarca(entrada.nextLine());
        System.out.print("Ingrese el modelo del celular: ");
        objeto.setModelo(entrada.nextLine());
        System.out.print("Ingrese el precio del celular (USD): ");
        objeto.setPrecio(entrada.nextInt());
        System.out.print("Ingrese la memoria RAM del celular (Gb): ");
        objeto.setMemoriaRAM(entrada.nextInt());
        System.out.print("Ingrese el almacenamiento del celular (Gb): ");
        objeto.setAlmacenamiento(entrada.nextInt());
        System.out.println("\nA continuación, cargue el código del celular");
        objeto.setCodigo(ingresarCodigo());
        entrada.nextLine();
    }
    
    /**
     * El método se encarga de crear un vector de enteros, con tamaño de 7, que
     * será pasado como parámetro al atributo: código, de la clase entidad: "Movil".
     *  El método es privado, por lo cual solo se invoca en el contructor vacío.
     * @return vector de enteros de tamaño 7.
     */
    private int[] ingresarCodigo(){
        int[] codigo = new int[7];       
        for(int i=0; i<codigo.length; i++){
            System.out.print("Ingresa el numero " + (i+1) + " del código: ");
            codigo[i] = entrada.nextInt();
        }
        return codigo;
    }
    
    /**
     * Método que se encarga de mostrar la información del objeto creado de la clase 
     * entidad "Móvil", por medio de la clase servicio.
     */
    public void movilInfo(){
        System.out.println("\nDATOS DEL CEULAR" + 
                           "\nMarca: " + objeto.getMarca() + 
                           "\nModelo: " + objeto.getModelo() + 
                           "\nAlmacenamiento: " + objeto.getAlmacenamiento() + 
                           "\nMemoria RAM: " + objeto.getMemoriaRAM() + 
                           "\nPrecio: " + objeto.getPrecio() + 
                           "\nCódigo: " + Arrays.toString(objeto.getCodigo()));
    }
}