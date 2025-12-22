import java.util.Scanner;

public class SubstringComparison {
	
	// Method to create a substring of an array
	public static String creatingSubstring( String s1, int start, int end){
		StringBuilder result = new StringBuilder(); 
		for (int i = start ; i < end ; i++){
			result.append(s1.charAt(i));
		}
		//System.out.println(result);
		return result.toString();
	}
	
	public static void main(String[] args){
		
		//Taking 2 string as input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :" );
		String s1 = sc.next();
		System.out.println("Enter starting index of a substring " );
		int start = sc.nextInt();
		System.out.println("Enter end index of a substring " );
		int end = sc.nextInt();
		
		String firstString = s1.substring(start , end);
		String secondString = creatingSubstring(s1, start, end);
		
		//Calling isEqual Method to check if two substrings are equal or not
		if ( firstString.equals(secondString)){
			System.out.println("The substirng for index " + start + " to " + end + " is " + s1.substring(start, end) );
		}else{
			System.out.println("The substrings are not same" );
					System.out.println( s1.substring(start, end) );

		}
		
	}  
}