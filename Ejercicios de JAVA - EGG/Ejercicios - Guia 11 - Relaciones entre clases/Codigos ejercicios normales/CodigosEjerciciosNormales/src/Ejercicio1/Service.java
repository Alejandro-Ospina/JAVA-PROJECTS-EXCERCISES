
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// @author new53
 
public class Service {
    private static Scanner read = new Scanner(System.in);
    private static final List<Person> people = new ArrayList();
    
    public static void createPerson(){
        Person person = new Person(); 
        List<Dog> dogList = new ArrayList();
        System.out.print("Add person name: ");
        person.setName(read.nextLine());
        System.out.print("Add person surname: ");
        person.setSurname(read.nextLine());
        System.out.print("Add person age: ");
        person.setAge(read.nextInt());       
        System.out.print("Add person id: ");
        person.setId(read.nextInt());       
        System.out.print("¿How many dogs the person have?: ");
        int pets = read.nextInt();
        read.nextLine();
        for(int i=0; i<pets; i++){            
            Dog dog = new Dog();
            System.out.print("Add dog name: ");
            dog.setName(read.nextLine());
            System.out.print("Add dog breed: ");
            dog.setBreed(read.nextLine());
            System.out.print("Add dog age: ");
            dog.setAge(read.nextInt());
            System.out.print("Add dog size: ");
            dog.setSize(read.nextDouble());
            read.nextLine();
            dogList.add(dog);
        }
        person.setDogs(dogList);
        people.add(person);
    }
    
    public static List<Person> showPersonDetails(){
        return people;
    }
}