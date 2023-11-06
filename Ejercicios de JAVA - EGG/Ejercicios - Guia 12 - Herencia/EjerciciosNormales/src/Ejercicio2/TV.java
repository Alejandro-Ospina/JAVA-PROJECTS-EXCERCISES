
package Ejercicio2;

import java.util.Scanner;


// @author new53
 
public class TV extends Electrodomestic{
    private int resolution;
    private boolean TDTsintonizer;

    public TV() {
    }

    public TV(int resolution, boolean TDTsintonizer, String color, String loadType, int weight) {
        super(color, loadType, weight);
        this.resolution = resolution;
        this.TDTsintonizer = TDTsintonizer;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isTDTsintonizer() {
        return TDTsintonizer;
    }

    public void setTDTsintonizer(boolean TDTsintonizer) {
        this.TDTsintonizer = TDTsintonizer;
    }
    
    public void createTV(){
        Scanner read = new Scanner(System.in);
        super.createElectrodomestic();
        System.out.print("Fill resolution of TV (inches): ");
        setResolution(read.nextInt());
        read.nextLine(); 
        System.out.print("Does TV have TDT sintonizer? (y/n): ");
        String answer = read.next();
        if("y".equalsIgnoreCase(answer)){
            setTDTsintonizer(true);
        }else{
            setTDTsintonizer(false);
        }      
    }

    @Override
    public void finalPrice() {
        super.finalPrice();
        if(getResolution() >= 40){
            if(isTDTsintonizer()){
                super.price = super.getPrice()*(1.3) + 500.0;
            }else{
                super.price = super.getPrice()*(1.3);
            }
        }else{
            if(isTDTsintonizer()){
                super.price = super.getPrice() + 500.0;
            }
        }
    } 
    
    @Override
    public String toString() {
        return super.toString() + "[TV resolution: " + resolution + " | TV has TDT: " + TDTsintonizer + "]";
    }   
}