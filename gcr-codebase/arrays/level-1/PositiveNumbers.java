import java.util.Scanner;

class PositiveNumbers {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  // Initalizing array for taking numbers
	  int arr[] = new int[5];

      // Take input for a age of array using loop
	  for (int i = 0; i < arr.length ; i++ ){
		  System.out.print("Enter a number: ");
		  arr[i] = input.nextInt();
		  
	  }

      // Printing if a student can vote or not
      for(int j = 0; j < arr.length; j++){
		  if (arr[j] > 0){
			  System.out.println("The number " + arr[j] + " is positive");
		  } else if (arr[j] < 0) {
			  System.out.println("The number " + arr[j] + " is negative");
		  }else{
			  System.out.println("The number " + arr[j] + " is zero");
		  }
	  }
	  
	  if(arr[0] > arr[arr.length -1]){
			  System.out.println("The first number " + arr[0] + " is greater than last number " + arr[arr.length - 1]);
	  } else if (arr[arr.length - 1] > arr[0]){
			  System.out.println("The first number " + arr[0] + " is less than last number " + arr[arr.length - 1]);
	  } else{
			  System.out.println("The first number " + arr[0] + " is equal to the last number " + arr[arr.length - 1]);

	  }


      // Close the Scanner Object
      input.close();
   }
}
