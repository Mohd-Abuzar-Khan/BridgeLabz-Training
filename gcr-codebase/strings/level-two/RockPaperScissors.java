import java.util.Scanner;

public class RockPaperScissors {

    // Creating a method to randomly generate a computer choice
    public static String computerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // Created a method to find winner
    public static String winner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        }
        if ((user.equals("Rock") && computer.equals("Scissors")) || (user.equals("Paper") && computer.equals("Rock")) || (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate the stats of who is winning 
    public static String[][] result(int userWins, int computerWins, int totalGames) {

        String[][] stats = new String[2][3];
        double userPercent = Math.round((userWins * 100.0 / totalGames) * 100) / 100.0;
        double computerPercent = Math.round((computerWins * 100.0 / totalGames) * 100) / 100.0;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(userPercent);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf(computerPercent);

        return stats;
    }

    // Method to Display final score of user and computer 
    public static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\nGame\tUser\t\tComputer\tWinner");
        System.out.println(" ");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" +  gameResults[i][0] + "\t\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }
        System.out.println("\n----- Final Result -----");
        System.out.println("Player\tWins");
        System.out.println(" ");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of games
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine(); 
        String[][] gameResults = new String[games][3];
        int userWins = 0, computerWins = 0;


		//Playing the game
        for (int i = 0; i < games; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();
            String computerChoice = computerChoice();
            String winner = winner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                computerWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        // Calculate statistics
        String[][] stats = result(userWins, computerWins, games);

        // Display all results
        displayResults(gameResults, stats);

        sc.close();
    }
}
