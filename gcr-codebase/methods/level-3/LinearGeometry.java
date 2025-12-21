// Create LinearGeometry class to find distance and equation of line
import java.util.Scanner;

public class LinearGeometry {

	// Method to find Euclidean distance between two points
	public static double findDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}

	// Method to find slope and y-intercept
	public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
		double slope = (y2 - y1) / (x2 - x1);
		double intercept = y1 - slope * x1;
		return new double[]{slope, intercept};
	}

	public static void main(String[] args) {

		//Creating object of Scanner
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter x1 y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.print("Enter x2 y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		//Calling the method to compute euclidean distance and displaying result
		double distance = findDistance(x1, y1, x2, y2);
		System.out.println("Euclidean Distance: " + distance);

		//Calling the method to compute line equation and displaying result
		double[] line = findLineEquation(x1, y1, x2, y2);
		System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

		input.close();
	}
}