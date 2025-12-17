import java.util.Scanner;
public class DiscountedFeeUserInput{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double originalFee = input.nextDouble();
		double discountPercent = input.nextDouble();
		double discountPercentage = (double)discountPercent / (double)100;
		double discountAmount = originalFee * discountPercentage;
		double discountedFee = originalFee - discountAmount;
		System.out.println("The discount amount is INR " + (int)discountAmount + " and final discounted fee is INR " + (int)discountedFee);
	}
}