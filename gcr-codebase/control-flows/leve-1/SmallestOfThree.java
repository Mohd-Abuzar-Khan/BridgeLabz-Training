import java.util.Scanner;

public class SmallestOfThree{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking 3 numbers as Input
			System.out.println("Enter the first number:");
			int num1 = sc.nextInt();
			System.out.println("Enter the Second number:");
			int num2 = sc.nextInt();
			System.out.println("Enter the Third number:");
			int num3 = sc.nextInt();
			
			// Checking if first number  is the smallest
			if (num1 < num2 && num1 < num3){
				System.out.println("Is the first number the Smallest? " + "Yes");
			} else {
				System.out.println("Is the first number the Smallest? " + "No");
			}
			
			
		sc.close(); // Closing the Scanner Object
	}
}