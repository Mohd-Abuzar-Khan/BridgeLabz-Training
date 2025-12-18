import java.util.Scanner;

public class WhileFizzBuzz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			while (num < 0){
				System.out.println("Enter a positive number:");
				num = sc.nextInt();
			}
			
			//Initializing i for while loop
			int i = 1;

			
			// Printing Fizz if divisible by 3 Buzz if divisible by 5 and FizzBuzz if by both
			while (i != num){
				if ((i % 3 == 0)&& (i % 5 == 0)){
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
				i = i + 1;
			}
			
		sc.close(); // Closing the Scanner Object
	}
}