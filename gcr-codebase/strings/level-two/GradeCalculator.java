import java.util.Scanner;

public class GradeCalculator {

    //Method to generate PCM score through random method
    public static int[][] generatePCMScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10; // Physics
            scores[i][1] = (int)(Math.random() * 90) + 10; // Chemistry
            scores[i][2] = (int)(Math.random() * 90) + 10; // Maths
        }
        return scores;
    }

    //method to calculate Score based on average
    public static int[][] calculateScores(int[][] marks) {
        int[][] result = new int[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3;
            double percentage = average;
			
            result[i][0] = (int)total;
            result[i][1] = (int)average;
            result[i][2] = (int)percentage;
        }

        return result;
    }

    // Marking Grade base 
    public static String[][] calculateGrade(int[][] scoreData) {

        String[][] grades = new String[scoreData.length][1];

        for (int i = 0; i < scoreData.length; i++) {

            double percentage = scoreData[i][2];

            if (percentage > 80) {
                grades[i][0] = "Grade A , Level 4 , Above agency-normalized Standards";
            } else if (percentage >= 70) {
                grades[i][0] = "Grade B, Level 3 , at agency-normalized Standards";
            } else if (percentage >= 60) {
                grades[i][0] = "Grade C, Level 2 , below but approachinng agency-normalized Standards";
            } else if (percentage >= 50) {
                grades[i][0] = "Grade D, Level 1 , well below agency-normalized Standards";
            } else if (percentage >= 40) {
                grades[i][0] = "Grade E, level 1- , too below agency-normalized Standards";
            } else {
                grades[i][0] = "Grade R, Remedial standards";
            }
        }

        return grades;
    }

    //
    public static void displayScoreCard(int[][] marks, int[][] calculations, String[][] grades) {

        System.out.println("\nStudent\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                calculations[i][0] + "\t" +
                calculations[i][1] + "\t" +
                calculations[i][2] + "\t" +
                grades[i][0]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = generatePCMScores(n);
        int[][] calculations = calculateScores(marks);
        String[][] grades = calculateGrade(calculations);
        displayScoreCard(marks, calculations, grades);

        sc.close();
    }
}
