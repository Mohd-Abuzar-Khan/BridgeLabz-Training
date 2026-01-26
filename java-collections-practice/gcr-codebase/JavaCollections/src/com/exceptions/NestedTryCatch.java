package com.exceptions;

import java.util.Scanner;

// Demonstrates nested try-catch for array access and division
public class NestedTryCatch {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter array size: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();

            System.out.print("Enter divisor: ");
            int divisor = scanner.nextInt();

            // Outer try-catch for array access
            try {
                int element = array[index];

                // Inner try-catch for division
                try {
                    int result = element / divisor;
                    System.out.println("Result: " + element + " / " + divisor + " = " + result);

                } catch (ArithmeticException exception) {
                    System.out.println("Cannot divide by zero");
                }

            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Invalid array index");
            }

        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }
}
