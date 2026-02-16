package com.dateandtime;

import java.util.Scanner;

public class AeroVigil{
	
	
	public static boolean validateFlightNumber(String flightNumber) throws InvalidFlightException{
		
		if(flightNumber.matches("FL-[1-9][0-9]{3}")){
			return true;
		} else {
			throw new InvalidFlightException("The flight number " + flightNumber + " is invalid");
		}
	}

	public static boolean validateFlightName(String flightName) throws InvalidFlightException{
	
		if(flightName.equalsIgnoreCase("SpiceJet") || flightName.equalsIgnoreCase("Vistara") || flightName.equalsIgnoreCase("IndiGo") || flightName.equalsIgnoreCase("Air Asia") ){
			return true;
		} else {
			throw new InvalidFlightException("The flight name " + flightName + " is invalid");
		}
			
	}

	public static boolean validatePassengerCount(int passangerCount, String flightName) throws InvalidFlightException{
	
		if(flightName.equalsIgnoreCase("SpiceJet") && passangerCount <= 396 && passangerCount > 0 ){
			return true;
			
		} else if(flightName.equalsIgnoreCase("Vistara") && passangerCount <= 615 && passangerCount > 0 ){
			return true;
		
		} else if(flightName.equalsIgnoreCase("IndiGo") && passangerCount <= 230 && passangerCount > 0  ){
			return true;
		
		} else if(flightName.equalsIgnoreCase("Air Asia") && passangerCount <= 130 && passangerCount > 0 ){
			return true;
		
		} else {
			throw new InvalidFlightException("The passenger count " + passangerCount + " is invalid for "+ flightName);
		}
		
	}
	
	public static double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException{
	
		if(flightName.equalsIgnoreCase("SpiceJet") && currentFuelLevel <= 200000 && currentFuelLevel > 0 ){
			return 200000 - currentFuelLevel;
			
		} else if(flightName.equalsIgnoreCase("Vistara") && currentFuelLevel <= 300000 && currentFuelLevel > 0 ){
			return 300000 - currentFuelLevel;
		
		} else if(flightName.equalsIgnoreCase("IndiGo") && currentFuelLevel <= 250000 && currentFuelLevel > 0  ){
			return 250000 - currentFuelLevel;
		
		} else if(flightName.equalsIgnoreCase("Air Asia") && currentFuelLevel <= 150000 && currentFuelLevel > 0 ){
			return 150000 - currentFuelLevel;
		
		} else {
			throw new InvalidFlightException("Invalid fuel level for " + flightName);
		}
				
	
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr flight details");
		
		String input = sc.nextLine();
		
		String[] flightDetails = input.split(":");
		
		try{
		if(validateFlightName(flightDetails[1].trim()) && validateFlightNumber(flightDetails[0]) && validatePassengerCount(Integer.parseInt(flightDetails[2]), flightDetails[1])){
			System.out.println( "Fuel required to fill the tank: " + calculateFuelToFillTank(flightDetails[1], Double.parseDouble(flightDetails[3])));
		}} catch(InvalidFlightException e){
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
}
