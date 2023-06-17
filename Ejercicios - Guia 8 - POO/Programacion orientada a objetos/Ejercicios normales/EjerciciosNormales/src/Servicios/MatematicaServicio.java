
package Servicios;

import Entidad.Matematica;
import java.util.Random;

// @author new53
 
public class MatematicaServicio {
    private Random aleatorio = new Random();
    
    public Matematica asignarAleatorio(){
        double numero1 = aleatorio.nextDouble() * (10.0d-1.0d) + 1.0d;
        double numero2 = aleatorio.nextDouble() * (10.0d-1.0d) + 1.0d;
        return new Matematica(numero1, numero2);
    }
          
    public static double devolverMayor(Matematica objeto){
        return Math.max(objeto.getNumero1(), objeto.getNumero2());
    }
    
    public static double calcularPotencia(Matematica objeto){
        return objeto.getNumero1() > objeto.getNumero2() ?
               Math.pow(Math.round(objeto.getNumero1()), Math.round(objeto.getNumero2())) :
                Math.pow(Math.round(objeto.getNumero2()), Math.round(objeto.getNumero1()));
    }
    
    public static double calculaRaiz(Matematica objeto){
        return objeto.getNumero1() <= objeto.getNumero2() ? Math.sqrt(objeto.getNumero1()) :
                Math.sqrt(objeto.getNumero2());
    }
}
