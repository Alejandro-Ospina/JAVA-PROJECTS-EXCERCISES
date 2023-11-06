
package Ejercicio2;


// @author new53
 
public class ArrayC {
    private final int[] vectorNumbers;

    public ArrayC(int size) throws NegativeArraySizeException, ArrayIndexOutOfBoundsException{       
        if (size == 0){
            throw new ArrayIndexOutOfBoundsException("Warning: array length must be greater than cero.");
        } else if (size < 0){
            throw new NegativeArraySizeException("Warning: negative array size not allowed");
        }else {
            this.vectorNumbers = new int[size];
        }
    }
    
    public void addNumbers(int number, int position) throws ArrayIndexOutOfBoundsException {  
        if (position < 0 || position >= vectorNumbers.length){
            throw new ArrayIndexOutOfBoundsException("Error: number could not be added due to position "
                    + "\nexceeds bounds");
        } else {
            vectorNumbers[position] = number;
            System.out.println("¡Number added successfully to array!");
        }
    }
    
    public void getNumber(int position) throws ArrayIndexOutOfBoundsException {
        if (position < 0 || position >= vectorNumbers.length){
            throw new ArrayIndexOutOfBoundsException("Error: number could not be looked up due to position "
                    + "\nexceeds bounds");
        } else {          
            System.out.println("Number in position " + position + " is: " + vectorNumbers[position]);
        }
    }
}