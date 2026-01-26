package com.annotations.override;

/**
 * Exercise 1: Dog class that overrides makeSound() using @Override
 */
public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
