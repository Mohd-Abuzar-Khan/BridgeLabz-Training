//importing Scanner class from java.util package
import java.util.Scanner;

//Creating a class name SecondLargest and displaying the largest and 2nd largest element
public class SecondLargest{
	public static void main(String[] args){
	// Creating object of class Scanner
	Scanner input = new Scanner( System.in);
	//user names

	//Declaring two 1D array
	int maxDigit = 10;
	int[] arr = new int[maxDigit];
	
	
	// Taking user details for a number
	System.out.println("Enter a number : ");
	int number = input.nextInt();
	

	//Inserting each digit to array
	int index = 0;
	while(number != 0){
		int digit = number%10;
		arr[index] = digit;
		if(index == 9){
			maxDigit *= 2;
			int[] temp = new int[maxDigit];
			for(int i=0 ; i< index ; i++){
				temp[i] = arr[i];
			}
			arr = temp;
		}
		index++;
		number /= 10;
	}
	
	//Calculating the largest and second largest digit
	int largest = 0;
	int secondLargest = 0;
	int min = Integer.MIN_VALUE;
	for(int i = 0 ; i<maxDigit ; i++ ){
		if(arr[i] > min ){
			
			min = arr[i];
			largest = min;
		}
		
	}
	min = Integer.MIN_VALUE;
	for(int i = 0 ; i<maxDigit ; i++ ){
		if((arr[i] > min ) && arr[i]< largest){
			
			min = arr[i];
			secondLargest = min;
		}
		
	}
	
	System.out.println("The largest value is " + largest + " and the second largest value is " + secondLargest);
	
	


	//close the Scanner object
	input.close();
	
	
	
	}




} 