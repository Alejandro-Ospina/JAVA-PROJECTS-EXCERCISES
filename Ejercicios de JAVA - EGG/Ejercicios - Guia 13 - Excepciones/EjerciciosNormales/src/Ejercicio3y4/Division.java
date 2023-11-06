
package Ejercicio3y4;

import java.util.InputMismatchException;
import java.util.Scanner;


// @author new53
 
public class Division {
    private double numberA, numberB;
    
    public double divideNumbers() throws NullPointerException, NumberFormatException, 
            ArithmeticException, InputMismatchException{
        Scanner read = new Scanner(System.in);       
        try{
            System.out.print("Value of numerator: ");
            String A = read.next();
            System.out.print("Value of ndenominator: ");
            String B = read.next();
            try{
                this.numberA = Double.parseDouble(A);
                this.numberB = Double.parseDouble(B);  
                if(this.numberA == 0 && this.numberB == 0){
                    throw new NullPointerException("Empty values not allowed");           
                }else if (this.numberA != 0 && this.numberB == 0){
                    throw new ArithmeticException("Division by cero not allowed!!");
                }else{
                    return this.numberA / this.numberB;
                }         
            }catch (NumberFormatException e){
                throw new NumberFormatException("Invalid convertion to double!!");
            }
        }catch (InputMismatchException e){
            throw new InputMismatchException("Input does not match!!");
        }       
    }
}