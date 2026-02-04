package com.futurelogistics;

import java.util.Scanner;

public class UserInterface{
	public static void main(String[] args){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Goods Transport details");
		
		String input1 = input.nextLine();
		
		Utility u1 = new Utility();
		
		GoodTransports transport1 = u1.parseDetails(input1);
		
		String objectType = u1.findObjectType(transport1);
		
		if(objectType.equals("BrickTransport")) {
			try {
			BrickTransport b1 = (BrickTransport) transport1;
			b1.displayDetails();
			} catch (NullPointerException e) {
				System.out.println("Please provide a valid record");
			}
		} else {
			try {
			TimberTransport t1 = (TimberTransport) transport1;
			t1.displayDetails();
			} catch (NullPointerException e) {
				System.out.println("Please provide a valid record");
			}
		}
		
	}
}
