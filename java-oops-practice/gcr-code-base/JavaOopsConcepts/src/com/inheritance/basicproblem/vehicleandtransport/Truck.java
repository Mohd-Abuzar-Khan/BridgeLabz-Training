package com.inheritance.basicproblem.vehicleandtransport;

public class Truck extends Vehicle{
	int wheels;
	
	public Truck(int maxSpeed, String fuelType, int wheels) {
		super(maxSpeed, fuelType);
		this.wheels = wheels;
	}
	
	@Override 
	public void displayInfo() {
		super.displayInfo();
        System.out.println("Total Wheels : " + wheels);

	}
}
