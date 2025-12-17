// Importing Dependencies to take input from user
import java.util.Scanner;

public class KilometersToMilesUserInput{
	public static void main(String[] args){
		
		// Creating variables for km and miles
		double km,  miles;
		
		// Taking kilometer as input from user"
		Scanner input = new Scanner(System.in);
		km = input.nextInt();
		
		//Converting kilometer to miles 
		miles = km * 0.625;
		
		// Displaying the miles after Conversion
		System.out.println("The total miles is " + miles + " for the given " +km + "km");
	}
		input.close();// Closing the Scanner Object
}