import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Formatter for date input
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        int finePerDay = 5;

        System.out.println("Welcome to Library Reminder App ");

        // Loop for 5 books
        for (int i = 1; i <= 5; i++) {

            System.out.println("\n------------------------------------");
            System.out.println("Book " + i);

            // Input due date
            System.out.print("Enter Due Date (dd-MM-yyyy): ");
            String dueDateInput = sc.next();
            LocalDate dueDate = LocalDate.parse(dueDateInput, formatter);

            // Input return date
            System.out.print("Enter Return Date (dd-MM-yyyy): ");
            String returnDateInput = sc.next();
            LocalDate returnDate = LocalDate.parse(returnDateInput, formatter);

            // Calculate late days
            long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);

            if (lateDays > 0) {
                long fine = lateDays * finePerDay;
                System.out.println("Book returned late by " + lateDays + " days.");
                System.out.println("Fine to be paid: " + fine);
            } else {
                System.out.println("Book returned on time. No fine!");
            }
        }

        System.out.println("\n All books processed successfully!");
        System.out.println("Thank you for using the Library Reminder App ");

        sc.close();
    }
}
