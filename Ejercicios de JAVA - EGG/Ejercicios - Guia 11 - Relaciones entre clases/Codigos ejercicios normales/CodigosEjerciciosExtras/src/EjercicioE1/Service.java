
package EjercicioE1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


// @author new53
 
public class Service {
    private static Scanner read = new Scanner(System.in);
    private static final List<Person> people = new ArrayList();
    private static final List<Dog> dogList = new ArrayList();
    
    public static void createPeople(){
        while(true){
            Person person = new Person();            
            System.out.print("Add person name: ");
            person.setName(read.nextLine());
            System.out.print("Add person surname: ");
            person.setSurname(read.nextLine());
            System.out.print("Add person age: ");
            person.setAge(read.nextInt());  
            read.nextLine();
            System.out.print("Add person id: ");
            person.setId(read.nextInt());            
            read.nextLine();
            people.add(person);
            System.out.print("Would you like to create another person? (y/n): ");
            String answer = read.nextLine();
            if(answer.equalsIgnoreCase("n")){
                System.out.println("");
                break;
            }else{
                System.out.println("");
            }
        }    
    }
    
    public static void createDogs(){
        while(true){
            Dog dog = new Dog();
            System.out.print("Add dog name: ");
            dog.setName(read.nextLine());
            System.out.print("Add dog breed: ");
            dog.setBreed(read.nextLine());
            System.out.print("Add dog age: ");
            dog.setAge(read.nextInt());
            read.nextLine();
            System.out.print("Add dog size: ");
            dog.setSize(read.nextDouble());
            read.nextLine();
            dogList.add(dog);
            System.out.print("Would you like to add another dog to list? (y/n): ");
            String answer = read.nextLine();
            if(answer.equalsIgnoreCase("n")){
                System.out.println("");
                break;
            }else{
                System.out.println("");
            }
        }       
    }
    
    public static void dogAdopting(){
        if(people.isEmpty() || dogList.isEmpty()){
            System.out.println("¡There are not people to adopt pets, or there are not pets to be adopted!");
        }else{
            for(Person person : people){
                boolean dogAdopted = false;
                System.out.println("Hi " + person.getName() + " these are the dogs to be adopted...\n"
                +Arrays.toString(dogList.toArray()));  
                System.out.print("\nPlease, write the dog name you wish to adopt: ");
                String dogName = read.nextLine();                
                for(Dog dog : dogList){
                    if(dogName.equalsIgnoreCase(dog.getName())){
                        for(Person per : people){                          
                            if(per.getDog() == null){
                                people.get(people.indexOf(person)).setDog(dog);                               
                                //dogList.get(dogList.indexOf(dog)).setPerson(person);                                                             
                                dogAdopted = true;
                                System.out.println("¡Dog adopted successfully!");
                                break;                               
                            }else if(per.getDog().getName().equalsIgnoreCase(dogName)){
                                System.out.println("¡Pet has been adopted!");
                                break;
                            }
                        }
                    }
                }
                if(!dogAdopted){
                    System.out.println("Dog could not be adopted!");
                }
            }
        }
    }
    
    public static List<Dog> dogsDetails(){
        return dogList;
    }
    
    public static List<Person> showPersonDetails(){
        return people;
    }
}