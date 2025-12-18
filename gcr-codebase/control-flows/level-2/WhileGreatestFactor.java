import java.util.Scanner;

public class WhileGreatestFactor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter a number:");
			int num = sc.nextInt();

			int counter = num - 1;
			
			// Checking If a number is a greatest factor of the given input
			while (counter != 0){
				if (num % counter == 0){
					System.out.println("The greatest Factor beside the number itself is "  + counter);
					break;
				}
				counter = counter - 1;
			}
			
		sc.close(); // Closing the Scanner Object
	}
}