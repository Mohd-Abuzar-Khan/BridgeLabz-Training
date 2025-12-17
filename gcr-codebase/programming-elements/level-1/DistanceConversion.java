// Import dependencies to take input 
import java.util.Scanner

// Created a DistanceConversion class to calculate distance in yard and miles
public class DistanceConversion{
	public static void main(String[] args){
	
	// Taking distance as input in feets 
	Scanner input = new Scanner(System.in);
	double distanceInFeet = input.nextDouble();
	
	// Converting into Yard and Miles
	double distanceInYard = distanceInFeet / 3;
	double distanceInMiles = distanceInYard / 1760;
	
	// Printing the distance in Yards and miles
	System.out.println("Distance in feet is " + distanceInFeet + " While in Yard is " + distanceInYard + " and miles is " + distanceInMiles);
	
	input.close();// Closing the Scanner Object 
	
	}

}