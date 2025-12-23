// Checking if a string is palindrome or not
import java.util.Scanner;

public class Palindrome {
	
	// Created a method to check if a string is palindrome
	public static boolean isPalindrome(String str) {
		int left = 0, right = str.length() - 1;

		while (left < right) {
			if (str.charAt(left) != str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text to check if it's palindrome:");
		String str = sc.nextLine();
		
		// Displaying result
		if (isPalindrome(str)) {
			System.out.println("The string " + str + " is a palindrome" );
		} else {
			System.out.println("The string " + str + " is not a palindrome" );
		}
		sc.close();
	}
}