import java.util.Scanner;

public class Bonus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter your Salary:");
			int salary = sc.nextInt();
			System.out.println("Enter your year of service:");
			int yearsOfService = sc.nextInt();
			
			
			// Finding bonus based on year of service
			if (yearsOfService > 5){
				double bonus = salary * (double)5/(double)100;
				System.out.println("The bonus is " + bonus);
			} else {
				// When years of service is less than 5 year or 5 year
				System.out.println("There is no bonus");
			}
			
		sc.close(); // Closing the Scanner Object
	}
}