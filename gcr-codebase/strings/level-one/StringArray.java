import java.util.Scanner;
import java.util.Arrays;

public class StringArray {

    // Method to create a character array from a string
    public static char[] creatingArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        System.out.println("First array: " + Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {

        // Taking string input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] firstArray = creatingArray(str);
        char[] secondArray = str.toCharArray();

        // Comparing two character arrays
        if (Arrays.equals(firstArray, secondArray)) {
            System.out.println("The arrays are equal");
            System.out.println(" Array of character : " + Arrays.toString(secondArray));
        } else {
            System.out.println("The arrays are not equal");
        }

        sc.close();
    }
}
