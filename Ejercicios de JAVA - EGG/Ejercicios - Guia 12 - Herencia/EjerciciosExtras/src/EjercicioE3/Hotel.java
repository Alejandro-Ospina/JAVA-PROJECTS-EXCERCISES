
package EjercicioE3;


// @author new53
 
public abstract class Hotel extends TouristHousing{
    protected int numberOfRooms, numberOfBeds, numberOfFloors;
    protected double roomPrice;

    public Hotel(int numberOfRooms, int numberOfBeds, int numberOfFloors, String housingName, String address, String town, String managerName) {
        super(housingName, address, town, managerName);
        this.numberOfRooms = numberOfRooms;
        this.numberOfBeds = numberOfBeds;
        this.numberOfFloors = numberOfFloors;       
    }
    
    public void setRoomPrice() {
        this.roomPrice = 50.0 + ((double) this.numberOfBeds*this.numberOfRooms*this.numberOfFloors);
    }

    @Override
    public String toString() {
        return "\nHotel name: " + super.housingName +
                "\nHotel address: " + super.address + 
                "\nHotel town place: " + super.town + 
                "\nHotel manager name: " + super.managerName + 
                "\nNumber of rooms per floor: " + this.numberOfRooms + 
                "\nNumber of beds per room: " + this.numberOfBeds +
                "\nNumber of floors: " + this.numberOfFloors +
                "\nRoom price: $" + this.roomPrice;
    }
}