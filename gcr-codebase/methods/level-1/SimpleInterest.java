import java.util.Scanner;

public class SimpleInterest {
	
	public static double calculatingSimpleInterest (double principal, double rate, double time){
		double SI = principal * rate *time / 100;
		return SI;
	}
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
			
			// Taking Input
			System.ouut.println("Enter the principal:")
			double principal = sc.nextInt();
			System.ouut.println("Enter the rate:")
			double rate = sc.nextInt();
			System.ouut.println("Enter the time:")
			double time = sc.nextInt();
			
			// Finding Simple interest using method
			double simpleInterest = SimpleInterest.calculatingSimpleInterest(principal , rate, time);
			

        // Display Result
        System.out.print("The Simple Interest is " + simpleInterest  +" for Principal " + principal +", Rate of Interest " +  rate  + " and Time " + time);

        sc.close();
    }
}
