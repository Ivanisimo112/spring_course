package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    @Autowired
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    public Pet getPet() {
        return pet;
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

    public void setPet(Pet pet) {
        System.out.println("Person:Set pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello,my pet!");
        pet.say();
    }


    /*
    @Autowired
    public Person(@Qualifier("catBean") Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }
     */
    public Person(Pet pet){
        System.out.println("Person bean is created");
        this.pet = pet;
    }

    public Person(){
        System.out.println("Person bean is created");
    }

}
