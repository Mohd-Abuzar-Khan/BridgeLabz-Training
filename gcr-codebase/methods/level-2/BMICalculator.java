import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate the 3rd column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];       // weight in kg
            double heightCm = data[i][1];     // height in cm
            double heightMeter = heightCm / 100; // convert cm to meter

            double bmi = weight / (heightMeter * heightMeter);
            data[i][2] = bmi; // store BMI
        }
    }

    // Method to determine BMI status of each person
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array: 10 rows, 3 columns
        // Column 0 → Weight (kg)
        // Column 1 → Height (cm)
        // Column 2 → BMI
        double[][] data = new double[10][3];

        // Taking input
        for (int i = 0; i < data.length; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height  of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Determine BMI status
        String[] bmiStatus = determineBMIStatus(data);

        // Display results
        System.out.println(" Result ");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + data[i][0] + " kg");
            System.out.println("Height: " + data[i][1] + " cm");
            System.out.println("BMI: " + String.format("%.2f", data[i][2]));
            System.out.println("Status: " + bmiStatus[i]);
        }

        sc.close(); // Closing Scanner object
    }
}
