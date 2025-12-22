import java.util.Scanner;


public class FormatException {

    // Method that generates exception
    public static void generateException(String str) {
        System.out.println(
            "The number inside a string " + str + " is " + Integer.parseInt(str)
        );
    }

    // Method that handles exception properly
    public static void handleException(String str) {
        try {
           System.out.println(
            "The number inside a string " + str + " is " + Integer.parseInt(str)
			);
        } catch (Exception e) {
            System.out.println("[ Number format exception occurs ]");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.next();

        // Handling StringIndexOutOfBoundsException
        handleException(str);

        // Uncomment to see program crash
         generateException(str);

        sc.close();
    }
}
