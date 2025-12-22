import java.util.Scanner;

public class LowerCase {

    // Method that converts string to uppercase using ASCII values
    public static String convertingToLowercase(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int letter = ch;

            // Check if character is lowercase (a-z)
            if (letter >= 65 && letter <= 90) {
                letter = letter + 32; // Convert to uppercase
            }

            temp += (char) letter;
        }

        return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert to Lowercase:");
        String str = sc.nextLine();

        String result = convertingToLowercase(str);
        System.out.println("Lowercase String: " + result);

        sc.close();
    }
}
