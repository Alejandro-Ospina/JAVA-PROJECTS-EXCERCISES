
package Ejercicio1;

//  @author new53
public class Ejercicio1 {

    public static void main(String[] args) {
        //Creamos la persona vacía
        Persona person = new Persona();
        ServicioPersona personService = new ServicioPersona();
        System.out.println("Now, a exception test is carried in order to determine if person "
                + "\nhas null parameters, or has negative ages");
        try{
            personService.esMayorDeEdad(person);
            System.out.println(person.toString());
        } catch(NullPointerException | ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}