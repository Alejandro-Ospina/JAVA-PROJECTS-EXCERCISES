
package Ejercicio4;

//  @author new53
public class Ejercicio4 {

    public static void main(String[] args) {
        Circle circ1 = new Circle(4.6);
        System.out.println("Circle details...");
        System.out.println("Circle area: " + circ1.area());
        System.out.println("Circle perimeter: " + circ1.perimeter());
        System.out.println("------------------------");
        Rectangle rec1 = new Rectangle(6, 7);
        System.out.println("Rectangle details...");
        System.out.println("Rectangle area: " + rec1.area());
        System.out.println("Rectangle perimeter: " + rec1.perimeter());
    }
}