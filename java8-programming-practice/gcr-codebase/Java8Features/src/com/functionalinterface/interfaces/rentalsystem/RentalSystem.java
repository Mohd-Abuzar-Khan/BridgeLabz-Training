package com.functionalinterface.interfaces.rentalsystem;

public class RentalSystem {
	
	public static void main(String []args) {
		
		//Vehicle object
		Vehicle v1 = new Buses();
		Vehicle v2= new Bikes();
		Vehicle v3= new Cars();
		
		//Bus methods
		v1.rent();
		v2.returnVehicle();
		
		//Bike method
		v2.rent();
		v2.returnVehicle();
		
		//Car method 
		v3.rent();
		v3.returnVehicle();
	}


}
