
package EjercicioE3;


// @author new53
 
public abstract class TouristHousing {
    protected String housingName, address, town, managerName;

    public TouristHousing(String housingName, String address, String town, String managerName) {
        this.housingName = housingName;
        this.address = address;
        this.town = town;
        this.managerName = managerName;
    }
    
    @Override
    public abstract String toString();
}