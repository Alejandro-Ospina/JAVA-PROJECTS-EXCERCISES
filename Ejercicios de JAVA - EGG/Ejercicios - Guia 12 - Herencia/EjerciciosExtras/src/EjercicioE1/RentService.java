
package EjercicioE1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;


// @author new53
 
public class RentService {   
    private static RentMooring rent;
    
    public static void rentShip(){
        Scanner READ = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
        System.out.println("Welcome dear user. Next, you're gonna find the list of avilable ships so that \n "
                + "you can make a mooring rent for the one.");
        System.out.println("List of ships for mooring rent: \n"
        + "1. Sailboats\n" + "2. Motor ships\n" + "3. Luxury yachts"); 
        System.out.print("Type the option you wish to make the rent arrengement: ");
        int answer = READ.nextInt();
        READ.nextLine();
        switch(answer){
            case 1:
                System.out.println("You've decided to make a mooring rent for sailboat...");
                System.out.print("Customer name: ");
                String customerName = READ.nextLine();
                System.out.print("Customer ID: ");
                long customerID = READ.nextInt(); READ.nextLine();
                System.out.print("Mooring rent date (dd/mm/yyyy): ");
                String inDate = READ.nextLine();
                System.out.print("Mooring devolution date (dd/mm/yyyy): ");
                String enDate = READ.nextLine();
                System.out.println("Mooring position (port, starboard, stern, bow): ");
                String mooringPosition = READ.nextLine();
                MooringPosition position = MooringPosition.STERN; //default position
                for(MooringPosition i : MooringPosition.values()){
                    if(mooringPosition.equalsIgnoreCase(i.toString())){
                        position = i;
                    }
                }
                System.out.println("Ship information...");
                System.out.print("Ship registration: ");
                long registration = READ.nextInt(); READ.nextLine();
                System.out.print("Ship length (m): ");
                int length = READ.nextInt(); READ.nextLine();
                System.out.print("Year fabrication of ship: ");
                int year = READ.nextInt(); READ.nextLine();
                System.out.print("How many masts does have the sailboat?: ");
                int numMasts = READ.nextInt(); READ.nextLine();
                rent = new RentMooring(customerName, customerID, LocalDate.parse(inDate, formatter),
                LocalDate.parse(enDate, formatter), position, new SailBoat(numMasts, registration, length, year));
                System.out.println("¡Sailboat mooring rent created successfully!");
                break;
            case 2:
                System.out.println("You've decided to make a mooring rent for Motor ship...");
                System.out.print("Customer name: ");
                String customerName2 = READ.nextLine();
                System.out.print("Customer ID: ");
                long customerID2 = READ.nextInt(); READ.nextLine();
                System.out.print("Mooring rent date (dd/mm/yyyy): ");
                String inDate2 = READ.nextLine();
                System.out.print("Mooring devolution date (dd/mm/yyyy): ");
                String enDate2 = READ.nextLine();
                System.out.print("Mooring position (port, starboard, stern, bow): ");
                String mooringPosition2 = READ.nextLine();
                MooringPosition position2 = MooringPosition.STERN; //default position
                for(MooringPosition i : MooringPosition.values()){
                    if(mooringPosition2.equalsIgnoreCase(i.toString())){
                        position = i;
                    }
                }
                System.out.println("Ship information...");
                System.out.print("Ship registration: ");
                long registration2 = READ.nextInt(); READ.nextLine();
                System.out.print("Ship length (m): ");
                int length2 = READ.nextInt(); READ.nextLine();
                System.out.print("Year fabrication of ship: ");
                int year2 = READ.nextInt(); READ.nextLine();
                System.out.print("How much power does motor ship have ? (CV): ");
                double power = READ.nextDouble(); READ.nextLine();
                rent = new RentMooring(customerName2, customerID2, LocalDate.parse(inDate2, formatter),
                LocalDate.parse(enDate2, formatter), position2, new MotorShips(power, registration2, length2, year2));
                System.out.println("¡Motor ship mooring rent created successfully!");
                break;
            case 3:
                System.out.println("You've decided to make a mooring rent for luxury yachts...");
                System.out.print("Customer name: ");
                String customerName3 = READ.nextLine();
                System.out.print("Customer ID: ");
                long customerID3 = READ.nextInt(); READ.nextLine();
                System.out.print("Mooring rent date (dd/mm/yyyy): ");
                String inDate3 = READ.nextLine();
                System.out.print("Mooring devolution date (dd/mm/yyyy): ");
                String enDate3 = READ.nextLine();
                System.out.print("Mooring position (port, starboard, stern, bow): ");
                String mooringPosition3 = READ.nextLine();
                MooringPosition position3 = MooringPosition.STERN; //default position
                for(MooringPosition i : MooringPosition.values()){
                    if(mooringPosition3.equalsIgnoreCase(i.toString())){
                        position = i;
                    }
                }
                System.out.println("Ship information...");
                System.out.print("Ship registration: ");
                long registration3 = READ.nextInt(); READ.nextLine();
                System.out.print("Ship length (m): ");
                int length3 = READ.nextInt(); READ.nextLine();
                System.out.print("Year fabrication of ship: ");
                int year3 = READ.nextInt(); READ.nextLine();
                System.out.print("How much power does luxury yacht have ? (CV): ");
                double power2 = READ.nextDouble(); READ.nextLine();
                System.out.print("How many cabins does luxury yacht have?: ");
                int cabins = READ.nextInt(); READ.nextLine();
                rent = new RentMooring(customerName3, customerID3, LocalDate.parse(inDate3, formatter),
                LocalDate.parse(enDate3, formatter), position3, new LuxuryYacht(power2, cabins, registration3, length3, year3));
                System.out.println("¡Luxury yacht mooring rent created successfully!");
                break;
            default:
                System.out.println("¡Invalid option. Rent arrengment could not be accomplished!");
                break;    
        }
    }
    
    public static void moduleDetails(){
        System.out.println("Value of module for respective ship: " + rent.getShip().module());
    }
    
    public static void MooringRentDetails(){
        System.out.println(rent.toString());
    }
    
    public static double totalRent(){
        return (ChronoUnit.DAYS.between(rent.getRentDate(), rent.getDevolutionDate()))*rent.getShip().module();
    }       
}