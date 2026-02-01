package com.functionalinterface.staticinterface.unitconversion;

public class UnitConversion {
	
	public static void main(String[] args) {


        System.out.println("===== DISTANCE =====");
        System.out.println("100 km  = " + IUnitConverter.kmToMiles(100) + " miles");

        System.out.println("\n===== WEIGHT =====");
        System.out.println("50 kg   = " + IUnitConverter.kgToLbs(50) + " lbs");

        System.out.println("\n===== TEMPERATURE =====");
        System.out.println("100 °C  = " + IUnitConverter.celsiusToFahrenheit(100) + " °F");
    }

}
