
package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


// @author new53
 
public class CityService {
    private static final HashMap<Integer, String> citiesList = new HashMap<Integer, String>();
    private static final Scanner read = new Scanner(System.in);
    
    public static void createCities(){
        String cities[][] = new String[10][2];
        for(int i=0; i<cities.length; i++){
            for(int j=0; j<cities[i].length-1; j++){
                System.out.print("Postal code for city " + (i+1) + ": ");
                cities[i][j] = read.nextLine();
                System.out.print("Name for city " + (i+1) + ": ");
                cities[i][j+1] = read.nextLine();               
            }
        }
        Integer codes[] = new Integer[10];
        for(int i=0; i<codes.length; i++){
            codes[i] = Integer.parseInt(cities[i][0]);
            citiesList.put(codes[i], cities[i][1]);
        }        
    }
    
    public static void showDetails(){
        citiesList.entrySet().forEach((Map.Entry<Integer, String> city) -> 
        {System.out.println(city.getKey() + "----" + city.getValue());});          
    }
    
    public static boolean codeExist(Integer code){
        return citiesList.keySet().stream().anyMatch((i) -> (i.equals(code)));
    }
    
    public static void addCitiesToMap(){
        System.out.print("Write the postal code city you wish to add to the map: ");
        Integer code = read.nextInt();
        read.nextLine();
        System.out.print("Write the city you wish to add to the map according to postal code: ");
        String city = read.nextLine();      
        citiesList.put(code, city);
    }
    
    public static void deleteCity(){
        System.out.print("Write the city you wish to delete from map: ");
        String city = read.nextLine();
        for(Map.Entry<Integer, String> cities : citiesList.entrySet()){
            if(cities.getValue().equalsIgnoreCase(city)){
                citiesList.remove(cities.getKey());  
                break;
            }
        }
    }
}