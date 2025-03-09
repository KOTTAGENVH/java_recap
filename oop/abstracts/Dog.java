package oop.abstracts;

// Dog class extends the abstract Animal class
public class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override // Override 📣
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
