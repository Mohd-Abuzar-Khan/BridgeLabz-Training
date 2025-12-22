import java.util.Scanner;

public class UpperCase {

    // Method that converts string to uppercase using ASCII values
    public static String convertingToUppercase(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int letter = ch;

            // Check if character is lowercase (a-z)
            if (letter >= 97 && letter <= 122) {
                letter = letter - 32; // Convert to uppercase
            }

            temp += (char) letter;
        }

        return temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to convert to Uppercase:");
        String str = sc.nextLine();

        String result = convertingToUppercase(str);
        System.out.println("Uppercase String: " + result);

        sc.close();
    }
}
