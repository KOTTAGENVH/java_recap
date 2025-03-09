package oop.abstracts;

public class Main {
    public static void main(String[] args) {
        // We cannot create an instance of Animal directly because it is abstract.
        // Instead, we create an instance of Dog, which is a concrete subclass.
        Dog dog = new Dog();
        dog.makeSound(); // Outputs: Woof! Woof!
        dog.sleep();     // Outputs: The animal is sleeping.

        SuperM superM = new SuperM();
        superM.power();  
    }
}
