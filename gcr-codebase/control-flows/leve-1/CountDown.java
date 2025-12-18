import java.util.Scanner;

public class CountDown{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter Number:");
			int count = sc.nextInt();
			
			// Checking if counter reaches to 1
			while ( count != 0){
				System.out.println(count);
				count = count - 1;
			} 
			
		sc.close(); // Closing the Scanner Object
	}
}