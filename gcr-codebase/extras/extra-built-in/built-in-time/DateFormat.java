// Created a program to display time in different time zone
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateFormat {
	public static void main(String[] args) {
		
		// Taking current date as input
        LocalDate currentDate = LocalDate.now();

        // Define formatters
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		
		// Displaying result
		System.out.println("\nIn dd/MM/yyyy format :" + currentDate.format(format1) + "\nIn yyyy-MM-dd : " + currentDate.format(format2) + "\nIn format EEEE, MMM dd, yyyy: " + currentDate.format(format3));

		
	}
}

