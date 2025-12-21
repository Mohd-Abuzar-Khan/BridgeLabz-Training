import java.util.Scanner;

//Creating NumberCheckerThree class to check given number is prime, neon, automorphic and spy number
public class NumberCheckerThree {
	
	//Creating  a method to check prime number
	public static boolean isPrime(int number) {
		if (number <= 1) return false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) return false;
		}
		return true;
	}
	
	//Method to check number is neon
	public static boolean isNeon(int number) {
		int square = number * number;
		int sum = 0;
		while (square > 0) {
			sum += square % 10;
			square /= 10;
		}
		return sum == number;
	}
	
	
	//Method to check number is spy
	public static boolean isSpy(int number) {
		int sum = 0, product = 1;
		while (number > 0) {
			int d = number % 10;
			sum += d;
			product *= d;
			number /= 10;
		}
		return sum == product;
	}

	//Method to check number is Automorphic
	public static boolean isAutomorphic(int number) {
		int square = number * number;
		return String.valueOf(square).endsWith(String.valueOf(number));
	}

	//Method to check number is buzz
	public static boolean isBuzz(int number) {
		return number % 7 == 0 || number % 10 == 7;
	}

	public static void main(String[] args) {
		
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter number: ");
		int number = input.nextInt();

		//Calling method to compute and displaying results
		System.out.println("Prime: " + isPrime(number));
		System.out.println("Neon: " + isNeon(number));
		System.out.println("Spy: " + isSpy(number));
		System.out.println("Automorphic: " + isAutomorphic(number));
		System.out.println("Buzz: " + isBuzz(number));

		input.close();
	}
}