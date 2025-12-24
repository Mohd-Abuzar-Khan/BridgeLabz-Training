// Compare two string in lexicographically order to see which one comes before
import java.util.Scanner;

public class Compare {
	
	// Created a method to compare two string in lexicographically order
	public static void compareStrings(String s1, String s2) {
		int min = Math.min(s1.length(), s2.length());

		for (int i = 0; i < min; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (s1.charAt(i) < s2.charAt(i))
					System.out.println(s1 + " comes before " + s2);
				else
					System.out.println(s2 + " comes before " + s1);
				return;
			}
		}

		if (s1.length() < s2.length())
			System.out.println(s1 + " comes before " + s2);
		else
			System.out.println(s2 + " comes before " + s1);
	}


	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first stirng");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string");
		String str2 = sc.nextLine();
		
		// Displaying result
		compareStrings(str1, str2);
		
		//Closing Scanner Object
		sc.close();
	}
}