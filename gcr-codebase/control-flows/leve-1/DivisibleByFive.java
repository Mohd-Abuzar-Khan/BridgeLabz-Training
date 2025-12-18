import java.util.Scanner;

public class DivisibleByFive{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Taking Input from user
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		
		//Checking if number is divisible by 5
		if ( num % 5 == 0 ){
			System.out.println("Is the number " + num + " divisible by 5? " + "Yes");
		} else {
			// Number is not divisible by 5
			System.out.println("Is the number " + num +" divisible by 5? " + "No");
		}
		
		
		sc.close(); // Closing the Scanner Object
	}
}