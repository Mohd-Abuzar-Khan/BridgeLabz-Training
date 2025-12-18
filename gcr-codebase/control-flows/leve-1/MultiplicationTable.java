import java.util.Scanner;

public class MultiplicationTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter a number:");
			int num = sc.nextInt();

			
			// Printing Multiplication table of that Number
			for (int i = 6; i < 10; i++ ){
				System.out.println(num + " x " + i + " = " + num * i);
			}
			
		sc.close(); // Closing the Scanner Object
	}
}