package com.functionalinterface.interfaces.rentalsystem;

public class Bikes extends Vehicle {
	public Bikes() {
		super("Bike");
	}

	public void rent() {
		System.out.println("Renting a Bike !");
	}
	
	public void returnVehicle() {
		System.out.println( "Bike is returned back !");
	}

}
