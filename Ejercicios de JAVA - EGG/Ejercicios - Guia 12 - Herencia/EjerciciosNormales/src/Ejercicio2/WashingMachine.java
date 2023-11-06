
package Ejercicio2;

import java.util.Scanner;


// @author new53
 
public class WashingMachine extends Electrodomestic{
    private int loadCapacity;

    public WashingMachine() {        
    }

    public WashingMachine(int loadCapacity, String color, String loadType, int weight) {
        super(color, loadType, weight);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    
    public void createWashingMachine(){
        Scanner read = new Scanner(System.in);
        super.createElectrodomestic();
        System.out.print("Fill wash-machine load capacity (Kg): ");
        setLoadCapacity(read.nextInt());
        read.nextLine();       
    }
        
    @Override
    public void finalPrice() {
        super.finalPrice();
        if(getLoadCapacity() >= 30){
            super.price = super.getPrice() + 500.0;
        }
    }  

    @Override
    public String toString() {
        return super.toString() + "[Load Capacity: " + loadCapacity + "]";
    }   
}