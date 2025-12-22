import java.util.Scanner;

public class LengthOfString {

    // Method that converts string to uppercase using ASCII values
    public static void calculatingLength(String str) {
        int count  = 0;
		int i = 0;
		try {
			while( i != 100) {
				int a = str.charAt(i);
				i++;
				count++;
			}
		} catch (Exception e) {
				System.out.println("The length of the string is " + count);
		}
    }

    public static void main(String[] args) {

		// Taking string as an input to calculate it's length
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to calculating it's length");
        String str = sc.nextLine();

        calculatingLength(str);

        sc.close();
    }
}
