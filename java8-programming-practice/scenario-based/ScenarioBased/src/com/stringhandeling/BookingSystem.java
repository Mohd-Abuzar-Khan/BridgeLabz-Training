package com.stringhandeling;

import java.util.Scanner;

public class BookingSystem {
	
	public static void totalPriceCalculator(String[] details) {
		if((details[1].equals("P123") || details[1].equals("P345")|| details[1].equals("P223")) && Integer.parseInt(details[2]) > 0 && (details[3].equalsIgnoreCase("season") || details[3].equalsIgnoreCase("peakseason")|| details[3].equalsIgnoreCase("offseason"))) {
			
			double basePrice = 0;
			double disc = 0;
			double season = 0;
			
			if(details[1].equals("P123")) {
				basePrice = 5000;
			} else if(details[1].equals("P223")) {
				basePrice = 10000;
			} else if(details[1].equals("P345")) {
				
				basePrice = 10000;
			}
			
			if(details[3].equalsIgnoreCase("season")) {
				season = basePrice * 0.15;
			} else if(details[3].equalsIgnoreCase("peakseason")) {
				season = basePrice * 0.25;
			} else if(details[3].equalsIgnoreCase("offseason")) {
				season = basePrice * 0.10;
			}
			
			
			if(Integer.parseInt(details[2]) >= 7) {
				disc = basePrice * 0.1;
			}
			
			double finalAmount = (basePrice - disc) + season;
			
			System.out.println("Total Charges " + finalAmount);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String[] details = input.split(":");
		
		totalPriceCalculator(details);
	}

}
