// Importing dependencies to take input
import java.util.Scanner;

// Created a PositiveAndNegative class to find if a number is positive, negatve and zero 
public class PositiveAndNegative{
	
	public static int checkingNumbers(double num){
		int ans =  0;
		if ( num > 0){
				 ans = 1;
				} else if (num < 0){
				 ans = -1;
				}else{
				 ans = 0;
		}
		return ans;
	}
	
	public static void main(String[] args){
		
		// Taking number as input 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number to check if it is positive, negative or zero");
		double num = input.nextDouble();
		
		// Calculating Number of round require to complete 5 Km
		int result = PositiveAndNegative.checkingNumbers(num );
		
		// Prinitng Number of possible Handshake
		System.out.println(" The Number  "+num+ " is "  + result);
		
		input.close(); // Closing Scanner Object
	}

}

