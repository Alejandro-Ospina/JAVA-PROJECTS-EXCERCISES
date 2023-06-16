
package Entidad;
import java.util.Scanner;

// @author new53
 
public class Circunferencia {
    private double radio;   

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio: ");
        this.radio = entrada.nextDouble();
    }
    
    public double area(){
        return (Math.PI*radio*this.radio);
    }
    
    public double perimetro(){
        return (Math.PI*2*this.radio);
    }
}
