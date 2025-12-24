// Palindrome Checker
import java.util.Scanner;

public class Palindrome2 {

	// Method to check palindrome
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
		
		//Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		//Displaying result
		if (isPalindrome(str))
			System.out.println("The string is a Palindrome");
		else
			System.out.println("The string is not a Palindrome");

		sc.close();
	}
}
