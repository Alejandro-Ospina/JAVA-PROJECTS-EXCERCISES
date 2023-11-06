
package Ejercicio2;

import java.util.Scanner;

// @author new53
 
public class Electrodomestic {
    protected double price;
    protected String color, loadType;
    protected int weight;

    public Electrodomestic() {
    }

    public Electrodomestic(String color, String loadType, int weight) {       
        this.weight = weight; 
        this.color = color;
        this.loadType = loadType;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
 
    private void probeLoadType(char load){
        boolean rightLoad = false;
        for(LoadType i : LoadType.values()){
            if(i.toString().equalsIgnoreCase(Character.toString(load))){            
                rightLoad = true;
                break;
            }
        }
        if(!rightLoad){
            setLoadType(LoadType.F.toString());
            System.out.println("¡Load type letter is not a right options, so that your letter has changed to default value: F!");
        }else{
            System.out.println("¡Load type satisfies option!");
        }       
    }
    
    private void probeColor(String color){
        boolean rightColor = false;
        for(Colors i : Colors.values()){
            if(i.toString().equalsIgnoreCase(color)){               
                rightColor = true;
                break;
            }
        }
        if(!rightColor){
            setColor(Colors.White.toString());
            System.out.println("¡Typed color is not a right option, so that your color has changed to default value: white!");
        }else{
            System.out.println("¡Color satisfies option!");
        } 
    }
    
    public void createElectrodomestic(){
        Scanner read = new Scanner(System.in); 
        this.price = 1000.0d;
        System.out.print("Type your electrodomestic color: ");
        String colorE = read.nextLine();
        setColor(colorE);
        System.out.print("Type your electrodomestic load type (A,B,C,D,E or F): ");
        String loadT = read.nextLine();
        setLoadType(loadT);
        System.out.println("Testing color and load type...");
        probeLoadType(loadT.charAt(0));
        probeColor(colorE);
        System.out.print("Type your electrodomestic weight (Kg): ");
        setWeight(read.nextInt());
        read.nextLine();       
    }
    
    public void finalPrice(){
        for(LoadType i : LoadType.values()){
            if(i.toString().equalsIgnoreCase(getLoadType())){
                this.price = getPrice() + i.getPriceE();
                break;
            }
        }
        System.out.println("¡Price by letter corrected!");
        if(getWeight() >= 1.0 && getWeight() <= 19.0){
            this.price = getPrice() + 100.0;
        }else if(getWeight() >= 20.0 && getWeight() <= 49.0){
            this.price = getPrice() + 500.0;
        }else if(getWeight() >= 50.0 && getWeight() <= 79.0){
            this.price = getPrice() + 800.0;
        }else if(getWeight() >= 80.0){
            this.price = getPrice() + 1000.0;
        }
        System.out.println("¡Price corrected successfully!");
    }

    @Override
    public String toString() {
        return "Electrodomestic{" + "price=" + price + ", color=" + color + ", load Type=" + loadType + ", weight=" + weight + '}';
    } 
}