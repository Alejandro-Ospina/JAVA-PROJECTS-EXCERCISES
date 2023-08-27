
package Ejercicio1;

//  @author new53
public class Ejercicio1 {

    public static void main(String[] args) {
        //Now we create a dog
        Animal dog = new Dog("Candy", "meat", "french Poodle", 5);
        dog.feedingAnimal();
        
        //Now we create a cat
        Animal cat = new Cat("Perseo", "vegetables", "bombay", 2);
        cat.feedingAnimal();
        
        //Now we create a horse
        Animal horse = new Horse("Lorenzo", "apples", "Tenessie walker", 8);
        horse.feedingAnimal();
    }
}