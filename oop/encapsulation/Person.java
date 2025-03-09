package oop.encapsulation;

public class Person {
    // Private fields - encapsulated data
    private String name;
    private int age;
    
    // Constructor to initialize Person objects
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age with validation
    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }
}
