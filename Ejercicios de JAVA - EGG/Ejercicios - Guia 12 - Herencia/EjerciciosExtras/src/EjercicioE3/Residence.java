
package EjercicioE3;


// @author new53
 
public final class Residence extends ExtraHousing{
    private int numberOfRooms;
    private boolean hasDisccount, hasSportField;

    public Residence(int numberOfRooms, boolean hasDisccount, boolean hasSportField, boolean prrivate, int occupiedArea, String housingName, String address, String town, String managerName) {
        super(prrivate, occupiedArea, housingName, address, town, managerName);
        this.numberOfRooms = numberOfRooms;
        this.hasDisccount = hasDisccount;
        this.hasSportField = hasSportField;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isHasDisccount() {
        return hasDisccount;
    }

    public boolean isHasSportField() {
        return hasSportField;
    }
    
    @Override
    public String toString() {
        return "\n{RESIDENCE DETAILS....\n[" + 
                "\nNumber of rooms: " + this.numberOfRooms + 
                "\nResidence has disscount?: " + this.hasDisccount + 
                "\nResidence has sport field?: " + this.hasSportField + 
                super.toString() + "\n]";
    }    
}