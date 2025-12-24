// Created a program to display time in different time zone
import java.time.*;
import java.util.Scanner;

public class DateArithmetic {
	public static void main(String[] args) {
		
	// Taking date input
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (YYYY-MM-DD): ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate);

        // Adding time
        LocalDate afterAddition = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtracting weeks
        LocalDate finalDate = afterAddition.minusWeeks(3);
		
		// Displaying result
		System.out.println("\nOriginal Date: " + date + "\nAfter adding 7 days, 1 month, 2 years: " + afterAddition + "\nAfter subtracting 3 weeks: " + finalDate);

		
	}
}

