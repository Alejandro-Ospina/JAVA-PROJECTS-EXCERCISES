
package MainFile;

//  @author new53

import Entidad.Arreglo;
import Servicios.ServicioArreglo;
import java.util.Arrays;

public class Ejercicio10 {

    public static void main(String[] args) {
        ServicioArreglo arreglo = new ServicioArreglo();
        Arreglo objeto = arreglo.crearArreglos();
        
        System.out.println("Arreglo A ordenado: \n" + Arrays.toString(ServicioArreglo.ordenarVectorA(objeto)));
        System.out.println("\nVector B modificado: \n" + Arrays.toString(ServicioArreglo.modificarVectorB(objeto)));
    }
}
