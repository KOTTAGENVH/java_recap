package oop.encapsulation;
//Encapsulation is primarily about data hiding and state management.
//Abstraction is about hiding complexity by exposing only the relevant features of an object.
public class Main {
    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("John", 30);
        
        // Accessing private fields using public getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        
        // Modifying private fields using public setters
        person.setName("Jane");
        person.setAge(28);
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}
