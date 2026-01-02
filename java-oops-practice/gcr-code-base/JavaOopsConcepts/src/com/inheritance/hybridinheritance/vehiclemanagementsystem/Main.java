package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class Main {
	 public static void main(String[] args) {

	     ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 260);
	     PetrolVehicle honda = new PetrolVehicle("Mahindra 2017 Model", 200);

	     System.out.println("Electric Vehicle Details:");
	     tesla.displayInfo();
	     tesla.charge();

	     System.out.println("\nPetrol Vehicle Details:");
	     honda.displayInfo();
	     honda.refuel();
	 }
}