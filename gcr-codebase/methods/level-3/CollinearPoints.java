// Create CollinearPoints class to check collinearity
import java.util.Scanner;

public class CollinearPoints {

	// Method using slope formula
	public static boolean checkUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
		double slopeAB = (y2 - y1) / (x2 - x1);
		double slopeBC = (y3 - y2) / (x3 - x2);
		double slopeAC = (y3 - y1) / (x3 - x1);

		return slopeAB == slopeBC && slopeBC == slopeAC;
	}

	// Method using area of triangle
	public static boolean checkUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
		double area = 0.5 * (x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
		return area == 0;
	}

	public static void main(String[] args) {
	
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter x1 y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.print("Enter x2 y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		System.out.print("Enter x3 y3: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
	
		//Calling methods and displaying results
		System.out.println("Collinear using slope method: "
				+ checkUsingSlope(x1,y1,x2,y2,x3,y3));

		System.out.println("Collinear using area method: "
				+ checkUsingArea(x1,y1,x2,y2,x3,y3));

		input.close();
	}
}