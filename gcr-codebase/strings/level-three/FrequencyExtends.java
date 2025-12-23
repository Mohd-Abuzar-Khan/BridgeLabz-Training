// Program to find frequency of characters in a string using charAt()
import java.util.Scanner;

public class FrequencyExtends {
	
	// Created a method to find frequency of a character and returning a 1D array
	public static String[] findingFrequency(String text){
		int frequency[] = new int[256];
		
		for(int i = 0; i < text.length(); i++ ) {
			char ch = text.charAt(i);
			frequency[ch]++;
		}
		
		String result[] = new String[text.length()];
		int count = 0;
		int index = 0;
		
		for (int ch : frequency) {
			if (ch > 0) {
				char character = (char) index;
				String freq = Integer.toString(frequency[index]);
				result[count] = character + "\t \t " + freq;
				count++;
			}
			index ++;
		}
		
		return result;
	}
    // Method to display result
    public static void display(String[] data) {
        System.out.println("Character\tFrequency");
        for (int i = 0; i < data.length; i++) {
			if (data[i] == null ) {
				break;
			}
            System.out.println(data[i]);
        }
    }

    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        String[] result = findingFrequency(text);

        // Display result
        display(result);

        sc.close();
    }
}