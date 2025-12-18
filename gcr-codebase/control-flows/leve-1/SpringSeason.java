import java.util.Scanner;

public class SpringSeason{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking Month and Day as Input
			System.out.println("Enter Month:");
			int month = sc.nextInt();
			System.out.println("Enter Day:");
			int day = sc.nextInt();
			
			// Checking if it's Spring Season (March 20 -  June 20)
			if ( (month >= 3 && day >= 20) && ( month <= 6 && day <= 20)){
				System.out.println("Spring Season");
			}else{
				System.out.println("Not Spring Season");
			}
			
		sc.close(); // Closing the Scanner Object
	}
}