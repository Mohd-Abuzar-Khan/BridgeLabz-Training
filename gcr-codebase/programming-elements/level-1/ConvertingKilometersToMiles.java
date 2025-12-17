
// Creating ConvertingKilometersToMiles Class to Convert Kilometers to Miles
public class ConvertingKilometersToMiles{
	public static void main(String[] args){
		
		// Creating a double variable to idicate Kilometers that need to be converted
		double kilometers = 10.8;
		
		//Creating a variable to convert Kilometersto miles
		double miles = kilometers + (kilometers * 0.6);
		
		//Displaying Converted Kilometers into miles
		System.out.println("The distance " + kilometers + " km in miles is " + miles);
		
	}
}