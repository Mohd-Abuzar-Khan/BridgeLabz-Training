import java.util.Scanner;

public class Frequency {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//Taking a number as an input
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int count = 0;
		int index = 0;
		
		while(num > 0){
			int digit = num % 10;
			num = num / 10;
			count = count + 1;
		}
		
		int arr[] = new int[count];
		
		while(num > 0){
			int digit = num % 10;
			num = num / 10;
			arr[index] = digit;
			index = index + 1;
		}
		
		int frequency[] = new int[10];
		
		for (int i = 0; i < count; i++){
			frequency[arr[i]] = frequency[arr[i]] + 1;
		}
		
		for (int j = 0; j < count; j ++ ){
			System.out.println(" The frequency of number " + arr[j] + " is " + frequency[arr[j]]);

		}
			
	}
}