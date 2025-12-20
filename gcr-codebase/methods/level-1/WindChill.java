// Importing dependencies to take input
import java.util.Scanner;

// Created a WindChill class to divide choclate among men 
public class WindChill{
	
	public static double  calculateWindChill(double temperature , double windSpeed){
		// Finding windChill
		double windChill = 35.74 + (0.6215 * temperature )+ ((0.4275 * temperature - 35.75) * windSpeed);
		return windChill;
	}
	
	public static void main(String[] args){
		
		//Taking wind speed and temperature as input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature:");
		double temperature = input.nextDouble();
		System.out.println("Enter windspeed");
		double windChill = input.nextDouble();
		
		// Checking wheter the number is positive , negative or zero;
		double  result = WindChill.calculateWindChill(temperature, windChill );
		
		// Displaying Result
		System.out.println("The wind chill is " + result);
		
		input.close(); // Closing Scanner Object
	}

}
