
package ejerciciopractica2.Entidad;


// @author new53
 
public class Circunferencia {
    private double radio; 
    
    public Circunferencia(){       
    }
    
    public Circunferencia(double radio){
        this.radio = radio;
    }
    
    public void setRadio(double numero){
        this.radio = numero;
    }
    
    public double getRadio(){
        return radio;
    }
}