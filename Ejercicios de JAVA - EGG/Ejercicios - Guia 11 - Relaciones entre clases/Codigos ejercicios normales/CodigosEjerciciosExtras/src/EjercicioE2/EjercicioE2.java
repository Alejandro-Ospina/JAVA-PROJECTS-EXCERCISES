
package EjercicioE2;

//  @author new53
public class EjercicioE2 {

    public static void main(String[] args) {
        Service.generateViewers();
        System.out.println("---------------------");
        Service.generateMovie();
        System.out.println("---------------------");
        Service.roomPrice();
        System.out.println("---------------------");
        Service.locateViewerRandomly();
        System.out.println("---------------------");
        Service.showLocationDetails();
        System.out.println("---------------------");
        Service.showViewerDetails();
    }
}