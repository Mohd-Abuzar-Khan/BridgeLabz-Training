package com.functionalinterface.interfaces.rentalsystem;

public class Cars extends Vehicle{
	public Cars() {
		super("Car");
	}

	public void rent() {
		System.out.println("Renting a Car !");
	}
	
	public void returnVehicle() {
		System.out.println( "Car is returned back !");
	}
}
