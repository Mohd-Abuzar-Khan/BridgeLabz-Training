// Program to find frequency of characters using unique characters
import java.util.Scanner;

public class FrequencyLoop{

    // Method to find unique characters using charAt()
    public static char[] uniqueCharacter(String text) {
        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create array of exact size
        char[] uniqueCharacters = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueCharacters[i] = temp[i];
        }

        return uniqueCharacters;
    }

    // Method to find frequency using ASCII array and unique characters
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];
        // Count frequency of characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacter(text);

        // Store result in 2D array
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return result;
    }

    // Method to display result
    public static void display(String[][] data) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < data.length; i++) {
            System.out.println("\t" + data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Find frequency using unique characters
        String[][] result = findFrequency(text);

        // Display result
        display(result);

        sc.close();
    }
}