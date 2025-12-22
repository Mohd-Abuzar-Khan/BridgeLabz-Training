import java.util.Scanner;
import java.util.Arrays;

public class IllegalArguments {

    // Method to print each character of a string with out of bound error
    public static void generateException(String str) {
		System.out.println("Substring for the string " + str + "  is " + str.substring(4,3) );
    }
	
	public static void handleException(String str) {
		try {
			System.out.println("Substring for the string " + str + "  is " + str.substring(4,3) );	
		} catch (Exception e){
			System.out.println("[ Illegal Argument is passed in a method ]"  );	
		}
		
    }

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :" );
		String str = sc.next();
		
		//Checking Handeling of null pointer exception
		handleException(str);
		
		// Checking null pointer exception
        generateException(str);

    }
}
