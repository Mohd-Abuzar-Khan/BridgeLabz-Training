package com.reviewmanager;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean looping = true;
		

		
		while(looping) {
			System.out.println("Please choose a option \n1. Add Review\r\n"
					+ "2. Format Message\r\n"
					+ "3. Show Top Reviewers\r\n"
					+ "4. Exit");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				sc.nextLine();
				
				System.out.println("Enetr Username: ");
				String username = sc.nextLine();
				System.out.println("Enetr message:");
				String msg = sc.nextLine();
				
				Review r = new Review(username, msg);
				
				ReviewAnalyzer.addReview(r);
				break;
			case 2 :
				sc.nextLine();

				System.out.println("Enter Message: ");
				String format = sc.nextLine();
				
				ReviewAnalyzer.formatMessage(format);
				break;
				
			case 3 :
				sc.nextLine();

				System.out.println("Enter vowel limit:");
				int limit = sc.nextInt();
				ReviewAnalyzer.getTopReviwers(limit);
				
				break;
				
			case 4:
				System.out.println("Thank you for using ReviewHub");
				looping = false;
				break;
			}
		}
		 
		
	}
}
