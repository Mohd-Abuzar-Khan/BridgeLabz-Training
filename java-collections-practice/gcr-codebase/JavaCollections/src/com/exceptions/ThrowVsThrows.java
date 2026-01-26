package com.exceptions;

import java.util.Scanner;

// Demonstrates throw vs. throws with interest calculation
public class ThrowVsThrows {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter principal amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter interest rate: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);

        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid input: Amount and rate must be positive");

        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    // Calculates simple interest, throws IllegalArgumentException for negative amount or rate
    public static double calculateInterest(double amount, double rate, int years) {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }
}
