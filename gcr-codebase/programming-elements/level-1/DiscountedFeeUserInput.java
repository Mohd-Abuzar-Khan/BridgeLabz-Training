// Importing Dependecies for taking input
import java.util.Scanner;

// Created a DiscountFeeUserInput class to Calculate fees after discount with user input
public class DiscountedFeeUserInput{
	public static void main(String[] args){
		
		// Taking Original fee and discount percentage as input
		Scanner input = new Scanner(System.in);
		double originalFee = input.nextDouble();
		double discountPercent = input.nextDouble();
		
		// Creating variables to calculate discount precentage , amount and fee
		double discountPercentage = (double)discountPercent / (double)100;
		double discountAmount = originalFee * discountPercentage;
		double discountedFee = originalFee - discountAmount;
		
		// Displaying the discount amount and discounted fee
		System.out.println("The discount amount is INR " + (int)discountAmount + " and final discounted fee is INR " + (int)discountedFee);
	}
	
		input.close(); //Closing the Scanner Object
}