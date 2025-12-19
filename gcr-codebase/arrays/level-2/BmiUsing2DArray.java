import java.util.Scanner;

public class BmiUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Declare arrays
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Taking input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Weight input with validation
            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            // Height input with validation
            do {
                System.out.print("Enter height (meters): ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            personData[i][2] = weight / (height * height);

            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display result
        System.out.println("\n----- BMI REPORT -----");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight : " + personData[i][0] + " kg");
            System.out.println("Height : " + personData[i][1] + " m");
            System.out.printf("BMI    : %.2f\n", personData[i][2]);
            System.out.println("Status : " + weightStatus[i]);
            System.out.println("----------------------");
        }

        sc.close();
    }
}
