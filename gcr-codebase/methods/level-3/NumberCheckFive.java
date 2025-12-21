import java.util.Scanner;

//Creating a NumberCheckFive class to check number is perfect, abundant, deficient, and strong number
 public class NumberCheckFive {

	//Method to compute sum of divisors
	public static int sumOfDivisors(int number) {
		int sum = 0;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) sum += i;
		}
		return sum;
	}

	//Method to check number is perfect
	public static boolean isPerfect(int number) {
		return sumOfDivisors(number) == number;
	}

	//Method to check number is abundant
	public static boolean isAbundant(int number) {
		return sumOfDivisors(number) > number;
	}

	//Method to check number is deficient
	public static boolean isDeficient(int number) {
		return sumOfDivisors(number) < number;
	}

	//Method to find the factorial of number
	public static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) fact *= i;
		return fact;
	}

	//Method to check number is strong
	public static boolean isStrong(int number) {
		int temp = number, sum = 0;
		while (temp > 0) {
			sum += factorial(temp % 10);
			temp /= 10;
		}
		return sum == number;
	}

	public static void main(String[] args) {
		
		//Creating the object of scanner class
		Scanner input = new Scanner(System.in);
		
		
		//Taking user input
		System.out.print("Enter number: ");
		int number = input.nextInt();

		//Calling methods and displaying results
		System.out.println("Perfect: " + isPerfect(number));
		System.out.println("Abundant: " + isAbundant(number));
		System.out.println("Deficient: " + isDeficient(number));
		System.out.println("Strong: " + isStrong(number));

		input.close();
	}
}