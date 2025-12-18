import java.util.Scanner;

public class SumOfNaturalNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter Number:");
			int num = sc.nextInt();
			
			//Calculating Sum of the Natural Number using Formula
			int sumFormula = (num *(num + 1))/2;
			int sum = 0;
			
			// Calculating Sum Using While Loop
			while(num != 0){
				sum = sum + num;
				num = num - 1;
			}
			
			// Comparing both sum result using == operator 
			System.out.println(sumFormula == sum);
			
		sc.close(); // Closing the Scanner Object
	}
}