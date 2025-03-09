package oop.abstracts;

public class SuperM implements Hero {
    // Providing implementation for the abstract method
    @Override // Override 📣
    public void power() {
        System.out.println("SuperM has super strength and can fly.");
    }
}
