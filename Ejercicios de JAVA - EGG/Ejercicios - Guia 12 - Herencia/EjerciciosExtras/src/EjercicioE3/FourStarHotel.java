
package EjercicioE3;


// @author new53
 
public final class FourStarHotel extends Hotel{
    private GymType gym;
    private String restaurantName;
    private int restaurantCapacity;

    public FourStarHotel(GymType gym, String restaurantName, int restaurantCapacity, int numberOfRooms, int numberOfBeds, int numberOfFloors, String housingName, String address, String town, String managerName) {
        super(numberOfRooms, numberOfBeds, numberOfFloors, housingName, address, town, managerName);
        this.gym = gym;
        this.restaurantName = restaurantName;
        this.restaurantCapacity = restaurantCapacity;
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
            super.roomPrice = super.roomPrice + restaurantValue + GymType.A.getGymPriceType();
        }else{
            super.roomPrice = super.roomPrice + restaurantValue + GymType.B.getGymPriceType();
        }     
    }

    @Override
    public String toString() {
        return "{FOUR STAR HOTEL DETAILS...[\n" + super.toString() + 
                "\nGym type: " + this.gym + 
                "\nRestaurant name: " + this.restaurantName + 
                "\nRestaurant capacity: " + this.restaurantCapacity + "]\n}" ; 
    }  
}