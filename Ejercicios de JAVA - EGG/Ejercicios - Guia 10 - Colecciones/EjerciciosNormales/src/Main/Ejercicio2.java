
package Main;

//  @author new53

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá 
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro 
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista 
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará 
la lista ordenada.*/
public class Ejercicio2 {

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
        System.out.print("\nType any dog breed you wish to remove from the list: ");
        String removeDog = read.next().toLowerCase();
        Iterator<String> dogs = dogBreeds.iterator();
        boolean reDog = false;
        while(dogs.hasNext()){
            if(dogs.next().equals(removeDog)){
                dogs.remove();
                reDog = true;
                break;
            }
        }
        if(!reDog){
            System.out.println("¡Sorry! Couldn't remove dog from list (sorted list):");                                         
        }else{
            System.out.println("¡Dog removed correctly! (sorted list)");          
        }
        Collections.sort(dogBreeds); 
        System.out.println(Arrays.toString(dogBreeds.toArray()));
    }
}