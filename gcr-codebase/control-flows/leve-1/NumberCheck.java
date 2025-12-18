import java.util.Scanner;

public class NumberCheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter Number:");
			int num = sc.nextInt();
			
			// Checking if number is positive, negative or zero;
			if ( num > 0){
				System.out.println("Positive");
			} else if (num < 0){
				System.out.println("Negative");
			}else{
				System.out.println("Zero");
			}
			
		sc.close(); // Closing the Scanner Object
	}
}