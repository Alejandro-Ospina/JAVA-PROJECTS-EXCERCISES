
package EjercicioE1;


// @author new53
 
public class SailBoat extends Ship{
    private int mastNumber;

    public SailBoat(int mastNumber, long registration, int length, int yearFabrication) {
        super(registration, length, yearFabrication);
        this.mastNumber = mastNumber;
    }

    public int getMastNumber() {
        return mastNumber;
    }

    public void setMastNumber(int mastNumber) {
        this.mastNumber = mastNumber;
    }
    

    @Override
    public double module() {
        return super.module() + getMastNumber();
    }
    
    @Override
    public String toString() {
        return super.toString() + "[Masts numbers for sailboat: " + mastNumber + "]"; //To change body of generated methods, choose Tools | Templates.
    }
}