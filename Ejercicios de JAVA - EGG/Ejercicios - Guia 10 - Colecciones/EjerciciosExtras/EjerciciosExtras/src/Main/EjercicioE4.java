
package Main;

//  @author new53

import Service.CityService;

public class EjercicioE4 {

    public static void main(String[] args) {
        CityService.createCities();
        System.out.println("--------------Details----------------");
        CityService.showDetails();
        System.out.println("-------------------------------------");
        System.out.println("¿Existe la ciudad con código 15332?: " + CityService.codeExist(15332));       
        System.out.println("--------------Details----------------");
        CityService.showDetails();
        System.out.println("-------------------------------------");
        CityService.addCitiesToMap();
        System.out.println("-------------------------------------");
        CityService.deleteCity();
        System.out.println("-------------------------------------");
        CityService.deleteCity();
        System.out.println("-------------------------------------");
        CityService.deleteCity();
        System.out.println("--------------Details----------------");
        CityService.showDetails();       
    }
}