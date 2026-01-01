package com.inheritance.basicproblem.animalhierarchy;

public class AnimalTest {
    public static void main(String[] args) {

        Animal dog = new Dog("Bozo", 3);
        Animal cat = new Cat("Penelope", 2);
        Animal bird = new Bird("Flickers", 1);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        
    }
}
