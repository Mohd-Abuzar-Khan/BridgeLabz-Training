// Importing dependencies for taking input
import java.util.Scanner;

public class HeightConversion{
	public static void main(String[] args){
		
		// Taking input in cm to Convert
		Scanner input = new Scanner(System.in);
		double cm = input.nextDouble();
		
		//Converting cm into inches and feet by creating a variable
		double inch = cm / 2.54;
		double foot = inch / 12;
		
		// Displaying the Inouted height in inch and foot
		System.out.println("Your Height in cm is " + cm + " While in feet is " + foot + " and inches is " + inch);
	}
		input.close(); // Close the Scanner Object
}