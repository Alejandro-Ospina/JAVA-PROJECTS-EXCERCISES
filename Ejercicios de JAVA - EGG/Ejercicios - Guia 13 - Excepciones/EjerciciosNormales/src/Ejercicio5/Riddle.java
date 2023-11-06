
package Ejercicio5;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


// @author new53
 
public class Riddle {
    private static final int GUESSEDNUMBER;
    
    static{
        Random number = new Random();
        GUESSEDNUMBER = number.nextInt(500) + 1;
    }
    
    public static void riddleGame() {
        Scanner read = new Scanner(System.in);
        int attempts = 0;        
        System.out.print("Type the hidden value (number between 1 and 500): ");
        int hiddenValue;
        do{          
            try{
                hiddenValue = read.nextInt();
                if (hiddenValue == GUESSEDNUMBER){
                    System.out.println("¡Congratulations! " + GUESSEDNUMBER + " was the hidden number" );
                    break;
                }else {
                    if (hiddenValue < GUESSEDNUMBER){
                        attempts ++;
                        System.out.print("Typed value is lesser than hidden value. Try a higher value: ");
                    }else{
                        attempts ++;
                        System.out.print("Typed value is higher than hidden value. Try a lesser value: ");
                    }
                }
            }catch (InputMismatchException e){
                attempts ++;               
                System.err.print("Input does not match with right format. Try another number: "); 
                read.nextLine();
            }
        }while(true);
        System.out.println("\nNumber of taken attemtps to figure out hidden value: " + attempts);
    }
}