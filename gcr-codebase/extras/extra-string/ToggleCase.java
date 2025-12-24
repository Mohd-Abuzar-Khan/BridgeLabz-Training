// Checking for the longest word in a text
import java.util.Scanner;

public class ToggleCase {
	
	// Created a method to check occurence of a substring
	public static String toggleCase(String str) {
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z')
				arr[i] = (char)(arr[i] - 32);
			else if (arr[i] >= 'A' && arr[i] <= 'Z')
				arr[i] = (char)(arr[i] + 32);
		}
		return new String(arr);
	}

	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		
		//Removing duplicate
		String result = toggleCase(str);
		
		// Displaying result
		System.out.println("The string " + str + " after cnverting to toggle case " + result );
		sc.close();
	}
}