// Fibonacci Sequence Generator
import java.util.Scanner;

public class Fibonacci {

	// Method to print Fibonacci sequence
	public static void generateFibonacci(int terms) {
		int a = 0, b = 1;

		for (int i = 1; i <= terms; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}

	public static void main(String[] args) {

		//Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms");
		int terms = sc.nextInt();
		
		//Displaying result
		generateFibonacci(terms);
		
		//Closing the Scanner Object
		sc.close();
	}
}
