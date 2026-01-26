package com.reflection.accessprivatefield;

import java.lang.reflect.Field;

// Accesses and updates a private field using reflection
public class AccessPrivateField {

    public static void main(String[] args) {
        Person person = new Person("John", 25);

        try {
            Class<?> personClass = person.getClass();
            Field ageField = personClass.getDeclaredField("age");
            ageField.setAccessible(true);

            // Read and update the private age field
            int currentAge = (int) ageField.get(person);
            System.out.println("Current age: " + currentAge);

            ageField.set(person, 30);

            int updatedAge = (int) ageField.get(person);
            System.out.println("Modified age: " + updatedAge);

        } catch (NoSuchFieldException | IllegalAccessException exception) {
            System.err.println("Failed to access the age field: " + exception.getMessage());
        }
    }
}
