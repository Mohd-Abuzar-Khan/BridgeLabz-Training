import java.util.Scanner;

public class FactorialUsingLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter Number:");
			int num = sc.nextInt();
			
			// Initializing a variable to check the factorial
			int factorial = 1;
			
			// Calculating Factorial using for Loop
			for (int i = 1; i <= num; i++ ){
				factorial = factorial * i;
			}
			
			// Printing the factorial of the number 
			System.out.println("Factorial of the number " + num + " is " + factorial);
			
		sc.close(); // Closing the Scanner Object
	}
}