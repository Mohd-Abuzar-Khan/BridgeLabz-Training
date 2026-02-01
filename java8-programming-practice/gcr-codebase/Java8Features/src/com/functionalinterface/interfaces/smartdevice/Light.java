package com.functionalinterface.interfaces.smartdevice;

public class Light extends Devices {
	
	public Light() {
		super("Light");
	}

	public void turnOn() {
		System.out.println("Light is ON ");
	}
	
	public void turnOff() {
	
		System.out.println("Light is OFF");
	}
}
