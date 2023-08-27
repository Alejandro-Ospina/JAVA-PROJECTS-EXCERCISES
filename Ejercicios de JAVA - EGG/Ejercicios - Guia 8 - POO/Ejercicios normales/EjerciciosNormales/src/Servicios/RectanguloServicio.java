
package Servicios;

import Entidad.Rectangulo;
import java.util.Scanner;


// @author new53
 
public class RectanguloServicio {
    
    private Scanner entrada = new Scanner(System.in);
    
    /**
     * Método que asigna valores a la base y altura del rectángulo
     * @return rectangulo
     */
    public Rectangulo crearRectangulo(){
        Rectangulo rectangulo = new Rectangulo();
        System.out.print("Ingrese la base del rectángulo: ");
        rectangulo.setBase(entrada.nextDouble());
        System.out.print("Ingrese la altura del rectángulo: ");
        rectangulo.setAltura(entrada.nextDouble());
        return rectangulo;
    }
    
    /**
     * Método que calcula el área del rectángulo, y recibe como parámetro un objeto
     * @param rectangulo
     * @return area del rectangulo
     */
    public double calcularSuperficie(Rectangulo rectangulo){
        return rectangulo.getBase()*rectangulo.getAltura();
    }
    
    /**
     * Método que calcula el perímetro de un rectángulo, y recibe como parámetro un objeto
     * @param rectangulo
     * @return perimetro del rectángulo
     */
    public double calcularPerimetro(Rectangulo rectangulo){
        return (2*rectangulo.getAltura() + 2*rectangulo.getBase());
    }
    
    /**
     * Método que dibuja un rectángulo según las condiciones del usuario, y recibe como parámetro un objeto
     * @param rectangulo 
     */
    public void dibujarRectangulo(Rectangulo rectangulo){
        for(int i=0; i<rectangulo.getAltura(); i++){
            for(int j=0; j<rectangulo.getBase(); j++){
                System.out.print("*" + "  ");
            }
            System.out.println("");
        }
    }
    
}
