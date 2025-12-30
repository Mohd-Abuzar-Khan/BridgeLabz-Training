import java.util.Scanner;

// Created a FitnessTracker Class to track total and average number of push-up done by Sandeep
public class FitnessTracker {
	
	
	// Method to display dashboard of days and number of push
	public static void displayDashboard(int index, int[] arr, String[] days){
		
		System.out.println("-------------Dashboard-----------");
		System.out.println("Days  \t\tPush-ups by Sandeep");
		
		//Using for loop to display the dashboard
		for(int k = 0; k < index; k++){
			if (arr[k] == 0){
				System.out.println( days[k] +  "\tRest Day" );
			} else {
				System.out.println( days[k] +  "\t" + arr[k] + " Push-ups");
			}

		}
	}
	
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		int[] arr = new int[7];
		int sum = 0;
		int index = 0;
		
		// Initalizing String arr[] to show the name of the day
		String[] days = {"Monday  ", "Tuesday  ", "Wednesday", "Thrusday", "Friday  ", "Saturday ", "Sunday  "};
		
		// Using for each loop to take input from sandeep
		for(String push : days) {
			System.out.println("Hello Sandeep! Enter the number of push-ups you did on " + push + "In case of a rest day enter 0.");
			arr[index] = sc.nextInt();
			sum += arr[index];
			index++;
		}
		
				
		// Dispalying dashboard
		displayDashboard(index, arr, days);
		
		
		double average = (double) sum / 7;
		
		//Displayig result
		System.out.println("----------------------------------");
		
		System.out.println("Average push-up done by sandeep for all the days is " + average);
		
		System.out.println("----------------------------------");
		
		System.out.println("Total Number of push-up done by Sandeep among all the days is " + sum);
		
		System.out.println("----------------------------------");
		
	}
	
	
} 