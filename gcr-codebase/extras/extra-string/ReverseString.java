// Counting Vowels and Consonants using methods
import java.util.Scanner;

public class ReverseString {
	
	// Created a method to count and display vowels and consonats
	public static String reverseString(String str) {
		char arr[] = str.toCharArray();
		int left = 0, right = arr.length - 1;
		
		while(left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		return new String(arr);
	}
	
	public static void main(String[] args) {
		
		//Taking text as an input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text to reverse:");
		String str = sc.nextLine();
		
		// Displaying result
		System.out.println("The reverse string is " + reverseString(str));
		
		sc.close();
	}
}