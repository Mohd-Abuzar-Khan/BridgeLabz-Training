package com.functionalinterface.defaultinterface.smartvehicle;

public interface IVehicle {
	
    void displaySpeed();

    default void displayFuel(double fuelPercent) {
        System.out.println("Fuel Level: " + fuelPercent + "%");
    }

    default void displayBattery(double batteryPercent) {
        System.out.println("Battery Level: " + batteryPercent + "%");
    }

}
