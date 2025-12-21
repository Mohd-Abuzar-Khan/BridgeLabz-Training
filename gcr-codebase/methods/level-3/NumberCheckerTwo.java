// Create NumberChecker class to check Harshad Number and digit frequency
import java.util.Scanner;

public class NumberCheckerTwo {

	// Method to count digits
	public static int countDigits(int number) {
		int count = 0;
		int temp = number;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		return count;
	}

	// Method to store digits in array
	public static int[] getDigits(int number, int count) {
		int[] digits = new int[count];
		int temp = number;
		for (int i = count - 1; i >= 0; i--) {
			digits[i] = temp % 10;
			temp = temp / 10;
		}
		return digits;
	}

	// Method to find sum of digits
	public static int sumOfDigits(int[] digits) {
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += digits[i];
		}
		return sum;
	}

	// Method to find sum of squares of digits
	public static int sumOfSquares(int[] digits) {
		int sum = 0;
		for (int i = 0; i < digits.length; i++) {
			sum += Math.pow(digits[i], 2);
		}
		return sum;
	}

	// Method to check Harshad Number
	public static boolean isHarshadNumber(int number, int sum) {
		return number % sum == 0;
	}

	// Method to find digit frequency
	public static int[][] findDigitFrequency(int[] digits) {
		int[][] freq = new int[10][2];
		
		for (int i = 0; i < 10; i++) {
			freq[i][0] = i;
			freq[i][1] = 0;
		}

		for (int i = 0; i < digits.length; i++) {
			freq[digits[i]][1]++;
		}
		return freq;
	}

	public static void main(String[] args) {
		
		//Creating object of Scanner class
		Scanner input = new Scanner(System.in);
	
		
		//Taking user input
		System.out.print("Enter a number: ");
		int number = input.nextInt();
	
		
		//Calling method to compute digit count, digits, sum of digits, squareSum
		int count = countDigits(number);
		int[] digits = getDigits(number, count);
		int sum = sumOfDigits(digits);
		int squareSum = sumOfSquares(digits);


		//Calling method to check harshad number and displaying result
		System.out.println("Sum of Digits: " + sum);
		System.out.println("Sum of Squares of Digits: " + squareSum);
		System.out.println("Harshad Number: " + isHarshadNumber(number, sum));
		int[][] frequency = findDigitFrequency(digits);
		
		
		//Displaying digit frequency
		System.out.println("\nDigit\tFrequency");
		for (int i = 0; i < frequency.length; i++) {
			if (frequency[i][1] > 0) {
				System.out.println(frequency[i][0] + "\t" + frequency[i][1]);
			}
		}

		input.close();
	}
}