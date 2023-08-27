
package Ejercicio1;

import java.util.List;


// @author new53
 
public class Person {
    private String name, surname;
    private int age;
    private long id;
    private List<Dog> dogs;

    public Person() {
    }
    
    public Person(String name, String surname, int age, long id, List<Dog> dogs) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.dogs = dogs;
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

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    @Override
    public String toString() {
        return "Person{" + "name= " + name + ", surname= " + surname + ", age= " + age + ", id= " + id + ",\n dogs= " + dogs + '}';
    }
}