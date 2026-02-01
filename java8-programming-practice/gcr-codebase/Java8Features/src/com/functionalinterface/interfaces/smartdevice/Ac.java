package com.functionalinterface.interfaces.smartdevice;

public class Ac extends Devices {
	
	public Ac() {
		super("AC");
	}

	public void turnOn() {
		System.out.println("AC is ON");
	}
	
	public void turnOff() {
		System.out.println("AC is OFF");
	}
}
