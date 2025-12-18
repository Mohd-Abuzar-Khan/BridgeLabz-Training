import java.util.Scanner;

public class MultipleOfNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			System.out.println("Multiple of number "+ num + " below 100 are: " );
			if (num < 100 && num > 0){
				
				//Initializing counter for while loop
				int counter = num - 1;

				// Checking If a number is a factor of the given input and prinitng it if it's below 100 using continue
				while (counter != 0){
					counter = counter - 1;
					if (num % counter != 0){
						continue;
					}
					System.out.println(counter);
				}
				
			}
			
			
		sc.close(); // Closing the Scanner Object
	}
}