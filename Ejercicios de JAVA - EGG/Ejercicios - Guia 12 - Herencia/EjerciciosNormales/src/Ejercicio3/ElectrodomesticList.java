package Ejercicio3;

import Ejercicio2.Electrodomestic;
import Ejercicio2.TV;
import Ejercicio2.WashingMachine;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// @author new53
 
public class ElectrodomesticList {
    private static List<Electrodomestic> electrodomesticList;
    
    public static void createElectrodomesticList(){
        Scanner read = new Scanner(System.in);
        electrodomesticList = new ArrayList<>();
        String stop; 
        int answer;
        do{
            System.out.print("What would you like to add list?: \n(1). TV  \n(2). WashingMachine\n"
            + "Fill your option: ");
            answer = read.nextInt();
            read.nextLine();
            switch(answer){
                case 1:
                    System.out.println("Adding TV to list...");
                    TV tv = new TV();
                    tv.createTV();
                    tv.finalPrice();
                    electrodomesticList.add(tv);
                    System.out.println("TV added successfully!!\n");
                    break;
                case 2:
                    System.out.println("Adding washing machine to list...");
                    WashingMachine washMachine = new WashingMachine();
                    washMachine.createWashingMachine();
                    washMachine.finalPrice();
                    electrodomesticList.add(washMachine);
                    System.out.println("Washing machine added successfully!!\n");
                    break;
                default:
                    System.out.println("¡Invalid option! Electrodomestic not added to list.");
                    break;
            }
            System.out.print("Would you like to add another electrodomestic to list? (y/n): ");
            stop = read.next();
            if("n".equalsIgnoreCase(stop)){
                System.out.println("No more electrodomestic will be added to list.");
                break;
            }
        }while(true);
    }
    
    public static double totalPrice(){
        double totalAdd = 0.0;
        totalAdd = electrodomesticList.stream().map((elec) -> elec.getPrice()).reduce(totalAdd, (accumulator, _item) -> accumulator + _item);
        return totalAdd;
    }
    
    public static void listDetails(){
        System.out.println(electrodomesticList);
    }
}