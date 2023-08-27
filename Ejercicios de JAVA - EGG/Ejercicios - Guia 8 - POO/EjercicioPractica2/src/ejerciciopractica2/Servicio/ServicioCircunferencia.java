
package ejerciciopractica2.Servicio;

import ejerciciopractica2.Entidad.Circunferencia;
import java.util.Scanner;


// @author new53
 
public class ServicioCircunferencia {
    private Scanner leer = new Scanner(System.in);
    private Circunferencia parametro = new Circunferencia();
    
    public ServicioCircunferencia(){
        crearCircunferencia();
    }
    
    private void crearCircunferencia(){
        System.out.print("Ingrese el valor del radio: ");
        parametro.setRadio(leer.nextDouble());
    }
    
    public double calcularArea(){
        return ((double)parametro.getRadio()*parametro.getRadio()*Math.PI);
    }
    
    public double calcularPerimetro(){
        return ((double)2*Math.PI*parametro.getRadio());
    }
}