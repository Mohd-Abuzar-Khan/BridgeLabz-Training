package com.functionalinterface.defaultinterface.smartvehicle;

public class SmartVehicleDashboard {
    public static void main(String[] args) {
		IVehicle car = () -> System.out.println("Car Speed: 85 km/h");
	
	    System.out.println("===== PETROL CAR =====");
	    car.displaySpeed();             
	    car.displayFuel(62.5);     
	
	    IVehicle electricCar = () -> System.out.println("Electric Car Speed: 120 km/h");
	
	    System.out.println("\n===== ELECTRIC CAR =====");
	    electricCar.displaySpeed();              
	    electricCar.displayFuel(0);          
	    electricCar.displayBattery(78.3);  
	
	    IVehicle hybridCar = () -> System.out.println("Hybrid Car Speed: 100 km/h");
	
	    System.out.println("\n===== HYBRID CAR =====");
	    hybridCar.displaySpeed();         
	    hybridCar.displayFuel(45.0);       
	    hybridCar.displayBattery(55.0);
    }
}
