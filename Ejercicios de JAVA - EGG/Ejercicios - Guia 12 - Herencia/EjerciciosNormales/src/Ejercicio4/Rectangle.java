
package Ejercicio4;


// @author new53
 
public class Rectangle implements GeometricFigures{
    private double base;
    private double high;

    public Rectangle() {
    }

    public Rectangle(double base, double high) {
        this.base = base;
        this.high = high;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double area() {
        return getBase()*getHigh();
    }

    @Override
    public double perimeter() {
        return 2*base + 2*high;
    }
}