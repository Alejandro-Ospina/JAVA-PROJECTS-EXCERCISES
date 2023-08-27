
package Servicios;

import Entidades.Raices;
import java.util.Scanner;


// @author new53
 
public class ServicioRaices {
    private Scanner entrada = new Scanner(System.in);
    private Raices objeto;
    
    public ServicioRaices(){
        objeto = new Raices();
        System.out.println("PARÁMETROS DE LA ECUACIÓN aX^2 + bX + c = 0");
        System.out.print("Ingrese el valor del coeficiente a: ");
        objeto.setA(entrada.nextDouble());
        System.out.print("Ingrese el valor del coeficiente b: ");
        objeto.setB(entrada.nextDouble());
        System.out.print("Ingrese el valor del coeficiente c: ");
        objeto.setC(entrada.nextDouble());
    }
    
    private double getDiscriminante(){
        return (Math.pow(objeto.getB(),2))-(4*objeto.getA()*objeto.getC());
    }
    
    private boolean tieneRaices(){
        return getDiscriminante() > 0 ? true : false;
    }
    
    private boolean tieneRaiz(){
        return getDiscriminante() == 0 ? true : false;
    }
    
    private void obtenerRaices(){
        if(tieneRaices()){
            System.out.printf("\nRaíz X1: %.3f \nRaiz X2: %.3f\n",
                    ((-objeto.getB() + Math.sqrt(getDiscriminante()))/(2*objeto.getA())), 
                    ((-objeto.getB() - Math.sqrt(getDiscriminante()))/(2*objeto.getA())));
        }
    }
    
    private void obtenerRaiz(){
        if(tieneRaiz()){
            System.out.printf("\nRaíz única: %.3f\n",
                    ((-objeto.getB())/(2*objeto.getA())));
        }
    }
    
    /**
     * Método que se encarga de devolver la o las raíces de un polinomio de grado
     * 2 (ecuación cuadrática).
     */
    public void calcular(){  
        if(tieneRaices()){
            System.out.println("\nRaices de la ecuación cuadrática...");
            obtenerRaices();
        }else if(tieneRaiz()){
            System.out.println("\nRaíz de la ecuación cuadrática...");
            obtenerRaiz();
        }else{
            System.out.println("¡La ecuación cuadrática no tiene raices!");
        }                        
    }
}