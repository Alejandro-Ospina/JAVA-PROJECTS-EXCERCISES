
package Entidad;
import java.util.Scanner;

// @author new53

public class Operacion {
    public double numero1, numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return this.numero1;
    }

    public double getNumero2() {
        return this.numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor del número 1: ");
        this.numero1 = entrada.nextDouble();
        System.out.print("Ingrese el valor del número 2: ");
        this.numero2 = entrada.nextDouble();
    }
    
    public double sumar(){
        return (this.numero1 + this.numero2);
    }
    
    public double restar(){
        return (this.numero1 - this.numero2) < 0 ? (this.numero2 - this.numero1) : (this.numero1 - this.numero2);
    }
    
    public String multiplicar(){
        return (this.numero1==0 || this.numero2 == 0) ? "0 ¡Error!" : Double.toString(this.numero1*this.numero2);
    }
    
    public double dividir(){
        try{
            return (this.numero1/this.numero2);
        }catch(ArithmeticException excepcion){
            System.out.println(excepcion);
            return 0.0d;
        }
    }   
}
