// Checking if a string is anagram or not
import java.util.Scanner;

public class Anagram {
	
	// Created a method to check if a string is anagram or not
	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) return false;

		int[] freq = new int[256];

		for (char ch : s1.toCharArray())
			freq[ch]++;
		for (char ch : s2.toCharArray())
			freq[ch]--;

		for (int count : freq)
			if (count != 0) return false;

		return true;
	}



	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a stirng");
		String s1 = sc.nextLine();
		System.out.println("Enter an0ther stirng");
		String s2 = sc.nextLine();
		
		// Displaying result
		if (isAnagram(s1, s2)) {
			System.out.println("The String " + s1 + " is a anagram of" + s2);
		} else {
			System.out.println("The String " + s1 + " is not a anagram of " + s2);
		}
				
		//Closing Scanner Object
		sc.close();
	}
}