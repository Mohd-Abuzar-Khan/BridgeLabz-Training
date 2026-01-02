package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle {

	 ElectricVehicle(String model, int maxSpeed) {
	     super(model, maxSpeed);
	 }

	 void charge() {
	     System.out.println(model + " is charging its battery.");
	 }
}