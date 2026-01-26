package com.reflection.dynamicobjectcreation;

import java.lang.reflect.Constructor;

//  Dynamically Create Objects - Creates an instance of Student class dynamically using Reflection without using the new keyword
public class DynamicallyCreateObjects {
    public static void main(String[] args) {
        try {
            // Get the Class object
            Class<?> studentClass = Student.class;
            
            // Create instance using default constructor
            System.out.println("=== Creating instance using default constructor ===");
            Constructor<?> defaultConstructor = studentClass.getConstructor();
            Student student1 = (Student) defaultConstructor.newInstance();
            System.out.println("Default: " + student1);
            
            // Create instance using parameterized constructor
            System.out.println("\n=== Creating instance using parameterized constructor ===");
            Constructor<?> paramConstructor = studentClass.getConstructor(String.class, int.class);
            Student student2 = (Student) paramConstructor.newInstance("Alice", 101);
            System.out.println("Parameterized: " + student2);
            
        } catch (Exception e) {
            System.err.println("Error creating object: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
