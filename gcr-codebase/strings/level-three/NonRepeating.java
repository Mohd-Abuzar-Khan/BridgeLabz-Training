// Program to find the first non-repeating character in a string using charAt()
import java.util.Scanner;

public class NonRepeating {

    // Method to find first non-repeating character
    public static char firstNonRepeating(String text) {
        int[] frequency = new int[256]; // ASCII characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // No non-repeating character found
    }

    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Find first non-repeating character
        char result = NonRepeatingCharacter.firstNonRepeating(text);

        // Display result
        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
    }
}