import java.util.Scanner;

// Created a class NumberGuessGame to check if user can guess a number between 1 to 100 in 5 attempts
public class NumberGuessGame {
	
	// Method to create a random number for user to guess
	public static int randomNumber(int start, int end){
		int res = start + (int)(Math.random() * (end - start + 1));
		return res;
	}
	
	
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Initializing start and end variable for range of computer guess
		int start = 1;
		int end = 100;
		int computerGuess = randomNumber(start, end);
		int attempts = 0;
		
		// Initializing flags for the continuite of while loop till these conditions are true
		boolean numberFound = true;
		boolean runOutOfAttempts = true;
		
		
		// Using Do-While loop to check if user can guess the number
		do {
			
			// Asking user to enter a guess to compare it with computer guess
			System.out.println("Please Enter your guess: ");
			int userGuess = sc.nextInt();
			attempts++;
			
			// Ending the while loop when user run out of attempts
			if (attempts == 5) {
				System.out.println("You are out of attempts to guess the number");
				break;
			} else {
				if (userGuess > computerGuess) {
					System.out.println("Feedback : your guess is too high");
					System.out.println("You have " + (5 - attempts) + " attempts left");
				}else if (userGuess < computerGuess) {
					System.out.println("Feedback : your guess is too low");
					System.out.println("You have " + (5 - attempts) + " attempts left");
				} else if (userGuess == computerGuess) {
					System.out.println("Congratulation! you have guessed correctly");
					 numberFound = false;
			}
			
		}
		}while(runOutOfAttempts && numberFound);
		
        sc.close();
    }
}
