import java.util.Scanner;

public class NaturalNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Taking Input to check for Natural Number
		System.out.println("Enter a Number:")
		int num = sc.nextInt();
		
		
		//Checking if a number is Natural Number
		if (num > 0){
			int sum = (num*(num + 1))/2;
			System.out.println("The sum of " + num +" natural numbers is " + sum);
		}else{
			System.out.println("The number "+ num +" is not a natural number");
		}
		
		
		sc.close(); // Closing the Scanner Object
	}
}