import java.util.Scanner;

public class FactorsOfNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			System.out.println("Factor of numbers "+ num + " are: " );
			

			
			// Checking If a number is a factor of the given input
			for (int i = 1; i <= num; i++){
				if (num % i == 0){
					System.out.println(i);
				}
			}
			
		sc.close(); // Closing the Scanner Object
	}
}