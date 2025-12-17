// Importing dependencies for taking user input
import java.util.Scanner;

// Creating Calculator Class for performing multiple operation on two input
public class Calculator{
	public static void main(String[] args){
		
		// Taking two number as Input
		Scanner input = new Scanner(System.in);
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		
		//Performing Operations on the two input numbers by creating variable
		float add = number1 + number2;
		float subtract = number1 - number2;
		float divide = number1 / number2;
		float multiply = number1 * number2;
		
		//Displaying the result of all these operations
		System.out.println("The addition, subtraction, multiplication and division value of two numbers " + number1 + " and " + number2 + " is " + add + ", " + subtract + ", " + multiply + " and " + divide);

		input.close(); //Closing the  Scanner Object
	}
}