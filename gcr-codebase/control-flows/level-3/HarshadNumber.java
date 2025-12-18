import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Initialize variables
        int sum = 0;
        int originalNumber = number;

        //  Use while loop till originalNumber becomes 0
        while (originalNumber != 0) {

            // Find the last digit
            int digit = originalNumber % 10;

            // Add digits to sum
            sum = sum + (digit * digit * digit);

            // Remove last digit
            originalNumber = originalNumber / 10;
        }

        // Compare sum with original number
        if (number % sum == 0) {
            System.out.println(number + " is an Harshad Number");
        } else {
            System.out.println(number + " is not an Harshad Number");
        }

        sc.close();
    }
}
