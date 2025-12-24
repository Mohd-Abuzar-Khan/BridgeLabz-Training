// Created a program to display time in different time zone
import java.time.*;
import java.util.Scanner;

public class DateComparison {
	public static void main(String[] args) {
	
		// Taking first date input
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first date (YYYY-MM-DD): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        // Taking second date input
        System.out.print("Enter second date (YYYY-MM-DD): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        // Comparing dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME.");
        }
		
		sc.close();
	}
}

