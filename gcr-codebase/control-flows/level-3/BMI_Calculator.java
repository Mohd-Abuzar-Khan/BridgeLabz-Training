import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter your weight (in kg):");
        double weight = sc.nextDouble();

        System.out.println("Enter your height (in cm):");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Display BMI
        System.out.println("Your BMI is: " + bmi);

        // Determine weight status
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Weight Status: Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }

        sc.close();
    }
}
