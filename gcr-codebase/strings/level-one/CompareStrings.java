import java.util.Scanner;

public class CompareStrings {
	
	// Method to check if strings are the same
	public static boolean isEqual(String s1, String s2){
		if (s1.length() != s2.length()){ //Checking the base case if the two string have same length
			return  false;
		} else{
				for (int i = 0 ; i < s1.length(); i++){
						if ( s1.charAt(i) == s2.charAt(i)){
							continue;
						} else{
							return false;
						}
				}
			return true;
		}
	}
	
	public static void main(String[] args){
		
		//Taking 2 string as input 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to compare:" );
		String s1 = sc.next();
		System.out.println("Enter another stirng to compare:" );
		String s2 = sc.next();
		
		//Calling isEqual Method to check if two strings are equal or not
		if ( s1.equals(s2) && isEqual(s1,s2)){
			System.out.println("The two strings " + s1 + " and " + s2  + " are equal." );
		}else{
			System.out.println("The two strings " + s1 + " and " + s2  + " are not equal." );
		}
		
	}  
}