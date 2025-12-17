// Created a DiscountedFee class to Calculate dicount on original fee
public class DiscountedFee{
	public static void main(String[] args){
		
		// Created a variable to indicate Original fee before discount
		int originalFee = 125000;
		
		// Created a variable to calculate Discount Percentage
		double discountPercentage = (double)10/(double)100;
		
		// Created a variable to calculate Discount amount 
		double discountAmount = originalFee * discountPercentage;
		
		// Created a variable to calculate Discounted fee
		double discountedFee = originalFee - discountAmount;
		
		// Displaying the dicount amount and discounted fee
		System.out.println("The discount amount is INR " + (int)discountAmount + " and final discounted fee is INR " + (int)discountedFee);
	}
}