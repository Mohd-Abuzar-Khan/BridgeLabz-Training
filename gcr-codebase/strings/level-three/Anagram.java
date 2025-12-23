// Program to check if two texts are anagrams
import java.util.Scanner;

public class Anagram{

    // Method to check anagram using ASCII frequency array
    public static boolean isAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];
		
        for (int i = 0; i < text1.length(); i++) {
            char ch = text1.charAt(i);
            frequency1[ch]++;
        }
		
        for (int i = 0; i < text2.length(); i++) {
            char ch = text2.charAt(i);
            frequency2[ch]++;
        }
		
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();
		
        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // Check anagram
        boolean result = Anagram.isAnagram(text1, text2);

        // Display result
        if (result) {
            System.out.println("The given texts are ANAGRAMS");
        } else {
            System.out.println("The given texts are NOT ANAGRAMS");
        }

        sc.close();
    }
}