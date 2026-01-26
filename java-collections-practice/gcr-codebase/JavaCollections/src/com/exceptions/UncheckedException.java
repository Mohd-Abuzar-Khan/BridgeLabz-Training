package com.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

// Demonstrates unchecked exceptions: ArithmeticException and InputMismatchException
public class UncheckedException {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = num1 / num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);

        } catch (ArithmeticException exception) {
            System.out.println("Cannot divide by zero. Please enter a non-zero denominator.");

        } catch (InputMismatchException exception) {
            System.out.println("Invalid input. Please enter numeric values only.");
        }
    }
}
