import java.util.Scanner;
import java.util.Arrays;

class OddAndEven {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  
	  // Initalizing arrays for storing even and odd numbers 
	  System.out.print("Enter a number: ");
	  int num = input.nextInt();
	  int even[] = new int[num/2 + 1];
	  int odd[] = new int[num/2 + 1];
	  int evenIndx = 0;
	  int oddIndx = 0;
	  
	  
	  // Using loop to distribute the numbers
	  for(int i = 0; i < num; i++ ){
		  if (i % 2 == 0){
			  even[evenIndx] = i;
			  evenIndx = evenIndx + 1;
		  } else {
			  odd[oddIndx] = i;
			  oddIndx = oddIndx + 1;
		  }
	  }
	  
	  
	  //Displaying the result
	  System.out.println("The Even numbers between 0 to " + num + " are " + Arrays.toString(even));
	  System.out.println("The odd numbers between 0 to " + num + " are " + Arrays.toString(odd));


      // Close the Scanner Object
      input.close();
   }
}
