import java.util.Scanner;

// Created class CurrencyExchange for Converting Rupees into some other Currency 
public  class CurrencyExchange{
	public static void main(String[] args){
			
		Scanner sc = new Scanner(System.in);
		
		// Flag for while loop
		boolean isConversion = true;
		
		// Looping until the user exit 
		while(isConversion){
			
			System.out.println("Enter the currency you want to Convert to :\n1.Yen\n2.Dollars\n3.Darham\n4.Pesos\n5.Pounds\n6.Exit");
			int choice = sc.nextInt();
			
			// when user want to exit
			if (choice == 6){
				isConversion = false;
				System.out.println("Thank you for using our Currency Exchange Calculator");
				break;
			}
			
			System.out.println("Enter the money you want to convert (in rupees) :");
			double rupees = sc.nextDouble();
			
			
			// Switch case with choice as input to convert into desire currency
			switch(choice){
				case 1: 
					double yen = rupees * 1.74;
					System.out.println(rupees + " rupees when converted into Yen is " + yen + " Yen");
					break;
				case 2:
					double dollars = rupees * 0.011;
					System.out.println(rupees + " rupees when converted into Dollars is " + dollars + " Dollars");
					break;
				case 3:
					double darham = rupees * 0.041;
					System.out.println(rupees + " rupees when converted into Darham is " + darham + " Darham");
					break;
				case 4:
					double pesos = rupees * 0.66;
					System.out.println(rupees + " rupees when converted into Pesos is " + pesos + " Pesos");
					break;
				case 5:
					double pound = rupees * 0.0083;
					System.out.println(rupees + " rupees when converted into Pound is " + pound + " Pound");
					break;
				default:
					System.out.println(rupees + " Please Choose from a option below" );
			}
			
		}

	}
}