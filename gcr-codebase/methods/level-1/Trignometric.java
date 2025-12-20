// Importing dependencies to take input
import java.util.Scanner;
import java.lang.Math;

// Created a Trignometric class to perform trignometric functions on a method
public class Trignometric{
	
	public static void calculateTrigonometricFunctions(double angle){
		// Calculating Trignometric Functions
		double radian = Math.toRadians(angle);
		double sine = Math.sin(radian);
		double cos = Math.cos(radian);
		double tan =  Math.tan(radian);
		
		
		// Displaying Result
		System.out.println("The sine for the angle is " + sine);
		System.out.println("The cos for the angle is " + cos);
		System.out.println("The tan for the angle is " + tan);
		
	}
	
	public static void main(String[] args){
		
		//Taking wind speed and temperature as input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an angle:");
		double angle = input.nextInt();
		
		// Calling calculateTrigonometricFunctions metthod
		calculateTrigonometricFunctions(angle);
		
		
		
		input.close(); // Closing Scanner Object
	}

}
