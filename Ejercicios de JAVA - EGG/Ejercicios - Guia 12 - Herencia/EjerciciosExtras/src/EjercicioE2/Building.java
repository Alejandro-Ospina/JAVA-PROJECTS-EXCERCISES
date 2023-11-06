
package EjercicioE2;


// @author new53
 
public abstract class Building {
    protected double widht, lenght, high;

    public Building(double widht, double lenght, double high) {
        this.widht = widht;
        this.lenght = lenght;
        this.high = high;
    }
    
    public abstract double calculateSurface();
    public abstract double calculateVolume();
    
    @Override
    public abstract String toString();   
}