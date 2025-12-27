import java.util.Scanner;

public class SmartCard {

    // Method to calculate fare
    public static int calculateFare(int distance) {
        return isDistanceGreaterThanFive(distance) ? 50 : 35;
    }

    // Check if distance is more than 5 km
    public static boolean isDistanceGreaterThanFive(int distance) {
        return distance > 5;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your initial balance: ");
        int balance = sc.nextInt();

        while (true) {

            System.out.print("Enter distance to travel (0 to exit): ");
            int distance = sc.nextInt();

            // Exit condition
            if (distance == 0) {
                System.out.println("Thanks for traveling with us!");
                break;
            }

            int fare = calculateFare(distance);

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: " + fare);
                System.out.println("Remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance. Please recharge.");
                break;
            }
        }

        sc.close();
    }
}
