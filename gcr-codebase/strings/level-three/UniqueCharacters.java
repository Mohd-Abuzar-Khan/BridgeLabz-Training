// Program to find unique characters in a string using charAt()
import java.util.Scanner;

public class UniqueCharacters {

    // Method to find length of text without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception occurs when index goes out of bounds
        }
        return count;
    }

    // Method to find unique characters using charAt()
    public static char[] uniqueCharacter(String text) {
        int length = findLength(text);
        char[] tempArray = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            // Check if character appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create array of exact size
        char[] uniqueCharacters = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] = tempArray[i];
        }

        return uniqueCharacters;
    }

    // Method to display unique characters
    public static void display(char[] characters) {
        System.out.println("Unique Characters:");
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }
    }

    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Find unique characters
        char[] result = uniqueCharacter(text);

        // Display result
        display(result);

        sc.close();
    }
}