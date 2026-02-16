package com.trainticket;

import java.util.Scanner;

public class TrainTicket {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		char[] charArr = input.toCharArray();
		
		if(charArr.length != 10) {
			System.out.println("Invalid Input");
		} else {
			String reps = "";
			String alpha = "";
			String number = "";
			
			reps = reps + charArr[5];
			reps = reps + charArr[6];
			
			alpha = alpha + charArr[7];
			
			number = number + charArr[8];
			number = number + charArr[9];
			
			int iteration = 0;
			int seats = 0;

			try {
			    iteration = Integer.parseInt(reps);
			} catch (NumberFormatException e) {
			    System.out.println("Invalid Count");
			    return; 
			}

			try {
			    seats = Integer.parseInt(number);
			} catch (NumberFormatException e) {
			    System.out.println("Invalid Seat");
			    return;
			}

			for (int i = 0; i < iteration; i++) {
			    System.out.println(alpha + (seats + i));
			}

		}
	}

}
