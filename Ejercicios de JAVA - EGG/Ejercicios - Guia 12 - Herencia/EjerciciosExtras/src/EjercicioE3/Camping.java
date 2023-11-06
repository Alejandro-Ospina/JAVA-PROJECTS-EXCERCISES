
package EjercicioE3;


// @author new53
 
public final class Camping extends ExtraHousing{
    private int maxNumberOfTent, numberOfAvailableBathrooms;
    private boolean hasRestaurant;

    public Camping(int maxNumberOfTent, int numberOfAvailableBathrooms, boolean hasRestaurant, boolean prrivate, int occupiedArea, String housingName, String address, String town, String managerName) {
        super(prrivate, occupiedArea, housingName, address, town, managerName);
        this.maxNumberOfTent = maxNumberOfTent;
        this.numberOfAvailableBathrooms = numberOfAvailableBathrooms;
        this.hasRestaurant = hasRestaurant;
    }

    public int getMaxNumberOfTent() {
        return maxNumberOfTent;
    }

    public int getNumberOfAvailableBathrooms() {
        return numberOfAvailableBathrooms;
    }

    public boolean isHasRestaurant() {
        return hasRestaurant;
    }

    @Override
    public String toString() {
        return "\n{CAMPING DETAILS....\n[" + 
                "\nMax number of tents: " + this.maxNumberOfTent + 
                "\nNumber of available bathrooms: " + this.numberOfAvailableBathrooms + 
                "\nTent has restaurant?: " + 
                super.toString() + "\n]";
    }   
}