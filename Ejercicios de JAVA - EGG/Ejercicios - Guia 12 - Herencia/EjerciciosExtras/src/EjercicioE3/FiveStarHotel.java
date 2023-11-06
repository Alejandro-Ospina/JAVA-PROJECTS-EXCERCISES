
package EjercicioE3;


// @author new53
 
public final class FiveStarHotel extends Hotel{
    private GymType gym;
    private String restaurantName;
    private int restaurantCapacity, numberOfConferenceRooms, numberOfSuites, 
            numberOfLimusines;

    public FiveStarHotel(GymType gym, String restaurantName, int restaurantCapacity, int numberOfConferenceRooms, int numberOfSuites, int numberOfLimusines, int numberOfRooms, int numberOfBeds, int numberOfFloors, String housingName, String address, String town, String managerName) {
        super(numberOfRooms, numberOfBeds, numberOfFloors, housingName, address, town, managerName);
        this.gym = gym;
        this.restaurantName = restaurantName;
        this.restaurantCapacity = restaurantCapacity;
        this.numberOfConferenceRooms = numberOfConferenceRooms;
        this.numberOfSuites = numberOfSuites;
        this.numberOfLimusines = numberOfLimusines;
    }    

    public GymType getGym() {
        return gym;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public int getRestaurantCapacity() {
        return restaurantCapacity;
    }

    public int getNumberOfConferenceRooms() {
        return numberOfConferenceRooms;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfLimusines() {
        return numberOfLimusines;
    }
    
    @Override
    public void setRoomPrice() {      
        double restaurantValue = 0;
        super.setRoomPrice();
        if(getRestaurantCapacity() < 30){
            restaurantValue = 10.0;
        }else if(getRestaurantCapacity() >= 30 && getRestaurantCapacity() < 50){
            restaurantValue = 30.0;
        }else if(getRestaurantCapacity() >= 50){
            restaurantValue = 50.0;
        }
        if(getGym().toString().equalsIgnoreCase("a")){
            super.roomPrice = super.roomPrice + restaurantValue + GymType.A.getGymPriceType() + getNumberOfLimusines()*15.0;
        }else{
            super.roomPrice = super.roomPrice + restaurantValue + GymType.B.getGymPriceType() + getNumberOfLimusines()*15.0;
        }     
    }
    
    @Override
    public String toString() {
        return "{FIVE STAR HOTEL DETAILS...[\n" + super.toString() + 
                "\nGym type: " + this.gym + 
                "\nRestaurant name: " + this.restaurantName + 
                "\nRestaurant capacity: " + this.restaurantCapacity + 
                "\nNumber of conference rooms: " + this.numberOfConferenceRooms + 
                "\nNumber of suits: " + this.numberOfSuites + 
                "\nNumber of Limusines: " + this.numberOfLimusines + "]\n}" ; 
    }  
}