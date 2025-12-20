// Importing dependencies to take input
import java.util.Scanner;

// Created a NaturalNumberSum class to find the sum of all the natural number 
public class NaturalNumberSum {
	
	public static int sumOfNaturalNumber(int num ){
		int sum = 0;
		while(num != 0){
				sum = sum + num;
				num = num - 1;
			}
		return sum;
	}
	
	public static void main(String[] args){
		
		// Taking number as Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		// Checking wheter the number is positive , negative or zero;
		int result = NaturalNumberSum.sumOfNaturalNumber(num );
		
		// Displaying Result
		System.out.println("Sum of all natural number of number " + num + " is : " + result);
		
		sc.close(); // Closing Scanner Object
	}

}
