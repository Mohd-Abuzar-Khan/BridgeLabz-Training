import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		double base = input.nextDouble();
		double height = input.nextDouble();
		
		double baseInCentimeter = base * 2.54;
		double heightInInches = height / 2.54;
		
		double areaOfTriangelInInches = (1/2) * base * heightInInches;
		double areaOfTriangelInCentimeter = (1/2) * height * baseInCentimeter;
		
		System.out.println("Area of Triangel in cm is "+areaOfTriangelInCentimeter+ " while in inches is " + areaOfTriangelInInches);
		
		input.close();// Closing the Scanning Object;
	}
}