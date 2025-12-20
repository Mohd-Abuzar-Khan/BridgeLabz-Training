// Importing dependencies to take input
import java.util.Scanner;

// Created a SpringSeason class to check if  particular date is Spring Season or not
public class SpringSeason{
	
	public static boolean checkingSpring(int month , int day){
		boolean ans = false ;
		if ( (month >= 3 && day >= 20) && ( month <= 6 && day <= 20)){
				ans = true;
			}else{
				ans = false;
		}
		return ans;
	}
	
	public static void main(String[] args){
		
		// Taking Month and Day as Input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Month:");
		int month = input.nextInt();
		System.out.println("Enter Day:");
		int day = input.nextInt();
		
		// Checking wheter the number is positive , negative or zero;
		boolean result = SpringSeason.checkingSpring(month, day );
		
		// Displaying Result
		if (result){
			System.out.println(" It is a Spring Season" );
		} else {
			System.out.println(" It is not a  Spring Season" );
		}
		
		input.close(); // Closing Scanner Object
	}

}
