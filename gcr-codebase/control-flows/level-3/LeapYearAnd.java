import java.util.Scanner;

public class LeapYearAnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Year as Input
        System.out.println("Enter a Year:");
        int year = sc.nextInt();

        // Checking if the year is a Leap Year using &&
        if (year >= 1582 && 
           ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {

            System.out.println(year + " is a Leap Year");

        } else {
            System.out.println(year + " is not a Leap Year");
        }

        sc.close(); // Closing the Scanner Object
    }
}
