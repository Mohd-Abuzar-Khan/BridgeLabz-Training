// Importing dependencies to take input
import java.util.Scanner;

// Created a DividingOfChoclate class to divide choclate among men 
public class DividingOfChoclate{
	
	public static int[]  dividingOfChoclate(int numberOfChoclate , int numberOfChildren){
		int ans[] = new int[2];
		// Finding quotient and reminder of two number
		int choclatePerStudent = numberOfChoclate / numberOfChildren;
		int remainingChoclate =  numberOfChoclate % numberOfChildren;
		ans[0] = choclatePerStudent;
		ans[1] = remainingChoclate;
		return ans;
	}
	
	public static void main(String[] args){
		
		//Taking 2 number as input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of choclate:");
		int numberOfChoclate = input.nextInt();
		System.out.println("Enter number of children:");
		int numberOfChildren = input.nextInt();
		
		// Checking wheter the number is positive , negative or zero;
		int  result[] = DividingOfChoclate.dividingOfChoclate(numberOfChoclate, numberOfChildren );
		
		// Displaying Result
		System.out.println("The number of choclate per student is  " + result[0] );
		System.out.println("The number of remaining choclate  is  " + result[1] );
		
		input.close(); // Closing Scanner Object
	}

}
