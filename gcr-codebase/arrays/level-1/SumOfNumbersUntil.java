import java.util.Scanner;

class SumOfNumbersUntil {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  // Initalizing array for taking numbers
	  double arr[] = new double[10];
	  int index = 0;
	  double sum = 0;
	  
	  while(index < 10){
		  System.out.print("Enter a number: ");
		  double num  = input.nextDouble();
		  
		   // Validate the user input number, if negative state and zero invalid and break 
		  if (num < 0 && num == 0) {
				System.err.println("Invalid Number.");
				break;
		  } else {
			  arr[index] = num;
		  }
		  
		  index = index + 1;
	  }
	  
      // Take input for a age of array using loop
	  for (int i = 0; i < arr.length  ; i++ ){
		  sum = sum + arr[i];
	  }
	  
	  //Displaying the result
	  System.out.println("The sum of all the given number is " + sum);


      // Close the Scanner Object
      input.close();
   }
}
