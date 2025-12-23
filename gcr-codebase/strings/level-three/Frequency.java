// Program to find frequency of characters in a string using charAt()
import java.util.Scanner;

public class Frequency {

    // Method to find frequency of characters and return 2D array
    public static String[][] finidingFrequency(String text) {
        int[] frequency = new int[256]; 
		
        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Count number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCount++;
            }
        }

        // Create 2D array to store result
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Store character and its frequency
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
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
        String[][] result = finidingFrequency(text);

        // Display result
        display(result);

        sc.close();
    }
}