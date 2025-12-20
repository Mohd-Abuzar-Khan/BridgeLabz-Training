// Importing dependency to take input
import java.util.Scanner;

// Created a UnitConverterYard class to convert units
public class UnitConverterYard {

    // Method to convert yards to inches
    public static void convertYardsToInches(double yards) {
        double yardsToInches = yards * 36;
        System.out.println("Converted distance of " + yards + " yards in inches is " + yardsToInches);
    }

    // Method to convert inches to yards
    public static void convertInchesToYards(double inches) {
        double inchesToYards = inches / 36;
        System.out.println("Converted distance of " + inches + " inches in yards is " + inchesToYards);
    }

    // Method to convert meters to inches
    public static void convertMeterToInches(double meter) {
        double meterToInches = meter * 39.3701;
        System.out.println("Converted distance of " + meter + " meter in inches is " + meterToInches);
    }

    // Method to convert inches to meters
    public static void convertInchesToMeter(double inches) {
        double inchesToMeter = inches * 0.0254;
        System.out.println("Converted distance of " + inches + " inches in meter is " + inchesToMeter);
    }

    // Method to convert centimeters to inches
    public static void convertCentimeterToInches(double cm) {
        double cmToInches = cm / 2.54;
        System.out.println("Converted distance of " + cm + " cm in inches is " + cmToInches);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in yards: ");
        double yards = sc.nextDouble();

        System.out.print("Enter distance in inches: ");
        double inches = sc.nextDouble();

        System.out.print("Enter distance in meter: ");
        double meter = sc.nextDouble();

        System.out.print("Enter distance in cm: ");
        double cm = sc.nextDouble();

        // Calling conversion methods
        convertYardsToInches(yards);
        convertInchesToYards(inches);
        convertMeterToInches(meter);
        convertInchesToMeter(inches);
        convertCentimeterToInches(cm);

        sc.close(); // Closing Scanner Object
    }
}
