// Importing dependencies to take input
import java.util.Scanner;

// Created a HandShake class to find total number of handshake among N number 
public class HandShake{
	
	public static int numberOfHandshake(int people){
		int numberOfHandshake = ((people * (people - 1)))/2;
		return numberOfHandshake;
	}
	
	public static void main(String[] args){
		
		// Taking number of people as input 
		Scanner input = new Scanner(System.in);
		System.ouut.println("Enter Number of People:")
		int people = input.nextInt();
		
		// Calculating Number of handshake using a method
		int handShake = HandShake.numberOfHandshake(people);
		
		// Prinitng Number of possible Handshake
		System.out.println("Possible number of handshake among " + people + " is " + handShake);
		
		input.close(); // Closing Scanner Object
	}

}