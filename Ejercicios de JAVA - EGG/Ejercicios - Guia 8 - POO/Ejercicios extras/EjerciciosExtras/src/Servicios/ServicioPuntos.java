
package Servicios;

import Entidades.Puntos;
import java.util.Scanner;


// @author new53
 
public class ServicioPuntos {
    private final Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    private Puntos punto;
    
    public ServicioPuntos(){
        crearPuntos();
    }
    
    public ServicioPuntos(double X1, double X2, double Y1, double Y2){
        punto = new Puntos(X1, X2, Y1, Y2);
    }
    
    private void crearPuntos(){
        punto = new Puntos();
        System.out.println("PUNTO 1");
        System.out.print("Ingrese el valor de la coordenada X1: ");
        punto.setX1(entrada.nextDouble());
        System.out.print("Ingrese el valor de la coordenada Y1: ");
        punto.setY1(entrada.nextDouble());
        System.out.println("\nPUNTO 2");
        System.out.print("Ingrese el valor de la coordenada X2: ");
        punto.setX2(entrada.nextDouble());
        System.out.print("Ingrese el valor de la coordenada Y2: ");
        punto.setY2(entrada.nextDouble());
    }
    
    public double calcularDistanciaE(){
        return Math.sqrt(Math.pow((punto.getX1()-punto.getX2()), 2) + 
                Math.pow((punto.getY1()-punto.getY2()), 2));
    }
}