
package EjercicioE3;

// @author new53

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 
public class Service {
    private static List<TouristHousing> housings;
    private static List<Hotel> hotels;
    private static List<ExtraHousing> residences;
    
    public static void createHousings(){
        housings = new ArrayList<>(); hotels = new ArrayList<>();
        residences = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        System.out.println("First, let's add two four star hotel to list\n");
        for(int i=0; i<2; i++){
            System.out.print("Number of rooms: ");
            int numberOfRooms = read.nextInt(); read.nextLine();
            System.out.print("Number of beds per room: ");
            int numberOfBeds = read.nextInt(); read.nextLine();
            System.out.print("Number of floors: ");
            int numberOfFloors = read.nextInt(); read.nextLine();
            System.out.print("Hotel name: ");
            String housingName = read.nextLine();
            System.out.print("Hotel address: ");
            String address = read.nextLine();
            System.out.print("Town: ");
            String town = read.nextLine();
            System.out.print("Manager name: ");
            String managerName = read.nextLine();
            System.out.print("Gym type (A or B): ");
            String gt = read.nextLine();
            GymType gymType = GymType.A;
            for(GymType j : GymType.values()){
                if(gt.equalsIgnoreCase(j.toString())){
                    gymType = j;
                }
            }
            System.out.print("Restaurant name: : ");
            String restaurantName = read.nextLine();
            System.out.print("Restaurant capacity: ");
            int restCapacity = read.nextInt(); read.nextLine();
            housings.add(new FourStarHotel(gymType, restaurantName, restCapacity, numberOfRooms, numberOfBeds, numberOfFloors, housingName, address, town, managerName));
            hotels.add(new FourStarHotel(gymType, restaurantName, restCapacity, numberOfRooms, numberOfBeds, numberOfFloors, housingName, address, town, managerName));
            System.out.println("");
        }
        System.out.println("Now, let's add two five star hotel to list\n");
        for(int i=0; i<2; i++){
            System.out.print("Number of rooms: ");
            int numberOfRooms = read.nextInt(); read.nextLine();
            System.out.print("Number of beds per room: ");
            int numberOfBeds = read.nextInt(); read.nextLine();
            System.out.print("Number of floors: ");
            int numberOfFloors = read.nextInt(); read.nextLine();
            System.out.print("Hotel name: ");
            String housingName = read.nextLine();
            System.out.print("Hotel address: ");
            String address = read.nextLine();
            System.out.print("Town: ");
            String town = read.nextLine();
            System.out.print("Manager name: ");
            String managerName = read.nextLine();
            System.out.print("Gym type (A or B): ");
            String gt = read.nextLine();
            GymType gymType = GymType.A;
            for(GymType j : GymType.values()){
                if(gt.equalsIgnoreCase(j.toString())){
                    gymType = j;
                }
            }
            System.out.print("Restaurant name: : ");
            String restaurantName = read.nextLine();
            System.out.print("Restaurant capacity: ");
            int restCapacity = read.nextInt(); read.nextLine();
            System.out.print("Number of coference rooms: ");
            int cRooms = read.nextInt(); read.nextLine();
            System.out.print("Number of suites: ");
            int suites = read.nextInt(); read.nextLine();
            System.out.print("Number of lumusines: ");
            int limusines = read.nextInt(); read.nextLine();
            housings.add(new FiveStarHotel(gymType, restaurantName, restCapacity, cRooms, suites, limusines, numberOfRooms, numberOfBeds, numberOfFloors, housingName, address, town, managerName));
            hotels.add(new FiveStarHotel(gymType, restaurantName, restCapacity, cRooms, suites, limusines, numberOfRooms, numberOfBeds, numberOfFloors, housingName, address, town, managerName));
            System.out.println("");
        }
        System.out.println("Now, let's add two camping housings to list\n");
        for(int i=0; i<2; i++){          
            System.out.print("Camping name: ");
            String housingName = read.nextLine();
            System.out.print("Camping address: ");
            String address = read.nextLine();
            System.out.print("Town: ");
            String town = read.nextLine();
            System.out.print("Manager name: ");
            String managerName = read.nextLine();
            System.out.print("Is it private? (y/n): ");
            String answer = read.nextLine();
            boolean privat = false;
            if("y".equalsIgnoreCase(answer)){
                privat = true;
            }
            System.out.print("Area occupied by camping: ");
            int occupiedArea = read.nextInt(); read.nextLine();
            System.out.print("Max number of tent: ");
            int maxNumberOfTent = read.nextInt(); read.nextLine();
            System.out.print("Number of available bathrooms: ");
            int availabeBathRooms = read.nextInt(); read.nextLine();
            System.out.print("Does it have restaurant? (y/n): ");
            String answer2 = read.nextLine();
            boolean hasRestaurant = false;
            if("y".equalsIgnoreCase(answer2)){
                hasRestaurant = true;
            }
            housings.add(new Camping(maxNumberOfTent, availabeBathRooms, hasRestaurant, privat, occupiedArea, housingName, address, town, managerName));
            residences.add(new Camping(maxNumberOfTent, availabeBathRooms, hasRestaurant, privat, occupiedArea, housingName, address, town, managerName));
            System.out.println("");
        }   
        System.out.println("Now, let's add two residences to list\n");
        for(int i=0; i<2; i++){          
            System.out.print("Residence name: ");
            String housingName = read.nextLine();
            System.out.print("Residence address: ");
            String address = read.nextLine();
            System.out.print("Town: ");
            String town = read.nextLine();
            System.out.print("Manager name: ");
            String managerName = read.nextLine();
            System.out.print("Is it private? (y/n): ");
            String answer = read.nextLine();
            boolean privat = false;
            if("y".equalsIgnoreCase(answer)){
                privat = true;
            }
            System.out.print("Area occupied by residence: ");
            int occupiedArea = read.nextInt(); read.nextLine();
            System.out.print("Number of rooms ");
            int rooms = read.nextInt(); read.nextLine();
            System.out.print("Does it have disscount? (y/n): ");
            String answer2 = read.nextLine();
            boolean hasDisscount = false;
            if("y".equalsIgnoreCase(answer2)){
                hasDisscount = true;
            }
            System.out.print("Does it have sport field? (y/n): ");
            String answer3 = read.nextLine();
            boolean hasSField = false;
            if("y".equalsIgnoreCase(answer3)){
                hasSField = true;
            }
            housings.add(new Residence(rooms, hasDisscount, hasSField, privat, occupiedArea, housingName, address, town, managerName));
            residences.add(new Residence(rooms, hasDisscount, hasSField, privat, occupiedArea, housingName, address, town, managerName));
            System.out.println("");
        }
    }
    
    public static void setAllPrices(){
        housings.stream().filter(i -> i instanceof Hotel).map(i -> (Hotel) i).forEach(i -> {
            i.setRoomPrice();
        });
    }
    
    public static void showHousings(){
        System.out.println(housings);
    }
}