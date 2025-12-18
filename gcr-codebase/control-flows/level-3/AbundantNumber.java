import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input number
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        // Initialize variables
        int sum = 0;
		int i = 1; 

        //  Use while loop to find and add all  divisor of Number
        while (i != number) {
			
			if (number % i == 0){
				// Add divisor to sum
				sum = sum + (i);
			}
			i = i+1;
        }

        // Compare sum with original number
        if (number < sum) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }

        sc.close();
    }
}
