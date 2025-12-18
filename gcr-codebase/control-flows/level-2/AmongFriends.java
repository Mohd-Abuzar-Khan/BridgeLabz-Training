import java.util.Scanner;

public class WhileFizzBuzz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking age and height as Input
			System.out.println("Enter amar age:");
			int amarAge = sc.nextInt();
			System.out.println("Enter amar height:");
			int amarHeight = sc.nextInt();
			
			System.out.println("Enter akbar age:");
			int akbarAge = sc.nextInt();
			System.out.println("Enter akbar height:");
			int akbarHeight = sc.nextInt();
			
			System.out.println("Enter anthony age:");
			int anthonyAge = sc.nextInt();
			System.out.println("Enter anthony height:");
			int anthonyHeight = sc.nextInt();
			
			
			//Finiding Youngest of three
			if (amarAge < akbarAge && amarAge < anthonyAge){
				System.out.println("Amar is the youngest");
			} 
			
			// Checking if akbar  is the Youngest
			 else if (akbarAge < amarAge && akbarAge < anthonyAge){
				System.out.println("Akbar is the Youngest");
			} 
		
			// Checking if Anthony is the Youngest
			else if (anthonyAge < akbarAge && anthonyAge < amarAge){
				System.out.println("Anthony is the youngest");
			}
			
			//Finiding Tallest of three
			if (amarAge > akbarAge && amarAge > anthonyAge){
				System.out.println("Amar is the Tallest");
			} 
			
			// Checking if akbar  is the Tallest
			 else if (akbarAge > amarAge && akbarAge > anthonyAge){
				System.out.println("Akbar is the Tallest");
			} 
		
			// Checking if Anthony is the Tallest
			else if (anthonyAge > akbarAge && anthonyAge > amarAge){
				System.out.println("Anthony is the Tallest");
			}

			
			
			
		sc.close(); // Closing the Scanner Object
	}
}