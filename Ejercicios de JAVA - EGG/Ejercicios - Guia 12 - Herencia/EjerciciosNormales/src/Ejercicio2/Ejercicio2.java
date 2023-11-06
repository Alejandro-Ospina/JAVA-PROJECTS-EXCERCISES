
package Ejercicio2;

//  @author new53
public class Ejercicio2 {

    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        TV tv = new TV();
        ///Washing machine logic
        washingMachine.createWashingMachine();
        washingMachine.finalPrice();
        System.out.println("Washing Machine details...\n" + washingMachine);
        System.out.println("\n");
        tv.createTV();
        tv.finalPrice();
        System.out.println("TV details...\n" + tv);      
    }
}