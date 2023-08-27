
package Main;

//  @author new53

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y 
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se 
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el 
programa mostrará por pantalla el número de valores que se han leído, su suma y su 
media (promedio). */
public class EjercicioE1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList();
        Integer number;
        System.out.print("Write an integer number: ");
        do{
            number = read.nextInt();
            if(!number.equals(-99)){
                numberList.add(number);
                System.out.print("Add another number to list: ");
            }else{
                System.out.println("¡No more numbers will be added to list!");
                break;
            }           
        }
        while(true);
        int add = numberList.stream().map((i) -> i).reduce(0, Integer::sum);
        System.out.println("\nTotal add: " + add + 
                "\nTotal numbers added: " + numberList.size() + 
                "\nNumbers mean: " + ((double)(add/numberList.size())) + 
                "\nArray numbers: " + Arrays.toString(numberList.toArray()));
    }
}