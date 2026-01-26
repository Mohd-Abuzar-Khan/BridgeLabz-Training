package com.reflection.accessprivatefield;

// Person class with private field for reflection access demonstration
public class Person {
    private int age;
    private String name;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
}
