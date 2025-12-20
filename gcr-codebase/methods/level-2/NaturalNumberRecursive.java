// Importing dependencies to take input
import java.util.Scanner;
import java.lang.Math;

// Created a NaturalNumberRecursive class to find the sum of all the recursive number 
public class NaturalNumberRecursive{
	
	public static int calculateSumOfNaturalNumber(int  num){
		// Calculating Sum through Recursion
		 if (num == 0) { // Base case: factorial of 0 is 1
            return 0;
        } else {
            return num + calculateSumOfNaturalNumber(num - 1); // Recursive case
        }
	}
	
	public static void main(String[] args){
		
		//Taking wind speed and temperature as input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		
		// Calling calculateTrigonometricFunctions metthod
		int sum = NaturalNumberRecursive.calculateSumOfNaturalNumber(num);
		int sumByFormula = (num*(num + 1))/2;
		
		//Display Result
		if ( sum == sumByFormula){
		System.out.println("Sum of all the natural number is " + sum );
		}
		
		
		input.close(); // Closing Scanner Object
	}

}

