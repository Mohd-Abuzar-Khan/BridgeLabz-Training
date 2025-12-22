import java.util.Scanner;
import java.util.Arrays;


public class Split {
	
	// Method to create array of words in a text
	public static String[] storeWords(String str){
		
		str = str.trim();
		String[] temp = new String[str.length()];
		
		//Variable to Store Characters of Words and count number of words
		String word = "";
		int count = 0;
		
		for (int i =0; i < str.length(); i++){
			
			//Looking for space to store word in array
			if (str.charAt(i) == ' '){
					if (!word.equals("")){
						temp[count] = word;
						count++;
						word= "";
					}
				} else {
						word = word + str.charAt(i);
				}
		}
		
		// Store Last word
		if (!word.equals("")) {
			temp[count] = word;
			count++;
		}
		
		// Create another array to return 
		String ans[] = new String[count];
		for (int i =0 ; i < count; i ++){
			ans[i] = temp[i];
		}
		
		return ans;
	}
	
	
	//Method to find the length of Stirng 
	public static int findLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
	
	
	//Method to take array as input and return 2D array 
	public static String[][] wordLength(String[] words){
		
		String[][] result = new String[words.length][2];
		
		for (int i =0 ; i < words.length; i++){
			result[i][0] = words[i];
			result[i][1] = String.valueOf(findLength(words[i]));
		}
		
		return result;
	}
	
	
	// Main Method to Call and Display Result
	public static void main(String[] args){
		
		
        Scanner sc = new Scanner(System.in);

        // Taking user input and Creating 2D array of word and length
        System.out.println("Enter a sentence:");
        String input = sc.nextLine().trim();
        String[] words = storeWords(input);
        String[][] table = wordLength(words);
		
		
		// Displaying result
		System.out.println("\nWord\t\tLength");
		for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]); // convert String to int
            System.out.println(table[i][0] + "\t\t" + length);
        }

        sc.close();
	}
}