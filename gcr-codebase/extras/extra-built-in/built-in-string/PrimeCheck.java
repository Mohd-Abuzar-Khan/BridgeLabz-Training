// Prime Number Checker
import java.util.Scanner;

public class PrimeCheck {

	// Method to check prime
	public static boolean isPrime(int num) {
		if (num <= 1) return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		//Taking Input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		//Displaying Result
		if (isPrime(num))
			System.out.println(num + " is a Prime Number");
		else
			System.out.println(num + " is not a Prime Number");

		sc.close();
	}
}
