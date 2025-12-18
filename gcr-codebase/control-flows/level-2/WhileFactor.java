import java.util.Scanner;

public class WhileFactorsOfNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			System.out.println("Factor of numbers "+ num + " are: " );
			
			
			//Initializing i for while loop
			int i = 1;

			
			// Checking If a number is a factor of the given input
			while (i != num){
				if (num % i == 0){
					System.out.println(i);
				}
				i = i + 1;
			}
			
		sc.close(); // Closing the Scanner Object
	}
}