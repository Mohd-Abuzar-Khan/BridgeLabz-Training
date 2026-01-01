//Program to create a clock
import java.util.Scanner;

public class DigitalWatch{
	
	public static void main(String[] args){
		
		//Displaying clock
		System.out.println("--------------------------------");
		System.out.println("Digit Clock");
		System.out.println("--------------------------------");
		for(int i = 0 ; i<24; i++){
			if(i==13){
				System.out.print("\r|" + i +" H :00 M |");
				System.out.println("\n\nPower cut");
				break;
			}
			for(int j =1; j<60;j++){
				if(j<10){
					System.out.print("\r|" + i +" H :0"+ j + " M |");
				}else{
					System.out.print("\r|" + i +" H :"+ j + " M |"); 
				}
				try {
					// Delay for (100 milliseconds)
					Thread.sleep(100);
					// Alternative using TimeUnit for better readability:
				} catch (InterruptedException e) {
					// Handle the interruption if necessary
					System.err.println("The thread was interrupted!");
					Thread.currentThread().interrupt(); // Restore the interrupt flag
				}
			}
			
		}
	}
}