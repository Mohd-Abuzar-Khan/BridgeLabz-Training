import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to the number
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit loop if divisible
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }

        sc.close();
    }
}
