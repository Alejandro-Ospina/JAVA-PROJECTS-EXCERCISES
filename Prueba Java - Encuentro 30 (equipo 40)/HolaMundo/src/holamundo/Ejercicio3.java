
package holamundo;

//  @author new53
public class Ejercicio3 {

    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 4;
        
        // usamos un operador artimetico para la variable numero3
        
        int numero3 = numero1 + numero2;
        
        // Usamos un operador de tipo unario para la variable numero4
        
        int numero4 = numero3--;
        
        // Usamos un operador de tipo logico para la variable numero5
        
        boolean numero5 = numero4 > numero3;
        System.out.print("Es mayor o no? :" + numero5);
        System.out.print("El numero 4 es: " + numero4);
    }
}
