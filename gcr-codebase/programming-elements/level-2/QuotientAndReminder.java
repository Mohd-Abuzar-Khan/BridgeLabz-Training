// Importing dependencies to take input
import java.util.Scanner;

//Created QuotientAndReminder Class to find Quotient and Reminder
public class QuotientAndReminder{
	public static void main(String[] args){
	
		//Taking 2 number as input
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		// Finding quotient and reminder of two number
		double quotient = (double) num1 / (double)num2;
		double reminder = num1 % num2;
		
		// printing quotient and reminder
		System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number "+num1+" and "+num2);
		
		input.close(); // Closing Scanner Object
	}
}