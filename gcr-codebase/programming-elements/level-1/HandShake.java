// Importing dependencies to take input
import java.util.Scanner;

// Created a HandShake class to find total number of handshake among N number 
public class HandShake{
	public static void main(String[] args){
		
		// Taking number of people as input 
		Scanner input = new Scanner(System.in);
		int people = input.nextInt();
		
		// Calculating Number of handshake
		int numberOfHandshake = ((people * (people - 1)))/2;
		
		// Prinitng Number of possible Handshake
		System.out.println("Possible number of handshake among " + people + " is " + numberOfHandshake);
		
		input.close(); // Closing Scanner Object
	}

}