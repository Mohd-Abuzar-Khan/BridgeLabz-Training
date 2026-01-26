package com.regex;

import java.util.Scanner;

public class ValidateUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pattern = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$"; // Start with a letter, then 4-14 letters/digits/underscores, total 5-15 chars

        System.out.print("Enter username: ");
        String username = scanner.nextLine().trim(); // Read input and trim spaces

        if (username.matches(pattern))
            System.out.println("Valid username: " + username); // Matches pattern
        else
            System.out.println("Invalid username: " + username); // Does not match

        scanner.close(); // Close scanner
    }
}
