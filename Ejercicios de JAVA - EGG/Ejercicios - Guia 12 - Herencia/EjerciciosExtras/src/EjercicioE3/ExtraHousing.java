
package EjercicioE3;


// @author new53
 
public abstract class ExtraHousing extends TouristHousing{
    protected boolean prrivate;
    protected int occupiedArea;

    public ExtraHousing(boolean prrivate, int occupiedArea, String housingName, String address, String town, String managerName) {
        super(housingName, address, town, managerName);
        this.prrivate = prrivate;
        this.occupiedArea = occupiedArea;
    }

    @Override
    public String toString(){
        return "\nHousing name: " + super.housingName +
                "\nHousing address: " + super.address + 
                "\nHousing town place: " + super.town + 
                "\nHousing manager name: " + super.managerName + 
                "\nHousing is private?: " + this.prrivate + 
                "\nArea occupied by housing: " + this.occupiedArea;
    }
}