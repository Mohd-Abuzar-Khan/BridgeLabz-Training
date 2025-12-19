// Create SumOfDigit Class to compute the sum of all digits of a number using an array

import java.util.Scanner;

class VoteEligibilty {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  // Initalizing array for taking ages
	  int arr[] = new arr[10];

      // Take input for a age of array using loop
	  for (int i = 0; i < arr.length ; i++ ){
		  System.out.print("Enter student's age: ");
		  int arr[i] = input.nextInt();
		  
		  // Validate the user input number, if negative state invalid and exit 
		  if (arr[i] < 0) {
				System.err.println("Invalid Number.");
				System.exit(0);
		  }
	  }

      // Printing if a student can vote or not
      for(int j = 0; j < arr.length; j++){
		  if (arr[j] >= 18){
			  System.out.println("The student with the age " + arr[j] +" can vote");
		  } else {
			  System.out.println("The student with the age " + arr[j] +" cannot vote");
		  }
	  }


      // Close the Scanner Object
      input.close();
   }
}
