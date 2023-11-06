
package EjercicioE1;


// @author new53
 
public abstract class Ship {
    protected long registration;
    protected int length, yearFabrication;

    public Ship(long registration, int length, int yearFabrication) {
        this.registration = registration;
        this.length = length;
        this.yearFabrication = yearFabrication;
    }
    
    public double module(){
        return this.length*10;
    }

    @Override
    public String toString() {
        return "Ship{" + "registration=" + registration + ", length=" + length + ", yearFabrication=" + yearFabrication + '}';
    }
}