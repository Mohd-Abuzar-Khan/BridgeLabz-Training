import java.util.Scanner;

public class Below100{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			System.out.println("Factor of numbers "+ num + " are: " );
			if (num < 100 && num > 0){
				
				//Initializing i for while loop
				int i = num - 1;

				// Checking If a number is a factor of the given input and prinitng it if it's below 100
				while (i != 0){
					if (num % i == 0){
						System.out.println(i);
					}
					i = i - 1;
				}
				
			}
			
			
		sc.close(); // Closing the Scanner Object
	}
}