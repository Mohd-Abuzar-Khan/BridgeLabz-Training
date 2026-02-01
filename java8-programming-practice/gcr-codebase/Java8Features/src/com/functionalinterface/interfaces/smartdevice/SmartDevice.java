package com.functionalinterface.interfaces.smartdevice;

public class SmartDevice {
	
	public static void main(String[] args) {
	//Creating device
	Devices d1 = new Light();
	Devices d2= new Ac();
	Devices d3= new Tv();
			
	//light methods
	d1.turnOn();
	d1.turnOff();
			
	//A C methods
	d2.turnOn();
	d2.turnOff();
			
	//TV device
	d3.turnOn();
	d3.turnOff();
	}
}
