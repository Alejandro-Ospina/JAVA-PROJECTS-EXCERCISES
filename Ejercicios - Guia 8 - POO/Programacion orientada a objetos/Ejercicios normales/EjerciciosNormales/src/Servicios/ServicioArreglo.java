
package Servicios;

import Entidad.Arreglo;
import java.util.Arrays;
import java.util.Random;


// @author new53
 
public class ServicioArreglo {
    private Random aleatorio = new Random();
    
    public Arreglo crearArreglos(){
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        for(int i=0; i<vectorA.length; i++){
            vectorA[i] = aleatorio.nextDouble()* (30.0d-1.0d)+1.0d;            
        }
        for(int i=0; i<vectorB.length; i++){
            vectorB[i] = aleatorio.nextDouble()* (20.0d-1.0d)+1.0d;            
        }
        return new Arreglo(vectorA, vectorB);
    }
    
    public static double[] ordenarVectorA(Arreglo objeto){
        Arrays.sort(objeto.getArregloA(),0,objeto.getArregloA().length);
        return objeto.getArregloA();
    }
    
    public static double[] modificarVectorB(Arreglo objeto){       
        System.arraycopy(ordenarVectorA(objeto), 0, objeto.getArregloB(), 0, 10);
        Arrays.fill(objeto.getArregloB(),10,20,0.5d);
        return objeto.getArregloB();
    }
}
