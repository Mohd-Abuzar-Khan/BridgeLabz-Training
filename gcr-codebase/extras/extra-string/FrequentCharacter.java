// Checking for most frequent character in a text
import java.util.Scanner;

public class FrequentCharacter {
	
	// Created a method to check for most frequent character
	public static char mostFrequentChar(String str) {
		int[] freq = new int[256];
		int max = 0;
		char result = ' ';

		for (char ch : str.toCharArray()) {
			freq[ch]++;
			if (freq[ch] > max) {
				max = freq[ch];
				result = ch;
			}
		}
		return result;
	}



	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a stirng");
		String str = sc.nextLine();
		
		// Displaying result
		char result = mostFrequentChar(str);
		System.out.println("The most frequent character in the string " + str + " is " + result);
		
		//Closing Scanner Object
		sc.close();
	}
}