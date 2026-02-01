package com.functionalinterface.interfaces.rentalsystem;

public class Vehicle implements IRentable {

	String type;
	
	//constructor
	public Vehicle(String type) {
		
		this.type = type;
	}

	@Override
	public void rent() {
	}

	@Override
	public void returnVehicle() {		
	}
}
