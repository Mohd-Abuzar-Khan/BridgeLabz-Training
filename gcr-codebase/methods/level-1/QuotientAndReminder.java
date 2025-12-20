// Importing dependencies to take input
import java.util.Scanner;

// Created a QuotientAndReminder class to find quotient and remainder
public class QuotientAndReminder{
	
	public static double[]  findingQuotientAndReminder(int num1 , int num2){
		double ans[] = new double[2];
		// Finding quotient and reminder of two number
		double quotient = (double) num1 / (double)num2;
		double reminder = num1 % num2;
		ans[0] = quotient;
		ans[1] = reminder;
		return ans;
	}
	
	public static void main(String[] args){
		
		//Taking 2 number as input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = input.nextInt();
		System.out.println("Enter the second number:");
		int num2 = input.nextInt();
		
		// Checking wheter the number is positive , negative or zero;
		double  result[] = QuotientAndReminder.findingQuotientAndReminder(num1, num2 );
		
		// Displaying Result
		System.out.println("The quotient of two number is  " + result[0] );
		System.out.println("The remainder of two number is  " + result[1] );
		
		input.close(); // Closing Scanner Object
	}

}
