
package MainFile;

//  @author new53

import Entidad.Rectangulo;
import Servicios.RectanguloServicio;

public class Ejercicio4 {

    public static void main(String[] args) {
        RectanguloServicio controlRectangulo = new RectanguloServicio();
        Rectangulo objeto = controlRectangulo.crearRectangulo();
        //Calculamos la superficie
        System.out.println("Valor del área: " + controlRectangulo.calcularSuperficie(objeto));
        System.out.println("Valor del perímetro: " + controlRectangulo.calcularPerimetro(objeto) + "\n");
        controlRectangulo.dibujarRectangulo(objeto);                
    }
}
