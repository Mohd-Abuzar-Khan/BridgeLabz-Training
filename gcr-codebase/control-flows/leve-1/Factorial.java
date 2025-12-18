import java.util.Scanner;

public class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter Number:");
			int num = sc.nextInt();
			
			// Initializing a variable to check the factorial
			int factorial = 1;
			
			// Calculating Factorial using While Loop
			while (num != 0){
				factorial = factorial * num;
				num = num - 1;
			}
			
			//Printing the factorial of the number 
			System.out.println("Factorial of the number " + num + " is " + factorial);
			
		sc.close(); // Closing the Scanner Object
	}
}