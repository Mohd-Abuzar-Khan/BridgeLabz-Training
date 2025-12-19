import java.util.Scanner;

public class GradeUsing2DArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Declare arrays
        double[][] marks = new double[students][3]; // Physics, Chemistry, Maths
        double[] percentage = new double[students];
        String[] grade = new String[students];

        // Input marks with validation
        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                System.out.print("Enter " + subject + " marks: ");
                marks[i][j] = sc.nextDouble();

                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Re-enter student details.");
                    i--;
                    break;
                }
            }
        }

        // Calculating percentage and grade
        for (int i = 0; i < students; i++) {
            double total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / 3;

            if (percentage[i] > 80) {
                grade[i] = "Grade A";
            } else if (percentage[i] >= 70) {
                grade[i] = "Grade B";
            } else if (percentage[i] >= 60) {
                grade[i] = "Grade C";
            } else if (percentage[i] >= 50) {
                grade[i] = "Grade D";
            } else if (percentage[i] >= 40) {
                grade[i] = "Grade E";
            } else {
                grade[i] = "Grade R (Remedial)";
            }
        }

        // Displaying results
        System.out.println("\n----- STUDENT REPORT -----");
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics   : " + marks[i][0]);
            System.out.println("Chemistry : " + marks[i][1]);
            System.out.println("Maths     : " + marks[i][2]);
            System.out.printf("Percentage: %.2f\n", percentage[i]);
            System.out.println("Grade     : " + grade[i]);
            System.out.println("--------------------------");
        }

        sc.close();
    }
}
