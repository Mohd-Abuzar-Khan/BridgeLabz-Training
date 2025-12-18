import java.util.Scanner;

public class PowerOfNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number and power as Input
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			System.out.println("Enter Power:");
			int power = sc.nextInt();
			
			
			//Initializing i for while loop
			int result = 1;

			
			// Checking If a number is a factor of the given input
			for (int i = 1; i <= power; i++){
				result = result * num;
			}
			
			// Displaying the Result
			System.out.println(power +" Power of " + num + " is " + result);
			
			
		sc.close(); // Closing the Scanner Object
	}
}