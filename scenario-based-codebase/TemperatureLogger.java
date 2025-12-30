import java.util.Scanner;

// Created a TemperatureLogger Class for finding average and maximum value of all the temperature over a week
public class TemperatureLogger {
	
	
	public static void displayDashboard(int[] arr, String[] days){
		
		System.out.println("-------------Dashboard-----------");
		System.out.println("Days  \tTemperature (in Celsius)");
		for(int k = 0; k < 7; k++){
			System.out.println( days[k] +  "\t" + arr[k]);

		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		int[] arr = new int[7];
		int sum = 0;
		
		// Created a String array to print the name of day for logging temperature
		String[] days = {"Monday  ", "Tuesday  ", "Wednesday", "Thrusday", "Friday  ", "Saturday ", "Sunday  "};
		
		// Taking temperature as input over the week
		for(int i = 0; i < 7; i++){
			System.out.println("Enter the temperature on " + days[i]);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		int maxTemperature = 0;
		
		// Looping over all the temperature to find Max Temperature
		for(int j = 0; j < 7; j++){
			if (arr[j] > maxTemperature){
				maxTemperature = arr[j];
			}
		}
		
		// Dispalying dashboard
		displayDashboard(arr,days);
		
		
		double average = (double) sum / 7;
		
		//Displayig result
		System.out.println("----------------------------------");
		
		System.out.println("Average Temperature for all the days is " + average);
		
		System.out.println("----------------------------------");
		
		System.out.println("Maximum Temperature among all the days is " + maxTemperature);
		
		System.out.println("----------------------------------");
		
	}
	
	
} 