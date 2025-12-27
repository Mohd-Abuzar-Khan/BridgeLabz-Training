import java.util.Scanner;

public class ElectionManager {
	
	// Method to check if a person is eligible to vote
	public static void EligibileToVote(int age){
		
		if (age >= 18) {
			System.out.print("This person is eligible to vote");
		} else {
			System.out.print("This person is not eligible to vote");
			
		}
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
		while (true) {
		
			System.out.print("Enter voter's age or enter 0 to quit: ");
			int age = sc.nextInt();
			if (age <= 0) {
				break;
			}
			
			EligibileToVote(age);
			
		}
        

        sc.close();
    }
}
