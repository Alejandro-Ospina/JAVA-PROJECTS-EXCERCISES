
package Ejercicio3;

//  @author new53
public class Ejercicio3 {

    public static void main(String[] args) {
        ElectrodomesticList.createElectrodomesticList();
        System.out.println("");
        ElectrodomesticList.listDetails();
        System.out.println("");
        System.out.println("Electrodomestics total price: $" + ElectrodomesticList.totalPrice());
    }
}