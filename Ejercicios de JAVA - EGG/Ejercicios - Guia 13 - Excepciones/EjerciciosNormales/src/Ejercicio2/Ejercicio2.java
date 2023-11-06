
package Ejercicio2;

//  @author new53
public class Ejercicio2 {

    public static void main(String[] args) {
        //First we create the object
        try{
            ArrayC array = new ArrayC(0);
            try{
                array.addNumbers(5, 4);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            try{
                array.getNumber(4);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
        } catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}