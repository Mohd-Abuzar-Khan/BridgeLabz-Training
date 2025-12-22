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
	
	
	// Main Method to Call and Display Result
	public static void main(String[] args){
		
		 // Taking input from the user
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        // Calling the method
        String[] words = storeWords(str);
		String[] result = str.split(" ");
		
		//Comparing Methods 
		if (Arrays.equals(words, result)){
			// Printing words stored in the array
				System.out.println("Words in the array :");
				for(String c : words) {
					System.out.print("[" +c + "] " );
				}
		} else {
				System.out.println("Words in the array are not Same  :(");
		}
				//System.out.println(words.);
				//System.out.println(str.split(" "));
				//for(String c : words) {
				//	System.out.print(c + "  , " );
				//}
				//System.out.println();
				//for(String c : result) {
				//	System.out.print(c + "  , " );
				//}
		

        sc.close();
	}
}