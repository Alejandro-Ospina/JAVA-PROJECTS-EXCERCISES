
package Service;

import Sorters.AlphabeticSort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;



// @author new53
 
public class CountryService {
    private static final HashSet<String> countrySet = new HashSet();
    private static final Scanner read = new Scanner(System.in);
    
    public static void addCountries(){
        System.out.print("Please, add a country to the set: ");
        String answer;
        while(true){
            countrySet.add(read.nextLine());
            System.out.print("Would you like to add another country to the set? (y/n): ");
            answer = read.nextLine();
            if("n".equalsIgnoreCase(answer)){
                System.out.println("\nCountries set");
                getSet();
                break;
            }else{
                System.out.print("\nAdd another country: ");
            }
        }
    }
    
    private static void getSet(){
        System.out.println(Arrays.toString(countrySet.toArray()));
    }
    
    public static void alphabeticSort(){
        ArrayList<String> countryList = new ArrayList(countrySet);
        Collections.sort(countryList, new AlphabeticSort());
        System.out.println("Alphabetic set sort");
        System.out.println(Arrays.toString(countryList.toArray()));
    }
    
    public static void deleteCountry(){
        System.out.print("Please, write the country you wish to delete from set: ");
        String countryErase = read.nextLine();
        Iterator<String> countries = countrySet.iterator();
        boolean containCountry = false;
        while(countries.hasNext()){
            if(countries.next().equals(countryErase)){
                countries.remove();
                containCountry = true;
                break;
            }
        }
        if(!containCountry){
            System.out.println("\n¡Country not found!");
        }else{
            System.out.println("\n¡Country deleted successfully!");
        }        
        getSet();
    }
}