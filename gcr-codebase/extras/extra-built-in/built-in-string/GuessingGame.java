// Number Guessing Game
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

	// Method to generate computer guess
	public static int generateGuess(int low, int high) {
		Random rand = new Random();
		return rand.nextInt(high - low + 1) + low;
	}

	// Method to get user feedback
	public static String getFeedback(Scanner sc) {
		System.out.println("Is the guess High, Low or Correct?");
		return sc.nextLine();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int low = 1, high = 100;
		String feedback = "";

		System.out.println("Think of a number between 1 and 100");

		while (!feedback.equalsIgnoreCase("correct")) {
			int guess = generateGuess(low, high);
			System.out.println("Computer guesses: " + guess);

			feedback = getFeedback(sc);

			if (feedback.equalsIgnoreCase("high"))
				high = guess - 1;
			else if (feedback.equalsIgnoreCase("low"))
				low = guess + 1;
		}

		System.out.println("Computer guessed correctly!");
		sc.close();
	}
}
