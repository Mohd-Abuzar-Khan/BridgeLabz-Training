// Program to display calendar for a given month and year
import java.util.Scanner;

public class Calendar {

    // Method to get month name
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Created a method to check for leap year
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    // Created a method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    //  Created a method to get first day of month (Gregorian calendar)
    public static int getFirstDay(int month, int year) {

		int day = 1;
		int yearCalulation = year - (14 - month) / 12;
		int temp = yearCalulation + (yearCalulation / 4) - (yearCalulation / 100) + (yearCalulation / 400);
		int monthCalculation = month + 12 * ((14 - month) / 12) - 2;
		int dayCalculation = (day + temp + ((31 * monthCalculation) / 12)) % 7;

		return dayCalculation;
    }

    //  Created a method to display calendar
    public static void displayCalendar(int month, int year) {

        System.out.println("\n\t" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDay(month, year);
        int numberOfDays = getDaysInMonth(month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print days of month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

		// Taking month and year as input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        displayCalendar(month, year);

        sc.close();
    }
}