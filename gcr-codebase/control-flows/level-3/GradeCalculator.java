import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter your Physics Marks :");
        double physics = sc.nextDouble();
        System.out.println("Enter your Chemistry Marks :");
        double chemistry = sc.nextDouble();
		System.out.println("Enter your Math Marks :");
        double math = sc.nextDouble();

        // Calculating Average Value
        double average = (physics + math + chemistry) / 3;

        // Display Display Average Value
        System.out.println("Your Average Mark is: " + average);

        // Determine Grade and Remarks status
        if (average > 80) {
            System.out.println("Grade A, Level 4, above agency-nrmalized standards");
        } else if (average >= 70 && average < 80) {
            System.out.println("Grade B, Level 3, at agency-nrmalized standards");
        } else if (average >= 60 && average < 70) {
            System.out.println("Grade C, Level 2, below but approaching  agency-nrmalized standards");
        } else if (average >= 50 && average < 60) {
            System.out.println("Grade D, Level 1, well below agency-nrmalized standards");
        } else if (average >= 40 && average < 50) {
            System.out.println("Grade E, Level 1-, too below agency-nrmalized standards");
		} else {
			System.out.println("Grade R,Remedial standards");

		}

        sc.close();
    }
}
