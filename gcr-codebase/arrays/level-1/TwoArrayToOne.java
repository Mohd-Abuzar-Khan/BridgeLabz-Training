import java.util.Scanner;

class TwoArrayToOne {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  // Initalizing array for taking numbers
	  System.out.print("Enter number of columns: ");
	  int columns = input.nextInt();
	  System.out.print("Enter number of rows: ");
	  int row = input.nextInt();
	  int[][] matrix = new int[columns][row];
	  
      // Take input for a age of array using loop
	  for (int i = 0; i < columns ; i++) {
		for (int j = 0; j < row; j++) {
			System.out.println("Enter a number on position of metrix " + "["+i+"]" + "["+j+"]");
			matrix[i][j] = input.nextInt() ;
		}
	  }
	  
	  System.out.println("Here is the 2D array represented as 1D array");
	for (int i = 0; i < columns; i++) {
		for (int j = 0; j < row; j++) {
			System.out.print(matrix[i][j]+ " ");
			
		}
	}


      // Close the Scanner Object
      input.close();
   }
}
