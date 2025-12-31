import java.util.Scanner;

public class LuckyDraw {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// Creating a flag to check the state wheter user is playing or not
		boolean isPlaying = true;
		
		// Looping until user either win or stop playing
		while(isPlaying){
			
			System.out.println("\n------------ Welcome to the Lucky draw -------------\n");
			System.out.println("Enter a number from the draw");
			int draw = sc.nextInt();
			
			// Setting up logic for winning the draw
			if(draw % 3 == 0 && draw % 5 == 0){
				System.out.println("\n--------------------------------------------------\n");
				System.out.println("Congratulation! you have won a price");
				isPlaying = false;
			}else{
				System.out.println("\n--------------------------------------------------\n");
				System.out.println("Sorry! Better Luck Next Time");
			}
			
			// Asking users if they want to play again
			System.out.println("\n--------------------------------------------------\n");
			System.out.println("Do you want to play again :\n1.Yes\n2.No");
			int choice = sc.nextInt();
			
			switch(choice){
				case 1:
					continue;
				case 2:
					System.out.println("Thank You! for using our Service");
					isPlaying = false;
					break;
			}
		}
		
		
		sc.close();
	}
}