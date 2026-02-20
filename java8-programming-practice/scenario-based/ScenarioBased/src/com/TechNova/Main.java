package com.TechNova;

import java.util.Scanner;

public class Main {
	
	public static void printDetails(String s) {
		String[] details = s.split("-");
		
		double  finalAmount = 0;
		double service = 0;
		double discount = 0;
		
		if (serviceCharge(details[3]).equals("Yes")) { service = (double) Double.parseDouble(details[4]) * 0.15; }
		
		if (discountApplied(details[2]).equals("Yes")) { discount = (double) Double.parseDouble(details[4]) * 0.05; }

		finalAmount = (Double.parseDouble(details[4]) + service) - discount;
		
		System.out.println("Participant ID : " + details[1]);
		System.out.println("Event Code : " + details[2]);
		System.out.println("Ticket Type : " + details[3]);
		System.out.println("Base Amount : " + details[4]);
		System.out.println("Service Charge Applied : "+ serviceCharge(details[3]));
		System.out.println("Discount Applied : " + discountApplied(details[2]));
		System.out.println("Final Payable Amount : " + finalAmount);

	}
	
	
	
	public static String serviceCharge(String s) {
		if(s.equals("VIP")) {
			return "Yes";
		}
		return "No";
	}
	
	public static String discountApplied(String s) {
	    return s.matches(".*(\\d)\\1+.*") ? "Yes" : "No";
	}


	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String pattern = "^TN-([A-Z]{2}[0-9]{4})-([A-Z]{3}[0-9]{2})-(VIP|REG)-([0-9]{4})$";
		
		String input = sc.nextLine();
		
		if(input.matches(pattern)) {
			printDetails(input);
		} else 
		{
			System.out.println("Invalid Registration Code");
		}
		
	}
}
