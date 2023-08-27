
package MainFile;

//  @author new53

import Entidad.Matematica;
import Servicios.MatematicaServicio;

public class Ejercicio9 {

    public static void main(String[] args) {
        MatematicaServicio matematica = new MatematicaServicio();
        Matematica matematica1 = matematica.asignarAleatorio();
        Matematica matematica2 = matematica.asignarAleatorio();
        Matematica[] vectorMatematico = {matematica1, matematica2};
        
        for(Matematica vector : vectorMatematico){
            System.out.println("Objeto");
            System.out.println("Mayor valor: " + MatematicaServicio.devolverMayor(vector));
            System.out.println("Potencia: " + MatematicaServicio.calcularPotencia(vector));
            System.out.println("Raíz: " + MatematicaServicio.calculaRaiz(vector));
            System.out.println("");
        }        
    }
}
