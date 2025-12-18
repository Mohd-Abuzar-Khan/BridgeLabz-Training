import java.util.Scanner;

public class EvenAndOdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter Number:");
			int num = sc.nextInt();
			
			
			// Checking if numbers are even or odd
			for (int i = 1; i <= num; i++ ){
				if (i % 2 == 0){
					System.out.println("The number " + i + " is " + " Even");
				}else{
					System.out.println("The number " + i + " is " + " Odd");
				}
			}
			
		sc.close(); // Closing the Scanner Object
	}
}