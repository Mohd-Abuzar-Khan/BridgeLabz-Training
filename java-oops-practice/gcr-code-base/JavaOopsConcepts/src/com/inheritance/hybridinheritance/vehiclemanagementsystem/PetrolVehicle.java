package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable {

	 PetrolVehicle(String model, int maxSpeed) {
	     super(model, maxSpeed);
	 }

	 @Override
	 public void refuel() {
	     System.out.println(model + " is being refueled with petrol.");
	 }
}