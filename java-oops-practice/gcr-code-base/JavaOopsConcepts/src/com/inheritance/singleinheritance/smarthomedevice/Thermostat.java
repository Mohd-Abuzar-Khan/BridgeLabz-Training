package com.inheritance.singleinheritance.smarthomedevice;

public class Thermostat extends Device {
	 int temperatureSetting;

	 // Constructor
	 Thermostat(String deviceId, String status, int temperatureSetting) {
	     super(deviceId, status); // calling parent constructor
	     this.temperatureSetting = temperatureSetting;
	 }

	 // Overriding method
	 @Override
	 void displayStatus() {
	     super.displayStatus();
	     System.out.println("Temperature Setting: " + temperatureSetting + "°C");
	 }
	}