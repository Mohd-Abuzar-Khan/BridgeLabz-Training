import java.util.Scanner;
import java.util.Arrays;

public class OutOfBound {

    // Method to print each character of a string with out of bound error
    public static void generateException(String str) {
		for (int i = 0; i < str.length() + 1; i++){
			System.out.print(str.charAt(i) + "  ,");
		}
    }
	
	public static void handleException(String str) {
		try {
			for (int i = 0; i < str.length() + 1; i++){
				System.out.print(str.charAt(i) + "  ,");
			}
		} catch (StringIndexOutOfBoundsException e){
			System.out.println("[Index out of bound]" );
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
