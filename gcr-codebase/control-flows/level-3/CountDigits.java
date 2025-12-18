import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get integer input
        System.out.println("Enter an integer:");
        int number = sc.nextInt();

        int count = 0;

        // Handle the case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Loop until number becomes 0
            while (number != 0) {
                number = number / 10; // Remove last digit
                count++;              // Increase count
            }
        }

        // Display result
        System.out.println("Number of digits: " + count);

        sc.close();
    }
}
