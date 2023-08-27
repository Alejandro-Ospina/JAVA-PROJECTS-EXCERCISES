
package EjercicioE1;

//  @author new53
public class Ejercicio1 {

    public static void main(String[] args) {
        Service.createPeople();
        Service.createDogs();
        Service.dogAdopting();
        System.out.println("");
        System.out.println(Service.showPersonDetails());
        System.out.println("");
        System.out.println(Service.dogsDetails());
    }
}