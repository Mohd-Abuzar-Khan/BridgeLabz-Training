import java.util.Scanner;

class MultiplicationTable6To9 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
	  
	  // Initalizing array for taking numbers
	  int arr[] = new int[10];
	  System.out.print("Enter a number: ");
	  int num = input.nextInt();

      // Printting the multiplication table of the number
	  for (int i = 6; i < arr.length  ; i++ ){
		  arr[i] = i * num;
		  System.out.println(num + " x " + i +" = " + num*i);
	  }

      // Close the Scanner Object
      input.close();
   }
}