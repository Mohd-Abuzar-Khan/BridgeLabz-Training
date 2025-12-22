import java.util.Scanner;

public class VowelCount {
	
	// Method to Convert string into lower string
	public static String convertingToLowercase(String s1) {
        String temp = "";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int letter = ch;

            // Check if character is lowercase (a-z)
            if (letter >= 65 && letter <= 90) {
                letter = letter + 32; // Convert to uppercase
            }

            temp += (char) letter;
        }

        return temp;
    }

    // Method that converts string to Lowercase and count Vowels and Consotant
    public static void calculatingVowel(String str) {
        int vowel  = 0;
		int consonants = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char temp = Character.toLowerCase(str.charAt(i));

			if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
				vowel++;
			} else if (temp >= 'a' && temp <= 'z') {
				consonants++;
			}
		}
		System.out.println("Vowels: " + vowel);
		System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {

		// Taking string as an input to calculate it's length
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to calculating the count of vowel and Consonants");
        String s1 = sc.nextLine();
		
		String str = convertingToLowercase(s1);
        calculatingVowel(str);

        sc.close();
    }
}


