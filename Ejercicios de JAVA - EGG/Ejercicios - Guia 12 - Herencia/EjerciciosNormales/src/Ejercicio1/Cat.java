
package Ejercicio1;


// @author new53
 
public class Cat extends Animal{
    
    public Cat(String animalName, String food, String breed, int animalAge){
        super(animalName, food, breed, animalAge);      
    }

    
    @Override
    public void feedingAnimal() {
        super.feedingAnimal(); 
    }    
}