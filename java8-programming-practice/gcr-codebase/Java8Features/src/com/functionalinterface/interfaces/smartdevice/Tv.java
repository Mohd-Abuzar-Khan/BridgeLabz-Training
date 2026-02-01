package com.functionalinterface.interfaces.smartdevice;

public class Tv extends Devices {
	
	public Tv() {
		super("TV");
	}

	public void turnOn() {
		System.out.println("TV is ON");
	}
	
	public void turnOff() {
	
		System.out.println("TV is OFF");
	}
}
