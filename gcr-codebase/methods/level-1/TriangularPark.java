// Importing dependencies to take input
import java.util.Scanner;

// Created a TriangularPark class to find total number of round to complete 5 km 
public class TriangularPark{
	
	public static int fiveKilometers(int side1 , int side2, int side3){
		int perimeter = ( side1 + side2 + side3);
		int rounds = 5000 / perimeter;
		return rounds;
	}
	
	public static void main(String[] args){
		
		// Taking number of side as input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first side of a triangle:");
		int side1 = input.nextInt();
		System.out.println("Enter the second side of a triangle:");
		int side2 = input.nextInt();
		System.out.println("Enter the third side of a triangle:");
		int side3 = input.nextInt();
		
		// Calculating Number of round require to complete 5 Km
		int round = TriangularPark.fiveKilometers(side1 , side2, side3);
		
		// Prinitng Number of possible Handshake
		System.out.println("Number of round require by the Athlete is  "  + round);
		
		input.close(); // Closing Scanner Object
	}

}