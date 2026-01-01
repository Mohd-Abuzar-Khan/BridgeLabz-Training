package com.inheritance.basicproblem.vehicleandtransport;

public class Motorcycle extends Vehicle{
	private String type;
	
	public Motorcycle(int maxSpeed, String fuelType, String type) {
		super(maxSpeed, fuelType);
		this.type = type;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
        System.out.println("Type of Motorcycle : " + type);

	}
}
