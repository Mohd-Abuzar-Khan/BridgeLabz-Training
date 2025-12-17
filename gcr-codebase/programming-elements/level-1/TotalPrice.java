// Importing dependencies to take input
import java.util.Scanner;

// Created TotalPrice class to find total price of a product
public class TotalPrice{
	public static void main(String[] args){
		
		//Taking quantity and unit price as Input 
		Scanner input = new Scanner(System.in);
		double unitPrice = input.nextDouble();
		double quantity = input.nextDouble();
		
		// Calculating total price
		double totalPrice = quantity * unitPrice;
		
		// Printing total price 
		System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR " + unitPrice);
		
		input.close();// Closing the Scanner Object
	}
}