// Importing dependency to take input
import java.util.Scanner;

// Created a UnitConverter class to convert units
public class UnitConverter {

    // Method to convert kilometers to miles
    public static void convertKmToMiles(double km) {
        double km2miles = km * 0.621371;
        System.out.println("Converted distance of " + km + " km in miles is " + km2miles);
    }

    // Method to convert miles to kilometers
    public static void convertMilesToKm(double miles) {
        double miles2km = miles * 1.60934;
        System.out.println("Converted distance of " + miles + " miles in km is " + miles2km);
    }

    // Method to convert meters to feet
    public static void convertMeterToFeet(double meter) {
        double meter2feet = meter * 3.28084;
        System.out.println("Converted distance of " + meter + " meter in feet is " + meter2feet);
    }

    // Method to convert feet to meters
    public static void convertFeetToMeter(double feet) {
        double feet2meter = feet * 0.3048;
        System.out.println("Converted distance of " + feet + " feet in meter is " + feet2meter);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();

        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();

        System.out.print("Enter distance in meter: ");
        double meter = sc.nextDouble();

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        // Calling methods to convert units
        convertKmToMiles(km);
        convertMilesToKm(miles);
        convertMeterToFeet(meter);
        convertFeetToMeter(feet);

        sc.close(); // Closing Scanner object
    }
}
