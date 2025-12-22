// Program to check palindrome using three different logics
import java.util.Scanner;

public class Palindrome {

    // Method for logic one using start and end
    public static boolean iterate(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Created a method to check using recursive
    public static boolean recursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }

        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return recursive(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    public static String reverse(String text) {

        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    // Logic 3: Using character arrays
    public static boolean usingArray(String text) {

        String reversed = IsPalindrome.reverse(text);
        char[] originalArray = text.toCharArray();
        char[] reverseArray = reversed.toCharArray();

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Calling all the method to check the answer
        boolean result1 = IsPalindrome.iterate(text);
        boolean result2 = IsPalindrome.recursive(text, 0, text.length() - 1);
        boolean result3 = IsPalindrome.usingArray(text);

        // Display result
        System.out.println("Palindrome using Iterative Method : " + result1);
        System.out.println("Palindrome using Recursive Method : " + result2);
        System.out.println("Palindrome using Array Method     : " + result3);

        sc.close();
    }
}