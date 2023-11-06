
package EjercicioE1;


// @author new53
 
public class LuxuryYacht extends Ship{
    private double powerCVLuxuryYacht;
    private int cabinNumberLuxuryYacht;

    public LuxuryYacht(double powerCVLuxuryYacht, int cabinNumberLuxuryYacht, long registration, int length, int yearFabrication) {
        super(registration, length, yearFabrication);
        this.powerCVLuxuryYacht = powerCVLuxuryYacht;
        this.cabinNumberLuxuryYacht = cabinNumberLuxuryYacht;
    }

    public double getPowerCVLuxuryYacht() {
        return powerCVLuxuryYacht;
    }

    public void setPowerCVLuxuryYacht(double powerCVLuxuryYacht) {
        this.powerCVLuxuryYacht = powerCVLuxuryYacht;
    }

    public int getCabinNumberLuxuryYacht() {
        return cabinNumberLuxuryYacht;
    }

    public void setCabinNumberLuxuryYacht(int cabinNumberLuxuryYacht) {
        this.cabinNumberLuxuryYacht = cabinNumberLuxuryYacht;
    }
    
    @Override
    public double module() {
        return super.module() + getCabinNumberLuxuryYacht() + getPowerCVLuxuryYacht();
    }

    @Override
    public String toString() {
        return super.toString() + "[CV power for luxury yacht: " + powerCVLuxuryYacht + 
                " | Cabin numbers in luxury yacht: " + cabinNumberLuxuryYacht + "]";
    }
}