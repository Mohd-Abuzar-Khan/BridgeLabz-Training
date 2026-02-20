package com.bookmyhotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class HotelBooking {
	
	public static boolean validDate(LocalDate date) {
		String dates = date.toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        try {
            LocalDate.parse(dates, formatter);
            return true;
        } catch (Exception e) {
            return false;
        }
		
	}
	
	public static void validateUserDetails(int age, String email, String creditCard) 
	        throws InvalidBookingDetailsException {

	    if(age < 18 || age > 100) {
	        throw new InvalidBookingDetailsException("Invalid age");
	    }

	    if(!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.com$")) {
	        throw new InvalidBookingDetailsException("Invalid email");
	    }

	    if(!creditCard.matches("^\\d{16}$")) {
	        throw new InvalidBookingDetailsException("Invalid Credit Card");
	    }
	}

	
	
	
	public static void validateBookingDetails(String hotelName, String roomType, LocalDate checkInDate, LocalDate checkOutDate) throws InvalidBookingDetailsException {
		
		
		if(!(roomType.equalsIgnoreCase("Standard") || roomType.equalsIgnoreCase("Delux") || roomType.equalsIgnoreCase("Suite") )) {
			throw new InvalidBookingDetailsException("Invalid room type");
		}
		
		if(!(validDate(checkInDate) && validDate(checkOutDate))) {
			throw new InvalidBookingDetailsException("Invalid date format");
		}
		
		if(!(checkInDate.isAfter(LocalDate.now()))) {
			throw new InvalidBookingDetailsException("Invalid check-in date");

		}
		
		if(!(checkInDate.isBefore(checkOutDate))) {
			throw new InvalidBookingDetailsException("Invalid check-out date");

		}
	}
	
	
	public static double calculateBookingCost(String roomType, int numNights, boolean breakfastIncluded ) {
		double finalAmount = 0;
		double basePrice = 0;
		double breakfast = 0;
		
		if(roomType.equalsIgnoreCase("standard")) {
			basePrice = 1000 * numNights;
		} else if(roomType.equalsIgnoreCase("delux")) {
			basePrice = 2000 * numNights;
		} else if(roomType.equalsIgnoreCase("suite")) {
			basePrice = 3000 * numNights;
		}
		
		finalAmount = basePrice + breakfast;
		
		return finalAmount;
	}
	
	
	public static void main(String[] args) throws InvalidBookingDetailsException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = sc.nextLine();
				
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		
		System.out.println("Enter Email");
		String email = sc.nextLine();
		
		System.out.println("Enter Creadit Card Number");
		String creditCard = sc.nextLine();
		
		System.out.println("Enter Hotel Name");
		String hotelName = sc.nextLine();
		
		System.out.println("Enter Room Type");
		String roomType = sc.nextLine();
		
		System.out.println("Enter Check-in date");
		String checkIn = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate checkInDate = null;

        
        try {
             checkInDate = LocalDate.parse(checkIn, formatter);
            
        } catch (Exception e) {
            throw new InvalidBookingDetailsException("Invalid check-in date");
        }
        
        System.out.println("Enter Check-out date");
		String checkOut = sc.nextLine();
		
		LocalDate checkOutDate = null;

        try {
             checkOutDate = LocalDate.parse(checkOut, formatter);
            
        } catch (Exception e) {
            throw new InvalidBookingDetailsException("Invalid check-in date");
        }
        
        
        int numNights = checkInDate.compareTo(checkOutDate);
        boolean breakFast = false;
        
        System.out.println("Do you want BreakFast");
        String food = sc.nextLine();
        
        if (food.equalsIgnoreCase("yes")) {
        	breakFast = true;
        }
        
//        validateUserDetails(age, email, creditCard);
//        calculateBookingCost( roomType, numNights, breakFast);
        validateBookingDetails(hotelName, roomType, checkInDate, checkOutDate);
		
		
	}
}
