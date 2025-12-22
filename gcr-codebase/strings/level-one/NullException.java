import java.util.Scanner;
import java.util.Arrays;

public class NullException {

    // Method to create a character array from a string
    public static void generateException(String text) {
		System.out.println("Exception Method is generated : " + text.length());
    }
	
	public static void handleException(String text) {
		try {
			System.out.println("Exception Method is generated : " + text.length());
		} catch (NullPointerException e){
			System.out.println("Null pointer exception  is handled" );
		}
    }

    public static void main(String[] args) {
		
		//Creating a null pointer 
		String text = null;

        // Checking null pointer exception
        //generateException(text);
		
		//Checking Handeling of null pointer exception
		handleException(text);

    }
}
