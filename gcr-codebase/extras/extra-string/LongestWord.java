// Checking for the longest word in a text
import java.util.Scanner;

public class LongestWord {
	
	// Created a method to check for the longest word in a text
	public static String longestWord(String sentence) {
		String[] words = sentence.split(" ");
		String longest = "";

		for (String word : words) {
			if (word.length() > longest.length())
				longest = word;
		}
		return longest;
	}
	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text to find longest word");
		String str = sc.nextLine();
		
		//Removing duplicate
		String result = longestWord(str);
		
		// Displaying result
		System.out.println("The string " + str + " has the longest word " + result );
		sc.close();
	}
}