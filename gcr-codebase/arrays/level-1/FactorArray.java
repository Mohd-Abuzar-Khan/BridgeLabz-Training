import java.util.Scanner;

class MeanOfHeight {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  // Initalizing array for taking numbers
	  System.out.print("Enter a number: ");
	  int num = input.nextInt();
	  
	  //creating max factor of the number
	  int maxFactor = 10;
	  int factorIndex = 0;
	  int factor[] = new int[maxFactor];
	  
	  
	  //Finding factors
	  for (int i =0; i < num ; i ++){
		  
		  if (num % i == 0){
			  
			  factor[factorIndex] = i;
			  factorIndex = factorIndex + 1;
			  
		  }
		  
		  if (factorIndex == maxFactor){
			  
		  }
	  }
	  
	  
      // Take input for a age of array using loop
	  for (int i = 0; i < arr.length  ; i++ ){
		  System.out.print("Enter height of a Athlete: ");
		  double height = input.nextDouble();
		  sum = sum + height;
	  }
	  
	  double mean = sum / arr.length;
	  
	  
	  //Displaying the result
	  System.out.println("The MeanS of the height of all the given Athlete is " + sum);


      // Close the Scanner Object
      input.close();
   }
}
