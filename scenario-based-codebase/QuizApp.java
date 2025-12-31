import java.util.Scanner;

public class QuizApp {
	
	
	public static void play(String[][] questions){
		Scanner sc = new Scanner(System.in);
		int score = 0;
		int res;
		System.out.println("-----------------------------------------");
		System.out.println("------------ Enter a Choice -------------");
		System.out.println("------------------------------------------");
		for(int i = 0; i < 5; i++){
			System.out.println("\n------------Question "+ i + "----------\n");
			System.out.println(questions[i][0]);
			System.out.println("------------------------------------>");
			String ans = sc.next().toUpperCase();
			if(questions[i][1].equalsIgnoreCase(ans)){
			    res = 1;
			}else{
				res = 2;
			}
			
			switch(res) {
				case 1:
					System.out.println("------------------------------------>");
					System.out.println("Correct Answer");
					score++;
					break;
				case 2:
					System.out.println("------------------------------------>");
					System.out.println("Wrong Answer");
					break;
					
			}
			
			
		}
		
			System.out.println("------------------------------------>");
			System.out.println("The Total Score out of 5 is " + score);
		
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[][] questions = {

			// Question 1
			{
				"In the classic film Casablanca, what famous line does Rick Blaine (Humphrey Bogart) say to Ilsa Lund (Ingrid Bergman)?\n" +
				"\nA. I'll be back" +
				"\nB. Here's looking at you, kid" +
				"\nC. May the Force be with you" +
				"\nD. You talkin' to me?",
				"B"
			},

			// Question 2
			{
				"In The Matrix, what color pill does Morpheus offer Neo to reveal the truth of their reality?\n" +
				"\nA. Red" +
				"\nB. Blue" +
				"\nC. Green" +
				"\nD. Yellow",
				"A"
			},

			// Question 3
			{
				"Which popular Bollywood film, inspired by a true story, features a father training his daughters to become world-class wrestlers?\n" +
				"\nA. Lagaan" +
				"\nB. Mary Kom" +
				"\nC. Dangal" +
				"\nD. Genius",
				"C"
			},

			// Question 4
			{
				"Who delivered an iconic, Oscar-winning performance as The Joker in Christopher Nolan's The Dark Knight?\n" +
				"\nA. Heath Ledger" +
				"\nB. Jared Leto" +
				"\nC. Jake Gyllenhaal" +
				"\nD. Joaquin Phoenix",
				"A"
			},

			// Question 5
			{
				"What was the first feature-length animated film ever released?\n" +
				"\nA. Pinocchio" +
				"\nB. Snow White and the Seven Dwarfs" +
				"\nC. Fantasia" +
				"\nD. The Lion King",
				"B"
			}
		};

		
		play(questions);
		

	}
}
