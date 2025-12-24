// GCD and LCM Calculator
import java.util.Scanner;

public class GCDAndLCM {

	// Method to calculate GCD
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	// Method to calculate LCM
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

	public static void main(String[] args) {

		//Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		//Displaying result
		System.out.println("GCD: " + gcd(a, b));
		System.out.println("LCM: " + lcm(a, b));

		//Closing the Scanner Object
		sc.close();
	}
}
