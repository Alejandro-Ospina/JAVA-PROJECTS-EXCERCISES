
package Ejercicio2;

//  @author new53
public class Ejercicio2 {

    public static void main(String[] args) {
        Electrodomestic elect = new Electrodomestic();
        Electrodomestic elect2 = new Electrodomestic();
        elect.createElectrodomestic();
        System.out.println(elect.toString());
        elect2.createElectrodomestic();
        System.out.println(elect2.toString());
        System.out.println(elect.toString());
    }
}