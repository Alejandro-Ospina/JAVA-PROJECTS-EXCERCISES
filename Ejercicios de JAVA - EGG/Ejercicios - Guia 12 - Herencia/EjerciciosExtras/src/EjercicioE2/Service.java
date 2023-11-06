
package EjercicioE2;

import java.util.ArrayList;
import java.util.Scanner;

// @author new53
 
public class Service {
    private static ArrayList<Building> buildings;
    
    public static void createBuildings(){
        buildings = new ArrayList();
        Scanner read = new Scanner(System.in);
        System.out.println("First we add 2 sport center buildings to array list...");
        for(int i=0; i<2; i++){
            System.out.print("Sport center building name: ");
            String name = read.nextLine();
            System.out.print("Type of roof the building has (roofed/unroofed): ");
            String roof = read.nextLine();
            RoofBuilding rb = RoofBuilding.Roofed;
            for(RoofBuilding rf : RoofBuilding.values()){
                if(roof.equalsIgnoreCase(rf.toString())){
                    rb = rf;
                }
            }
            System.out.print("Building width (m): ");
            double width = read.nextDouble(); read.nextLine();
            System.out.print("Building high (m): ");
            double high = read.nextDouble(); read.nextLine();
            System.out.print("Building length (m): ");
            double length = read.nextDouble(); read.nextLine();
            buildings.add(new SportCenterBuilding(name, rb, width, length, high));
        }
        System.out.println("\nNow, we add 2 office buildings to array list...");
        for(int i=0; i<2; i++){
            System.out.print("Number of offices per floor: ");
            int opf = read.nextInt(); read.nextLine();
            System.out.print("Number of people per office: ");
            int ppf = read.nextInt(); read.nextLine();
            System.out.print("Number of floors the building has: ");
            int nf = read.nextInt(); read.nextLine();
            System.out.print("Building width (m): ");
            double width1 = read.nextDouble(); read.nextLine();
            System.out.print("Building high (m): ");
            double high1 = read.nextDouble(); read.nextLine();
            System.out.print("Building length (m): ");
            double length1 = read.nextDouble(); read.nextLine();
            buildings.add(new OfficeBuilding(opf, ppf, nf, width1, length1, high1));
        }
    }
    
    public static void buildingDetails(){
        System.out.println(buildings);
    }
    
    public static void buildingSurfacesVolumes(){
        buildings.stream().forEach((i) ->{
            System.out.println("---------------------------------");
            System.out.println("Surface value: " + i.calculateSurface());
            System.out.println("Volume value: " + i.calculateVolume());
        });
    }
    
    public static void peopleNumberS(){
        for(Building i : buildings){
            if(i instanceof OfficeBuilding){
                System.out.println("------------------");
                ((OfficeBuilding) i).peopleNumber();
            }
        }
    }
    
    public static void roofedUnroofed(){
        int roofed = 0;
        int unRoofed = 0;
        for(Building i : buildings){          
            if(i instanceof SportCenterBuilding){
                if(((SportCenterBuilding) i).getRoof().toString().equalsIgnoreCase("roofed")){
                    roofed += 1;
                }else{
                    unRoofed += 1;
                }
            }
        }
        System.out.println("Amount of roofed sport center buildings: " + roofed);
        System.out.println("Amount of unroofed sport center buildings: " + unRoofed);
    }
}