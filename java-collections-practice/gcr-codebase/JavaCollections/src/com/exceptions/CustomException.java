package com.exceptions;

import java.util.Scanner;

// Thrown when age is below the required minimum
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Validates user age using a custom exception
public class CustomException {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            validateAge(age);
            System.out.println("Access granted");

        } catch (InvalidAgeException exception) {
            System.out.println("Age must be 18 or above");

        } catch (Exception exception) {
            System.out.println("Invalid input: " + exception.getMessage());
        }
    }

    // Checks if age is 18 or above
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }
    }
}
