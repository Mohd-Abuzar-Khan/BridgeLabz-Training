// Create GradeCalculator class to calculate total, average and percentage
import java.util.Scanner;
public class GradeCalculator {

	// Method to generate random PCM scores
	public static int[][] generateScores(int students) {
		int[][] scores = new int[students][3];
		for (int i = 0; i < students; i++) {
			scores[i][0] = 10 + (int)(Math.random() * 90); // Physics
			scores[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
			scores[i][2] = 10 + (int)(Math.random() * 90); // Maths
		}
		return scores;
	}

	// Method to calculate total, average and percentage
	public static double[][] calculateResults(int[][] scores) {
		double[][] result = new double[scores.length][3];
		for (int i = 0; i < scores.length; i++) {

			int total = scores[i][0] + scores[i][1] + scores[i][2];
			double average = total / 3.0;
			double percentage = (total / 300.0) * 100;

			result[i][0] = total;
			result[i][1] = Math.round(average * 100) / 100.0;
			result[i][2] = Math.round(percentage * 100) / 100.0;
		}
		return result;
	}
	//Method to display score cards
	public static void displayScoreCards(double[][] result, int[][] scores, int numberOfStudents){
		
		System.out.println("P\tC\tM\tTotal\tAvg\tPercent");

		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println(scores[i][0] + "\t"
					+ scores[i][1] + "\t"
					+ scores[i][2] + "\t"
					+ result[i][0] + "\t"
					+ result[i][1] + "\t"
					+ result[i][2]);
		}
		
	}

	public static void main(String[] args) {
		
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.println("Enter number of student : ");
		int numberOfStudents = input.nextInt();

		//calling methods to generate and compute student scores
		int[][] scores = generateScores(numberOfStudents);
		double[][] result = calculateResults(scores);

		//Displaying result
		displayScoreCards(result,scores,numberOfStudents);
		
		input.close();
	}
}