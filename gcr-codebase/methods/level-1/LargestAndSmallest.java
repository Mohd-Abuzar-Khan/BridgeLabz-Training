// Importing dependencies to take input
import java.util.Scanner;

// Created a LargestAndSmallest class to find the sum of all the natural number 
public class LargestAndSmallest {
	
	public static int largestNumber(int num1, int num2, int num3 ){
		int largest = 0;
			// Checking for the Largest of three
			if (num1 > num2 && num1 > num3){
				largest = num1;
			} else if (num2 > num1 && num2 > num3){
				largest = num2;
			} else if (num3 > num2 && num3 > num1){
				largest = num3;
			} 
		return largest;
	}
	public static int smallestNumber(int num1, int num2, int num3 ){
		int smallest = 0;
			// Checking for the Largest of three
			if (num1 < num2 && num1 < num3){
				smallest = num1;
			} else if (num2 < num1 && num2 < num3){
				smallest = num2;
			} else if (num3 < num2 && num3 < num1){
				smallest = num3;
			} 
		return smallest;
	}
	
	public static void main(String[] args){
		
		// Taking number as Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number:");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third number:");
		int num3 = sc.nextInt();
		
		// Checking wheter the number is positive , negative or zero;
		int largest = LargestAndSmallest.largestNumber(num1, num2, num3 );
		int smallest = LargestAndSmallest.smallestNumber(num1, num2, num3 );
		
		// Displaying Result
		System.out.println("The largest of three number is  " + largest );
		System.out.println("The smallest of three number is  " + smallest );
		
		
		sc.close(); // Closing Scanner Object
	}

}