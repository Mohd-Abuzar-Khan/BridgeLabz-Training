import java.util.Scanner;

public class LargestOfThree{
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
			if (num1 > num2 && num1 > num3){
				System.out.println("Is the first number the largest? " + "Yes");
			} else {
				System.out.println("Is the first number the largest? " + "No");
			}
			
			// Checking if second number  is the smallest
			if (num2 > num1 && num2 > num3){
				System.out.println("Is the Second number the largest? " + "Yes");
			} else {
				System.out.println("Is the second number the largest? " + "No");
			}
			
			// Checking if Third number is the smallest
			if (num3 > num2 && num3 > num1){
				System.out.println("Is the third number the largest? " + "Yes");
			} else {
				System.out.println("Is the third number the largest? " + "No");
			}
			
			
		sc.close(); // Closing the Scanner Object
	}
}