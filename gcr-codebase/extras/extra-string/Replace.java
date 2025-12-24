// Replacing a given word with another word in a sentence
import java.util.Scanner;

public class Replace {
	
	// Created a method that replaces a given word with another word in a sentence
	public static String replaceWord(String sentence, String oldWord, String newWord) {
		String[] words = sentence.split(" ");
		String result = "";

		for (String word : words) {
			if (word.equals(oldWord))
				result += newWord + " ";
			else
				result += word + " ";
		}
		return result.trim();
	}

	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a stirng");
		String str = sc.nextLine();
		System.out.println("Enter the word to replace");
		String oldWord = sc.nextLine();
		System.out.println("Enter the word to replace with");
		String newWord = sc.nextLine();
		
		// Displaying result
		String result = replaceWord(str , oldWord, newWord);
		System.out.println("The String " + str + " after replacing the word " + oldWord+ " with " + newWord+" is " + result);
				
		//Closing Scanner Object
		sc.close();
	}
}