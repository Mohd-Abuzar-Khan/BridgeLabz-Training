import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Declare arrays
        double[][] marks = new double[n][3];   // Physics, Chemistry, Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Taking input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            // Physics
            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextDouble();
            if (marks[i][0] < 0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }

            // Chemistry
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextDouble();
            if (marks[i][1] < 0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }

            // Maths
            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextDouble();
            if (marks[i][2] < 0) {
                System.out.println("Marks cannot be negative. Re-enter student details.");
                i--;
                continue;
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

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

        // Display result
        System.out.println("\n----- STUDENT REPORT -----");
        for (int i = 0; i < n; i++) {
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
