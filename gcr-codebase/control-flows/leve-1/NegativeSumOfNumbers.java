import java.util.Scanner;

public class NegativeSumOfNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter Number:");
			double num = sc.nextDouble();

			// Define variable number and sum initialized to zero 
			double number = num;
			double sum = 0;
			

			// Run while loop to access each digit of number
			while (number != 0 ) {
				number  = sc.nextDouble();
				sum = sum + number;
				
				// If the user enters a negative value
				if (number < 0){
					break;
				}
			}

			// Print the sum and close the Scanner Stream
			System.out.println("The sum of digit of number is " + 
								sum); 
			
			sc.close(); // Closing the Scanner Object
	}
}