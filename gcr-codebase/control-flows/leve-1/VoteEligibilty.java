import java.util.Scanner;

public class VoteEligibilty{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking age as Input
			System.out.println("Enter Age:");
			int age = sc.nextInt();
			
			// Checking if person is eligible to vote
			if ( age >= 18){
				System.out.println("The person's age is " + age +" and can vote.");
			} else {
				System.out.println("The person's age is " + age +" and cannot vote.");
			}
			
			
		sc.close(); // Closing the Scanner Object
	}
}