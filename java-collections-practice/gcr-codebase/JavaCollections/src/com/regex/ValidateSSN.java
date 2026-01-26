package com.regex;

import java.util.Scanner;

public class ValidateSSN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "^\\d{3}-\\d{2}-\\d{4}$"; // Format: 3 digits - 2 digits - 4 digits

        System.out.print("Enter SSN: ");
        String ssn = scanner.nextLine().trim(); // Read input and trim spaces

        if (ssn.matches(pattern))
            System.out.println("Valid SSN: " + ssn); // Matches pattern
        else
            System.out.println("Invalid SSN: " + ssn); // Does not match

        scanner.close(); // Close scanner
    }
}
