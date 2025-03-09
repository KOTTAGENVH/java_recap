package oop.abstracts;

// Abstract class
//Fun fact: 🪄
public abstract class Animal {
    // Abstract method: no body provided here
    public abstract void makeSound();
    
    // Concrete method with implementation
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}
