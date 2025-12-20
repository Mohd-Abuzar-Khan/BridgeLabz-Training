// Importing dependency to take input
import java.util.Scanner;

// Created a UnitConverter utility class
public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius and return the value
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Method to convert Celsius to Fahrenheit and return the value
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Method to convert pounds to kilograms and return the value
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = pounds * 0.453592;
        return pounds2kilograms;
    }

    // Method to convert kilograms to pounds and return the value
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = kilograms * 2.20462;
        return kilograms2pounds;
    }

    // Method to convert gallons to liters and return the value
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = gallons * 3.78541;
        return gallons2liters;
    }

    // Method to convert liters to gallons and return the value
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = liters * 0.264172;
        return liters2gallons;
    }

    // Main method to test the utility class
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double farenheith = sc.nextDouble();

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double kg = sc.nextDouble();

        System.out.print("Enter volume in gallons: ");
        double gallons = sc.nextDouble();

        System.out.print("Enter volume in liters: ");
        double liters = sc.nextDouble();

        // Calling utility methods and printing results
        convertFarhenheitToCelsius(farenheith);
        convertCelsiusToFarhenheit(celsius);
        convertPoundsToKilograms(pounds);
        convertKilogramsToPounds(kg);
        convertGallonsToLiters(gallons);
        convertLitersToGallons(liters);

        sc.close(); // Closing Scanner object
    }
}
