import java.util.Scanner;


public class ArrayIndex {

    // Method that generates exception
    public static void generateException(int[] arr) {
		System.out.println(
            "The number inside the array are : (Unhandled) "
			);
        for (int i = 0; i < arr.length + 1 ; i++){
			System.out.print(arr[i] + " , ");
		}
    }

    // Method that handles exception properly
    public static void handleException(int[] arr) {
        try {
          System.out.println(
				"The number inside the array are : (Handled) "
				);
			for (int i = 0; i < arr.length + 1; i++){
				System.out.print(arr[i] + " , ");
			}
			System.out.println();
        } catch (Exception e) {
            System.out.println("[ Array out of bound index occurs ]");
        }
    }

    public static void main(String[] args) {

        int arr[] = new int[10];
		for (int i = 0; i < arr.length ; i++){
			arr[i] = i;
		}

        // Handling StringIndexOutOfBoundsException
        handleException(arr);

        // Uncomment to see program crash
         generateException(arr);

    }
}
