import java.util.Scanner;

public class MovieTicketBookingApp {

    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Flag to control looping for multiple customers
        boolean continueBooking = true;

        // Loop runs until user chooses to exit
        while (continueBooking) {

            int ticketPrice = 0;   // Stores movie + seat price
            int snackPrice = 0;    // Stores snack price
			
			 System.out.println("\n=======================================");
            System.out.println("      WELCOME TO CINEVERSE       ");
            System.out.println("=======================================");

            // Display movie options
            System.out.println("\nWelcome to Movie Ticket Booking ");
            System.out.println("Select Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Horror");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            int movieChoice = sc.nextInt();

            // Exit option
            if (movieChoice == 0) {
                System.out.println("Thank you for visiting! See you next time ");
                break; // Exit the loop
            }

            // Movie selection using switch
            switch (movieChoice) {
                case 1:
                    ticketPrice = 200;
                    System.out.println("You selected Action Movie");
                    break;
                case 2:
                    ticketPrice = 180;
                    System.out.println("You selected Comedy Movie");
                    break;
                case 3:
                    ticketPrice = 220;
                    System.out.println("You selected Horror Movie");
                    break;
                default:
                    System.out.println("Invalid choice! Returning to menu...");
                    continue; // Restart loop
            }

            // Seat selection
            System.out.println("\nSelect Seat Type:");
            System.out.println("1. Gold (+100)");
            System.out.println("2. Silver (+50)");
            int seatChoice = sc.nextInt();

            if (seatChoice == 1) {
                ticketPrice += 100;
            } else if (seatChoice == 2) {
                ticketPrice += 50;
            } else {
                System.out.println("Invalid seat choice. No extra charge applied.");
            }

            // Snack selection
            System.out.println("\nDo you want snacks?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int snackChoice = sc.nextInt();

            if (snackChoice == 1) {
                System.out.println("Choose Snack:");
                System.out.println("1. Popcorn (80)");
                System.out.println("2. Nachos (100)");

                int snackOption = sc.nextInt();

                if (snackOption == 1) {
                    snackPrice = 80;
                } else if (snackOption == 2) {
                    snackPrice = 100;
                }
            }

            // Calculate total bill
            int totalBill = ticketPrice + snackPrice;

            // Display final bill
            System.out.println("\n Total Bill: " + totalBill);

            // Ask user if they want to continue
            System.out.println("\nDo you want to book another ticket?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            int choice = sc.nextInt();

            if (choice != 1) {
                continueBooking = false;
                System.out.println("Thanks for booking! Enjoy your movie");
            }
        }

        // Close scanner to avoid resource leak
        sc.close();
    }
}
