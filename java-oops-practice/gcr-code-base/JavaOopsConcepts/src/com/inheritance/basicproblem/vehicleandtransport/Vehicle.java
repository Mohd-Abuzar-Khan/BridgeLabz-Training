package com.inheritance.basicproblem.vehicleandtransport;

public class Vehicle {
	int maxSpeed;
	String fuelType;
	
	Vehicle(int maxSpeed, String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	public void displayInfo() {
		System.out.println("Vehicle Type: " + fuelType);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
	}

}
