import java.util.Scanner;

public class CountDownUsingLoop{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter Number:");
			int count = sc.nextInt();
			
			// Checking if counter reaches to 1 using for loop
			for ( count = count ; count > 0; count--){
				System.out.println(count);
			} 
			
		sc.close(); // Closing the Scanner Object
	}
}