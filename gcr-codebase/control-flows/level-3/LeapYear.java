import java.util.Scanner;

public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking Year as Input
			System.out.println("Enter a Year:");
			int year = sc.nextInt();
			
			//Checking If the year is the leap Year
			if (year >= 1582){
				
				if (year % 4 == 0){
					
					if (year % 100 == 0){
						
						
						if (year % 400 == 0){
							
							System.out.println(year + " is a Leap Year");
							
						}else{
							
							System.out.println(year + " is not a Leap Year");
							
						}
						
					}else{
						
						System.out.println(year + " is a Leap Year");
						
					}
					
				}else{
					
					System.out.println(year + " is not a Leap Year");
					
				}
				
			} else {
				
				System.out.println(year + " is not a Leap Year");
				
			}
			
			
			
		sc.close(); // Closing the Scanner Object
	}
}