import java.util.Scanner;
import java.util.Arrays;

public class FizzBuzzArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			//Initializing array
			double oldSalary[] = new double[10];
			double newSalary[] = new double[10];
			double totalBonus = 0;
			
			// Taking number as Input
			for (int i = 0; i < 10; i++){
				System.out.println("Enter your Salary:");
				double salary = sc.nextDouble();
				oldSalary[i] = salary; 
				System.out.println("Enter your year of service:");
				double yearsOfService = sc.nextDouble();
				
				// Finding bonus based on year of service
				if (yearsOfService > 5){
					double bonus = salary * (double)5/(double)100;
					newSalary[i] = oldSalary[i] + bonus;
					totalBonus = totalBonus + bonus;
				} else {
					// When years of service is less than 5 year or 5 year
					double bonus = salary * (double)2/(double)100;
					totalBonus = totalBonus + bonus;
					newSalary[i] = oldSalary[i] + bonus;

				}
			}

			
			
			// Displaying Result
			System.out.println(" The total bonus given out by Zara is " + totalBonus);
			System.out.println(" The old salary of employees is :\n" + Arrays.toString(oldSalary));
			System.out.println(" The new salary of employees is :\n" + Arrays.toString(newSalary));
			
			
			
		sc.close(); // Closing the Scanner Object
	}
}