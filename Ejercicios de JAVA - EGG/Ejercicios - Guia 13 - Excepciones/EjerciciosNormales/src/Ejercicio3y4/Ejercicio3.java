
package Ejercicio3y4;

//  @author new53

import java.util.InputMismatchException;

public class Ejercicio3 {

    public static void main(String[] args) {
        Division div = new Division();
        try{
            System.out.println("Division value: " + div.divideNumbers());
        }catch (InputMismatchException | NullPointerException | NumberFormatException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}