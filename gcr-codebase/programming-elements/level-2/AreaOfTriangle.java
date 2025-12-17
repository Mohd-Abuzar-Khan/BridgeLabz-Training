// Importing dependencies to take user input
import java.util.Scanner;

// Created a AreaOfTriangle to calcuate area of triangle in inches and centimeter
public class AreaOfTriangle{
	public static void main(String[] args){
		
		// Taking base and height as input from user
		Scanner input = new Scanner(System.in);
		double base = input.nextDouble();
		double height = input.nextDouble();
		
		// Created variables to convert metrics 
		double baseInCentimeter = base * 2.54;
		double heightInInches = height / 2.54;
		
		// Calculating area of triangle in inches and cm
		double areaOfTriangelInInches = (1/2) * base * heightInInches;
		double areaOfTriangelInCentimeter = (1/2) * height * baseInCentimeter;
		
		//Printing area of triangle in inches and cm
		System.out.println("Area of Triangel in cm is "+areaOfTriangelInCentimeter+ " while in inches is " + areaOfTriangelInInches);
		
		input.close();// Closing the Scanning Object;
	}
}