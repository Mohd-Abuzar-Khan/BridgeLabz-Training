// Checking if a string has duplicate char and removing it
import java.util.Scanner;

public class DuplicateRemoval {
	
	// Created a method to check for duplicate char and remove it
	public static String removeDuplicates(String str) {
		boolean[] visited = new boolean[256];
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!visited[ch]) {
				visited[ch] = true;
				result += ch;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text to remove duplicate:");
		String str = sc.nextLine();
		
		//Removing duplicate
		String result = removeDuplicates(str);
		
		// Displaying result
		System.out.println("The string " + str + " after removing duplicates becomes " + result );
		sc.close();
	}
}