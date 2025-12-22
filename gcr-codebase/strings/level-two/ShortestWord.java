import java.util.Scanner;

public class ShortestWord {
	
	// Creating a method to find words in any given text
	public static String[] storeWords(String str){
		
		//Variable to Store Characters of Words and count number of words
		str = str.trim();
		String[] temp = new String[str.length()];
		String word = "";
		int count = 0;
		
		for (int i =0; i < str.length(); i++){
			if (str.charAt(i) == ' '){    //Looking for space to store word in array
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
	
	//Method to find the Shortest and Longest word in array
	public static int[] findShortAndLong(String[][] arr){
		int shortInd = 0;
		int longInd = 0;
		int shortLen = Integer.parseInt(arr[0][1]);
		int longLen = shortLen;
		
		for(int i = 1; i < arr.length; i++) {
			int currentLen = Integer.parseInt(arr[i][1]);
			
			if (currentLen < shortLen) {
				shortLen = currentLen;
                shortInd = i;
			}
			
			if (currentLen > longLen) {
                longLen = currentLen;
                longInd = i;
            }
		}
		
		return new int[]{shortInd, longInd};
	}
	
	
	
    public static void main(String[] args) {

		// Taking string as an input to calculate it's length
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str = sc.nextLine().trim();
		int count = 0;
		
		String[] words = storeWords(str);
		String[][] table = wordLength(words);
		int[] result = findShortAndLong(table);
		
		// Display table
        System.out.println("\nWord\t\tLength");
        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t\t" + len);
        }

        // Display shortest and longest words
        System.out.println("\nShortest word: " +
                table[result[0]][0]);

        System.out.println("Longest word: " +
                table[result[1]][0]);

        sc.close();
    }
}


