import java.util.Scanner;

public class GreatestFactor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter a number:");
			int num = sc.nextInt();

			
			// Checking If a number is a greatest factor of the given input
			for (int i = num - 1; i > 1; i--){
				if (num % i == 0){
					System.out.println("The greatest Factor beside the number itself is " + i);
					break;
				}
			}
			
		sc.close(); // Closing the Scanner Object
	}
}