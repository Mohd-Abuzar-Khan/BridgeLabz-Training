package com.regex;

import java.util.Scanner;

public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String visaPattern = "^4[0-9]{15}$";
        String masterCardPattern = "^5[0-9]{15}$";

        System.out.print("Enter credit card number: ");
        String cardNumber = scanner.nextLine().replaceAll("[\\s-]", ""); // Remove spaces/dashes

        if (cardNumber.matches(visaPattern)) {
            System.out.println("✅ Valid Visa card number");
        } else if (cardNumber.matches(masterCardPattern)) {
            System.out.println("✅ Valid MasterCard number");
        } else {
            System.out.println("❌ Invalid credit card number");
        }

        scanner.close();
    }
}
