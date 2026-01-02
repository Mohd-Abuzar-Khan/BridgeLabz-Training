package com.inheritance.singleinheritance.smarthomedevice;

public class Main {
	 public static void main(String[] args) {
	     Thermostat thermostat = new Thermostat(
	             "THERMO-101",
	             "ON",
	             24
	     );

	     thermostat.displayStatus();
	 }
}
