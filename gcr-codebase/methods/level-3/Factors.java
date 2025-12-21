import java.util.Scanner;

//Creating a Factors class to compute factors of a number and perform various operations
public class Factors {
	
	//Method to compute factors of number
	public static int[] getFactors(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) count++;
		}
		int[] factors = new int[count];
		int index = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				factors[index++] = i;
			}
		}
		return factors;
	}
	
	//Method to compute greatest factors of number
	public static int greatestFactor(int[] factors) {
		return factors[factors.length - 1];
	}

	//Method to compute sum of factors of number
	public static int sumOfFactors(int[] factors) {
		int sum = 0;
		for (int f : factors) sum += f;
		return sum;
	}

	//Method to compute product factors of number
	public static long productOfFactors(int[] factors) {
		long product = 1;
		for (int f : factors) product *= f;
		return product;
	}

	//Method to compute cube factors of number
	public static double cubeProduct(int[] factors) {
		double product = 1;
		for (int f : factors) product *= Math.pow(f, 3);
		return product;
	}

	
	public static void main(String[] args) {
		
		//Creating object of scanner class
		Scanner input = new Scanner(System.in);

		//Taking user input
		System.out.print("Enter number: ");
		int number = input.nextInt();

		//Calling method to compute factors of number
		int[] factors = getFactors(number);
		
		//Calling methods and displaying results
		System.out.println("Greatest Factor: " + greatestFactor(factors));
		System.out.println("Sum: " + sumOfFactors(factors));
		System.out.println("Product: " + productOfFactors(factors));
		System.out.println("Cube Product: " + cubeProduct(factors));

		input.close();
	}
}