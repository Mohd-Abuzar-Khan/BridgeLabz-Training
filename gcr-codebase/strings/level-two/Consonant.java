import java.util.Scanner;

public class VowelCount {
	
	// Method to Convert string into lower string
	public static char convertToLower(char ch) {
        int ascii = ch;
        if (ascii >= 65 && ascii <= 90) {
            ascii = ascii + 32;
        }
        return (char) ascii;
    }

    // Method that converts string to Lowercase and count Vowels and Consotant
    public static String checkCharacterType(char ch) {
        ch = convertToLower(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } 
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } 
        else {
            return "Not a Letter";
        }
    }
	
	//Method to create a 2D array with character and type
	 public static String[][] findVowelsAndConsonants(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }
	
	//Method to display 2D array in tabular form
	public static void displayResult(String[][] data) {
        System.out.println("\nCharacter\tType");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }
	
	
    public static void main(String[] args) {

		// Taking string as an input to calculate it's length
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String[][] result = findVowelsAndConsonants(input);

        // Display
        displayResult(result);

        sc.close();
    }
}


