
// Create AgeOfHarry Class to compute the Age of Harry
class AgeOfHarry {
	public static void main(String[] args){
		
		// Creating a string variable name to indicate the person
		String name = "Harry";

		// Creating a integer variable birthyear to indicate the year of birth 
		final int birthYear= 2000;

		// Creating a integer currentYear to indicate the current year
		int currentYear = 2024;

		// Creating a integer age to calculate the Current Age of Harry
		int age = currentYear - birthYear;
		
		// Displaying Harry's Age 
		System.out.println( name + "'s age in " + currentYear + " is " + age) ;

	}
}