// Removing a character from a string using a method
import java.util.Scanner;

public class RemoveChar {
	
	// Created a method to remove a character from a string
	public static String removeCharacter(String str, char remove) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != remove)
				result += str.charAt(i);
		}
		return result;
	}



	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a stirng");
		String str = sc.nextLine();
		System.out.println("Enter a character to remove ");
		String ch = sc.nextLine();
		
		// Displaying result
		char result = removeCharacter(str , ch);
		System.out.println("The String " + str + " after removing character " + ch+ " is " + result);
		
		//Closing Scanner Object
		sc.close();
	}
}