// importing dependencies for taking input
import java.util.Scanner;

// Created a SideOfSquare class to find side of square using it's perimeter
public class SideOfSquare{
	public static void main(String[] args){
		
		// Taking perimeter as input
		Scanner input = new Scanner(System.in);
		double perimeter = input.nextDouble();
		
		// Calculating Side of Square using Perimeter
		double side = perimeter / 4;
		
		// Printing Side of Square and it's perimeter
		System.out.println("The length of the side is " + side +" whose perimeter is " + perimeter);
		
		input.close(); // Closing the Scanner Object
	}
}