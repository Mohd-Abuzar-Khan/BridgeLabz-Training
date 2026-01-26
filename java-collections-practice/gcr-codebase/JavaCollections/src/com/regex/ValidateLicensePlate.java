package com.regex;

import java.util.Scanner;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "^[A-Z]{2}[0-9]{4}$"; // Two uppercase letters followed by four digits

        System.out.print("Enter license plate number: ");
        String licensePlate = scanner.nextLine().trim(); // Read input and trim spaces

        if (licensePlate.matches(pattern)) 
            System.out.println("Valid license plate: " + licensePlate); // Matches pattern
        else 
            System.out.println("Invalid license plate: " + licensePlate); // Does not match

        scanner.close(); // Close scanner
    }
}
