import java.util.Scanner;

public class FizzBuzzArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
			// Taking number as Input
			System.out.println("Enter a number:");
			int num = sc.nextInt();
			String arr[] = new String[num];
			int stringIndex = 0;
			while (num < 0){
				System.out.println("Enter a positive number:");
				num = sc.nextInt();
			}

			
			// Printing Fizz if divisible by 3 Buzz if divisible by 5 and FizzBuzz if by both and adding it to array
			for (int i = 1; i <= num; i++ ){
				if ((i % 3 == 0)&& (i % 5 == 0)){
					arr[stringIndex] = "FizzBuzz";
				} else if (i % 3 == 0) {
					arr[stringIndex] = "Fizz";
				} else if (i % 5 == 0){
					arr[stringIndex] = "Buzz";
				}else{
					arr[stringIndex] = Integer.toString(i);
				}
				stringIndex++;
			}
			
			// Displaying Result
			for (int j = 0; j < stringIndex ; j++){
				System.out.print(arr[j] +  " ");
			}
			
		sc.close(); // Closing the Scanner Object
	}
}