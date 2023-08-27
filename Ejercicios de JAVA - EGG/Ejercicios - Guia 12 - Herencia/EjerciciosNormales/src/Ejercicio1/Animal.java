
package Ejercicio1;


// @author new53
 
public class Animal {
    protected String animalName, food, breed;
    protected int animalAge;

    public Animal(String animalName, String food, String breed, int animalAge) {
        this.animalName = animalName;
        this.food = food;
        this.breed = breed;
        this.animalAge = animalAge;
    }  
    
    public void feedingAnimal(){
        System.out.println(this.animalName + " is feeding right now, and it is eating " + this.food);
    }
}