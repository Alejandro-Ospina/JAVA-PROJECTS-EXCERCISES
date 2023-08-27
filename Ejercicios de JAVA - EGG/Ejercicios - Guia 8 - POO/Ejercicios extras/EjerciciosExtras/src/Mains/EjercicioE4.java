
package Mains;

//  @author new53

import Servicios.ServicioNIF;

public class EjercicioE4 {

    public static void main(String[] args) {
        ServicioNIF nif = new ServicioNIF(); // creamos un objeto de la clase NIF, pidiendole al usuario su DNI
        //
        System.out.println("\nDetalles del DNI y NIF del usuario: " + nif.mostrar());
    }

}
