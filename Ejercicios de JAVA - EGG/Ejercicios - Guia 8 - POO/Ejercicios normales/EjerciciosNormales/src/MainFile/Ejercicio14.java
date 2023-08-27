
package MainFile;

//  @author new53

import Servicios.ServicioMovil;

public class Ejercicio14 {

    public static void main(String[] args) {
        ServicioMovil celular = new ServicioMovil(); // creamos un objeto de la case movil por medio del servicio
        celular.movilInfo(); //Imprimimos la información del celular
        System.out.println("");
        ServicioMovil celular2 = new ServicioMovil(); // creamos otro objeto de la case movil por medio del servicio
        celular2.movilInfo(); //Imprimimos la información del celular
    }
}