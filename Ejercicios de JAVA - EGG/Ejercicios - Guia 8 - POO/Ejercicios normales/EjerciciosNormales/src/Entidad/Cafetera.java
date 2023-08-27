
package Entidad;

import java.util.Scanner;


// @author new53
 
public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera(){
        cantidadActual = capacidadMaxima;
    }
    
    public void servirTaza(int tamanioTaza){        
        System.out.println("Procediendo a llenar la taza...");
        if(this.cantidadActual < tamanioTaza){
            setCantidadActual(0);
            System.out.println("No se alcanzó a llenar la taza");
        }else {
            setCantidadActual(getCantidadActual()-tamanioTaza);
            System.out.println("¡Se ha llenado la taza correctamente!");
        }
    }
    
    public void vaciarCafetera(){
        setCantidadActual(0);
    }
    
    public void agregarCafe(int cantidadCafe){
        if((this.cantidadActual + cantidadCafe) > this.capacidadMaxima){
            System.out.println("No se puede agregar más café. Cafetera queda llena");
            this.cantidadActual = this.capacidadMaxima;
        }else {
            System.out.println("¡Cantidad de café agregado correctamente a la cafetera!");
            this.cantidadActual += cantidadCafe;
        }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }     
}
