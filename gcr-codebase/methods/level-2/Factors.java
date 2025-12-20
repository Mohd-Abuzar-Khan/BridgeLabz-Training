// Importing dependencies to take input
import java.util.Scanner;
import java.util.Arrays;

// Created a Factors class to find factors and sum of factors 
public class Factors{
	
	public static int[]  calculatingFactors(int num , int count){
		int factors[] = new int[count];
		int index = 0;
		
		// Storing factors in the array
		for (int j = 1; j < num;  j++){
			if ( num % j == 0){
				factors[index] = j;
				index ++;
			}
		}
		return factors;
		
	}
	public static int  calculateFactorSum(int[] factors ){
		// Finding the sum  of all the factors of a number
		int sum = 0;
		for(int i = 0; i < factors.length; i++){
			sum = sum + i ;
		}
		return sum;
	}
	public static int  calculateFactorProduct(int[] factors ){
		// Finding the product of all the factors of a number
		int product = 1;
		for(int i = 0; i < factors.length; i++){
			product = product + i ;
		}
		return product;
	}
	
	public static void main(String[] args){
		
		//Taking wind speed and temperature as input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = input.nextInt();
		int count = 0;
		
		// Looping to find the size of the array
		for(int i = 1; i < num; i++){
			if (num % i == 0) {
				count ++;
			}
		}
		
		// Checking wheter the number is positive , negative or zero;
		int[] factors = Factors.calculatingFactors(num, count );
		int sum = Factors.calculateFactorSum(factors);
		int product = Factors.calculateFactorProduct(factors);
		
		
		// Displaying Result
		System.out.println("All the factors of the number are " + Arrays.toString(factors));
		System.out.println("Sum of all the factors are " + sum);
		System.out.println("Sum of all the prduct are " + product);
		
		
		input.close(); // Closing Scanner Object
	}

}
