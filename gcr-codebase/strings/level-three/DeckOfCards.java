import java.util.Scanner;
import java.util.Arrays;

public class DeckOfCards {

	// Creating a method to create a deck of cards
	public static String[] creatingDeck() {
		String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"} ;
		String ranks[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int index = 0;
		
		String deck[] = new String[52];
		for(int i = 0; i < 4; i++) {
			for (String rnk : ranks) {
				String card = suits[i];
				deck[index] = rnk + " of " + card;  
				index++;
			}
		}
		return deck;
	}
	
	// Creating a method to shuffle the deck using random method
	public static String[] shufflingDeck(String[] deck) {
		for (int i = 0; i < 52; i++){
			int draw =(int) (Math.random() * (52 - i)) + i;
			String temp = deck[draw];
			deck[draw] = deck[i];
			deck[i] = temp;
			
		}
		return deck;
	}
	
	// Createing a method to distribute cards among people equally
	public static String[][] distributingDeck(String[] shuffle, int people, int cards){
		int cardPerPerson = cards / people;
		String ans[][] = new String[people][2];
		
		if (cards % people == 0) {

			int index = 0;

				for (int i = 0; i < people; i++) {
					String[] card = new String[cardPerPerson];

					for (int j = 0; j < cardPerPerson; j++) {
						card[j] = shuffle[index++];
					}

					ans[i][0] = "Person " + (i + 1) + " cards are:";
					ans[i][1] = Arrays.toString(card);
				}

				for (int i = 0; i < ans.length; i++) {
					System.out.println(ans[i][0] + " " + ans[i][1]);
				}
					}

			return ans;
		}	

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of cards you want each player to have");
		int cards = sc.nextInt();
		System.out.println("Enter number of player :")
		int people = sc.nextInt();
		
		String deck[] = creatingDeck();
		String shuffle[] = shufflingDeck(deck);
		distributingDeck(shuffle, people, cards); 
	}
}