
package EjercicioE2;

//  @author new53
public class EjercicioE2 {

    public static void main(String[] args) {
        Service.createBuildings();
        System.out.println("-----------------");
        Service.buildingSurfacesVolumes();
        System.out.println("-----------------");       
        Service.roofedUnroofed();
        System.out.println("-----------------");
        Service.peopleNumberS();
        System.out.println("-----------------");
        Service.buildingDetails();        
    }
}