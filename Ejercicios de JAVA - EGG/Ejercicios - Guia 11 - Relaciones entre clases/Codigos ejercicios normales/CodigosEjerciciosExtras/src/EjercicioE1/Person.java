
package EjercicioE1;

import java.util.List;


// @author new53
 
public class Person {
    private String name, surname;
    private int age;
    private long id;
    private Dog dog;

    public Person() {
    }
    
    public Person(String name, String surname, int age, long id, Dog dogs) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.dog = dogs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", age=" + age + ", id=" + id + ", adopted dog=" + dog + '}';
    }
}