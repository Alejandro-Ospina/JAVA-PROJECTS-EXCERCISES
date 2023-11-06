
package EjercicioE1;

//  @author new53
public class EjercicioE1 {

    public static void main(String[] args) {
        RentService.rentShip();
        System.out.println("--------------");
        System.out.println("Ship details");
        RentService.MooringRentDetails();
        System.out.println("--------------");
        System.out.println("Module ship details");
        RentService.moduleDetails();
        System.out.println("--------------");
        System.out.println("Total rent: $" + RentService.totalRent());
    }
}