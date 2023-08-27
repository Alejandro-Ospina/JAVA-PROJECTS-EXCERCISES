
package Main;

//  @author new53

import Service.CountryService;

public class Ejercicio5 {

    public static void main(String[] args) {
        CountryService.addCountries();       
        CountryService.alphabeticSort();
        System.out.println("");
        CountryService.deleteCountry();
        CountryService.deleteCountry();       
        CountryService.alphabeticSort();
    }
}