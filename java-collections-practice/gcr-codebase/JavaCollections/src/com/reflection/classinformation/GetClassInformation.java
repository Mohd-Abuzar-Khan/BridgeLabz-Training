package com.reflection.classinformation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

// Get Class Information - Accepts a class name as input and displays its methods, fields, and constructors using Reflection
public class GetClassInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter fully qualified class name (e.g., java.util.ArrayList): ");
        String className = scanner.nextLine();
        
        try {
            Class<?> clazz = Class.forName(className);
            
            System.out.println("\n=== Class Information ===");
            System.out.println("Class Name: " + clazz.getName());
            System.out.println("Simple Name: " + clazz.getSimpleName());
            
            // Display Constructors
            System.out.println("\n=== Constructors ===");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            if (constructors.length == 0) {
                System.out.println("No constructors found");
            } else {
                for (Constructor<?> constructor : constructors) {
                    System.out.println(constructor);
                }
            }
            
            // Display Methods
            System.out.println("\n=== Methods ===");
            Method[] methods = clazz.getDeclaredMethods();
            if (methods.length == 0) {
                System.out.println("No methods found");
            } else {
                for (Method method : methods) {
                    System.out.println(method);
                }
            }
            
            // Display Fields
            System.out.println("\n=== Fields ===");
            Field[] fields = clazz.getDeclaredFields();
            if (fields.length == 0) {
                System.out.println("No fields found");
            } else {
                for (Field field : fields) {
                    System.out.println(field);
                }
            }
            
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found: " + className);
        } finally {
            scanner.close();
        }
    }
}
