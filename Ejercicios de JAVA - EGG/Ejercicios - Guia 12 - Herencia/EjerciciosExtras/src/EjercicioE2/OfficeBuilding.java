
package EjercicioE2;


// @author new53
 
public class OfficeBuilding extends Building{
    private int officeRoomNumber, peoplePerOfficeRoom, floorNumbers;

    public OfficeBuilding(int officeRoomNumber, int peoplePerOfficeRoom, int floorNumbers, double widht, double lenght, double high) {
        super(widht, lenght, high);
        this.officeRoomNumber = officeRoomNumber;
        this.peoplePerOfficeRoom = peoplePerOfficeRoom;
        this.floorNumbers = floorNumbers;
    }

    public int getOfficeRoomNumber() {
        return officeRoomNumber;
    }

    public void setOfficeRoomNumber(int officeRoomNumber) {
        this.officeRoomNumber = officeRoomNumber;
    }

    public int getPeoplePerOfficeRoom() {
        return peoplePerOfficeRoom;
    }

    public void setPeoplePerOfficeRoom(int peoplePerOfficeRoom) {
        this.peoplePerOfficeRoom = peoplePerOfficeRoom;
    }

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }
    
    public void peopleNumber(){
        System.out.println("Amount of people that set per floor: " + this.officeRoomNumber*this.peoplePerOfficeRoom);
        System.out.println("Amount of people that set in the whole building: " + this.floorNumbers*this.officeRoomNumber*this.peoplePerOfficeRoom);            
    }
          
    @Override
    public double calculateSurface() {
        return super.widht*super.lenght; 
    }

    @Override
    public double calculateVolume() {
        return super.high*super.lenght*super.widht; 
    }

    @Override
    public String toString() {
        return "\n{OFFICE BUILDING DETAILS...\n[" + 
                "\nOffices room number: " + this.officeRoomNumber +
                "\nPeople per office room: " + this.peoplePerOfficeRoom +
                "\nFloors number: " + this.floorNumbers +
                "\nWidth: " + super.widht + 
                "\nHigh: " + super.high + 
                "\nLength: " + super.lenght + "\n]";
    }   
}