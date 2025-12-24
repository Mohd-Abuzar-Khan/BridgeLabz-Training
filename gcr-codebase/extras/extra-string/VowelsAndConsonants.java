// Counting Vowels and Consonants using methods
import java.util.Scanner;

public class VowelsAndConsonants {
	
	// Created a method to count and display vowels and consonats
	public static void countVowelsConsonants(String str) {
		int vowels = 0, consonants = 0;
		str = str.toLowerCase();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if (ch >= 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
				vowels++;
			} else {
				consonants++;
			}
		}
		
		//Displaying result
		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);
	}
	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text :")
		String str = sc.nextLine();
		
		// Displaying result
		countVowelsConsonants(str);
		
		sc.close();
	}
}