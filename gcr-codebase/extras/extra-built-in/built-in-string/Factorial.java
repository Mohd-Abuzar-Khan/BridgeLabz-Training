// Factorial using recursion
import java.util.Scanner;

public class Factorial {

	// Recursive method to calculate factorial
	public static int factorial(int num) {
		if (num == 0 || num == 1)
			return 1;
		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		
		//Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		//Displaying result
		int result = factorial(num);
		System.out.println("Factorial is: " + result);

		//Closing the Scanner Object
		sc.close();
	}
}
