import java.util.Scanner;

class MeanOfHeight {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  // Initalizing array for taking numbers
	  double arr[] = new double[11];
	  double sum = 0;
	  
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
