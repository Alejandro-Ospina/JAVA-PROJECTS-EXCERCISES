
package EjercicioE1;


// @author new53
 
public class MotorShips extends Ship{
    private double powerCVmotorShips;

    public MotorShips(double powerCVmotorShips, long registration, int length, int yearFabrication) {
        super(registration, length, yearFabrication);
        this.powerCVmotorShips = powerCVmotorShips;
    }

    public double getPowerCVmotorShips() {
        return powerCVmotorShips;
    }

    public void setPowerCVmotorShips(double powerCVmotorShips) {
        this.powerCVmotorShips = powerCVmotorShips;
    }
       
    @Override
    public double module() {
        return super.module() + getPowerCVmotorShips();
    }

    @Override
    public String toString() {
        return super.toString() + "[CV power for motor ships: " + powerCVmotorShips + "]";
    }   
}