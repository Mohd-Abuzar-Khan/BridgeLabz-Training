
// Created EarthVolume Class to calculate the volume of Earth
public class EarthVolume{
	public static void main(String[] args){
		
		// Created a  final varibale PI to display the constant value of PI
		final double PI = 3.14;
		
		// Created a  varibale  indicating radius of Earth
		double radiusOfEarth = 6378;
		
		// Created a double varibale to indicated Volume of Earth 
		double volumeOfEarth = (4/3) * PI * (radiusOfEarth * radiusOfEarth *radiusOfEarth);
		
		// Created a varibale to indicate Volume of Earth in miles
		double volumeOfEarthInMiles = volumeOfEarth * 0.621372;
		
		// Displaying the volume of earth in Miles and kilometers
		System.out.println(" The Volume of Earth in cubic kilometers is " + volumeOfEarth + " and cubic miles is " + volumeOfEarthInMiles);
		
	}
}