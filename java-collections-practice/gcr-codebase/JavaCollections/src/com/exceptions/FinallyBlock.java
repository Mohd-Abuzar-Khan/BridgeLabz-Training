package com.exceptions;

import java.util.Scanner;

// Demonstrates finally block execution during division
public class FinallyBlock {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            int result = num1 / num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero");

        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());

        } finally {
            System.out.println("Operation completed");
        }
    }
}
