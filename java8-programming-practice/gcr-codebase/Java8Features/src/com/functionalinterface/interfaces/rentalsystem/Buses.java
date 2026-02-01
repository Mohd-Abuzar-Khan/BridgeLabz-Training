package com.functionalinterface.interfaces.rentalsystem;

public class Buses extends Vehicle{
	
	public Buses() {
		super("Bus");
	}

	public void rent() {
		System.out.println("Rented a Bus !");
	}
	
	public void returnVehicle() {
		System.out.println( "Bus is returned back !");
	}

}
