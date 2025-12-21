// Create Calendar class to display calendar of given month and year
import java.util.Scanner;

public class Calendar {

	// Method to check leap year
	public static boolean isLeapYear(int year) {
		if (year % 400 == 0) {
			return true;
		}
		if (year % 100 == 0) {
			return false;
		}
		return year % 4 == 0;
	}

	// Method to get month name
	public static String getMonthName(int month) {

		String[] months = {
			"January","February","March","April","May","June",
			"July","August","September","October","November","December"
		};
		return months[month - 1];
	}

	// Method to get number of days in month
	public static int getDaysInMonth(int month, int year) {

		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

		if (month == 2 && isLeapYear(year)) {
			return 29;
		}
		return days[month - 1];
	}

	// Method to get first day of month
	public static int getFirstDay(int month, int year) {
		
		int day = 1;
		int yearCalulation = year - (14 - month) / 12;
		int temp = yearCalulation + (yearCalulation / 4) - (yearCalulation / 100) + (yearCalulation / 400);
		int monthCalculation = month + 12 * ((14 - month) / 12) - 2;
		int dayCalculation = (day + temp + ((31 * monthCalculation) / 12)) % 7;

		return dayCalculation;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter month : ");
		int month = input.nextInt();

		System.out.println("Enter year: ");
		int year = input.nextInt();
		System.out.println(getMonthName(month) + " " + year);
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		int firstDay = getFirstDay(month, year);
		int days = getDaysInMonth(month, year);

		// Indentation before first day
		for (int i = 0; i < firstDay; i++) {
			System.out.print("    ");
		}

		// Print days
		for (int day = 1; day <= days; day++) {
			System.out.printf("%3d ", day);

			if ((day + firstDay) % 7 == 0) {
				System.out.println();
			}
		}

		input.close();
	}
}