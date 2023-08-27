
package EjercicioE1;


// @author new53
 
public class Dog {
    private String name, breed;
    private int age;
    private double size;
    private Person person;
    

    public Dog() {
    }

    public Dog(String name, String breed, int age, double size, Person person) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.person = person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + ", age=" + age + ", size=" + size + ", owner name=" + person + '}';
    } 
}