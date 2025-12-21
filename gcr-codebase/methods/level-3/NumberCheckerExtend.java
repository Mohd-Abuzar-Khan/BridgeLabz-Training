//Creating NumberCheckerExtend class to compute number is palindrome or not
import java.util.Scanner;

public class NumberCheckerExtend {
	
	//Method to count digits
	public static int countDigits(int number) {
		int count = 0;
		while (number > 0) {
			count++;
			number /= 10;
		}
		return count;
	}

	//Method to extract digits
	public static int[] getDigits(int number, int count) {
		int[] digits = new int[count];
		for (int i = count - 1; i >= 0; i--) {
			digits[i] = number % 10;
			number /= 10;
		}
		return digits;
	}
	
	
	//Method to reverse array
	public static int[] reverseArray(int[] array) {
		int[] rev = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			rev[i] = array[array.length - 1 - i];
		}
		return rev;
	}
	
	Method to compare arrays
	public static boolean compareArrays(int[] a, int[] b) {
		if (a.length != b.length) return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) return false;
		}
		return true;
	}

	//Method to check duck number
	public static boolean isDuckNumber(int[] digits) {
		for (int d : digits) {
			if (d == 0) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);
	
		//Taking user input
		System.out.print("Enter number: ");
		int number = input.nextInt();

		//Calling Method and displaying result
		int count = countDigits(number);
		int[] digits = getDigits(number, count);
		int[] reversed = reverseArray(digits);

		System.out.println("Palindrome: " + compareArrays(digits, reversed));
		System.out.println("Duck Number: " + isDuckNumber(digits));

		input.close();
	}
}