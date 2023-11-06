
package Ejercicio4;


// @author new53
 
public class Circle implements GeometricFigures{
    public double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area(){
        return getRadius()*getRadius()*PI;
    }

    @Override
    public double perimeter() {
        return 2*PI*getRadius();
    }
}
