import java.util.Scanner;

public class NumberGuessGameUser {

    // Method to generate random number between range
    public static int generateRandomNumber(int start, int end) {
        return start + (int) (Math.random() * (end - start + 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = 1;
        int end = 100;
        int maxAttempts = 5;
        int attempts = 0;

        boolean isGuessed = false;

        int computerGuess = generateRandomNumber(start, end);

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it in " + maxAttempts + " attempts.");

        // Game loop
        while (attempts < maxAttempts && !isGuessed) {

            System.out.println("\nIs your number: " + computerGuess + " ?");
            System.out.println("1. Correct");
            System.out.println("2. Too High");
            System.out.println("3. Too Low");
            System.out.print("Enter your choice: ");

            int feedback = sc.nextInt();
            attempts++;

            switch (feedback) {

                case 1:
                    System.out.println("Bingo! I guessed your number in " + attempts + " attempts.");
                    isGuessed = true;
                    break;

                case 2:
                    // Guess was too high → reduce upper bound
                    end = computerGuess - 1;
                    break;

                case 3:
                    // Guess was too low → increase lower bound
                    start = computerGuess + 1;
                    break;

                default:
                    System.out.println("Invalid input. Please enter 1, 2, or 3.");
                    attempts--; // don't count invalid attempt
                    continue;
            }

            // Generate new guess if game continues
            if (!isGuessed && start <= end) {
                computerGuess = generateRandomNumber(start, end);
            }
        }

        // If attempts are over
        if (!isGuessed) {
            System.out.println("I ran out of attempts!");
            System.out.println("You win this round ");
        }

        sc.close();
    }
}
