// Create NumberChecker class to perform digit-based operations
import java.util.Scanner;

public class NumberChecker {

	// Method to count digits in a number
	public static int countDigits(int number) {
		int count = 0;
		int temp = number;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		return count;
	}

	// Method to store digits of number in array
	public static int[] getDigits(int number, int count) {
		int[] digits = new int[count];
		int temp = number;
		for (int i = count - 1; i >= 0; i--) {
			digits[i] = temp % 10;
			temp = temp / 10;
		}
		return digits;
	}

	// Method to check Duck Number
	public static boolean isDuckNumber(int[] digits) {
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] == 0) {
				return true;
			}
		}
		return false;
	}

	// Method to check Armstrong Number
	public static boolean isArmstrongNumber(int number, int[] digits) {
		int sum = 0;
		int power = digits.length;
		for (int i = 0; i < digits.length; i++) {
			sum += Math.pow(digits[i], power);
		}
		return sum == number;
	}

	// Method to find largest and second largest digit
	public static int[] findLargestSecondLargest(int[] digits) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] > largest) {
				secondLargest = largest;
				largest = digits[i];
			} 
			else if (digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
			}
		}
		return new int[]{largest, secondLargest};
	}

	// Method to find smallest and second smallest digit
	public static int[] findSmallestSecondSmallest(int[] digits) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < digits.length; i++) {

			if (digits[i] < smallest) {
				secondSmallest = smallest;
				smallest = digits[i];
			} 
			else if (digits[i] < secondSmallest && digits[i] != smallest) {
				secondSmallest = digits[i];
			}
		}
		return new int[]{smallest, secondSmallest};
	}

	public static void main(String[] args) {
		//creating object of scanner class
		Scanner input = new Scanner(System.in);

		//Taking user input
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		
		//Calling method to count digit
		int count = countDigits(number);
		int[] digits = getDigits(number, count);


		//Calling methods and displaying results
		System.out.println("Duck Number: " + isDuckNumber(digits));
		System.out.println("Armstrong Number: " + isArmstrongNumber(number, digits));

		int[] largest = findLargestSecondLargest(digits);
		System.out.println("Largest Digit: " + largest[0]);
		System.out.println("Second Largest Digit: " + largest[1]);

		int[] smallest = findSmallestSecondSmallest(digits);
		System.out.println("Smallest Digit: " + smallest[0]);
		System.out.println("Second Smallest Digit: " + smallest[1]);

		input.close();
	}
}