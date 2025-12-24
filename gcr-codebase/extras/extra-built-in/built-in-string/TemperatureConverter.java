// Temperature Converter
import java.util.Scanner;

public class TemperatureConverter {

	// Celsius to Fahrenheit
	public static double celsiusToFahrenheit(double c) {
		return (c * 9 / 5) + 32;
	}

	// Fahrenheit to Celsius
	public static double fahrenheitToCelsius(double f) {
		return (f - 32) * 5 / 9;
	}

	public static void main(String[] args) {

		//Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature");
		double temp = sc.nextDouble();

		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("2. Fahrenheit to Celsius");
		int choice = sc.nextInt();
		
		//Displaying result
		if (choice == 1)
			System.out.println("Result: " + celsiusToFahrenheit(temp));
		else
			System.out.println("Result: " + fahrenheitToCelsius(temp));

		//Closing the Scanner Object
		sc.close();
	}
}
