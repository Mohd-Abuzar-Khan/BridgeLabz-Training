package com.annotations.override;

/**
 * Exercise 1: Use @Override Correctly
 */
public class OverrideExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        
        Dog dog = new Dog();
        dog.makeSound();
    }
}
