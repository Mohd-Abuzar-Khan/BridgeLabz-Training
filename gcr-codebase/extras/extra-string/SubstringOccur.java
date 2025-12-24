// Checking for the occurence of a substring in a string
import java.util.Scanner;

public class SubstringOccur {
	
	// Created a method to check occurence of a substring
	public static int countSubstring(String str, String sub) {
    int count = 0;

	// Checking for substring using substring method and loop
    for (int i = 0; i <= str.length() - sub.length(); i++) {
        if (str.substring(i, i + sub.length()).equals(sub))
            count++;
    }
    return count;
}

	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		System.out.println("Enter a substring to find in the string");
		String sub = sc.nextLine();
		
		//Removing duplicate
		int result = countSubstring(str , sub);
		
		// Displaying result
		System.out.println("The string " + str + " has occuernce of Substring" + sub + " is " + result );
		sc.close();
	}
}