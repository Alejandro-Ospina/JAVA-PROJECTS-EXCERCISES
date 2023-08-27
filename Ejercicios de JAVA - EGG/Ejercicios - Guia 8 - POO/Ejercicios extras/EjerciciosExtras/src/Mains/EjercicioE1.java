
package Mains;

//  @author new53

import Servicios.ServicioCancion;

public class EjercicioE1 {

    public static void main(String[] args) {
        ServicioCancion objeto1 = new ServicioCancion(); // Se crea un objeto 1 de la calse entidad: Canción
        ServicioCancion objeto2 = new ServicioCancion("Juanes", "La camisa negra"); // Se crea un objeto 2 de la calse entidad: Canción
        
        System.out.println("\nObjeto 1");
        objeto1.mostrarCancion();
        System.out.println("\nObjeto 2");
        objeto2.mostrarCancion();
    }
}
