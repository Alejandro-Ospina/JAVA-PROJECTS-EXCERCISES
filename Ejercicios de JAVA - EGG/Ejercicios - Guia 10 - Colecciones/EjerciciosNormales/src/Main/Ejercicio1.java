
package Main;

//  @author new53

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList. */
public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<String> dogBreeds = new ArrayList();
        Scanner read = new Scanner(System.in);       
        System.out.print("Type the dog breed you wish to add: ");
        String answer;
        while(true){
            dogBreeds.add(read.next());
            System.out.print("¿Would you like to add another one? (y/n): ");
            answer = read.next();
            if("n".equalsIgnoreCase(answer)){
                System.out.println("\n¡Bye!");
                break;
            }else{
                System.out.print("Add another dog breed: ");
            }
        } 
        System.out.println("Dog list: " + Arrays.toString(dogBreeds.toArray()));
    }
}