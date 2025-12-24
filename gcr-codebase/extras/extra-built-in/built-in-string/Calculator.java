// Basic Calculator
import java.util.Scanner;

public class Calculator {

	public static int add(int a, int b) { 
	return a + b; 
	}
	public static int subtract(int a, int b) { 
	return a - b; 
	}
	public static int multiply(int a, int b) { 
	return a * b; 
	}
	public static int divide(int a, int b) { 
	return a / b; 
	}

	public static void main(String[] args) {

		//Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide");
		int choice = sc.nextInt();

		//Displaying result
		switch (choice) {
			case 1: System.out.println(add(a, b)); break;
			case 2: System.out.println(subtract(a, b)); break;
			case 3: System.out.println(multiply(a, b)); break;
			case 4: System.out.println(divide(a, b)); break;
			default: System.out.println("Invalid choice");
		}

		//Closing the Scanner Object
		sc.close();
	}
}
