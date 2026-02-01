package com.functionalinterface.interfaces.smartdevice;

public class Devices implements Controls{
	
	String name;

	//constructor
	public Devices(String name) {
		this.name = name;
	}

	@Override
	public void turnOff() {
	}

	@Override
	public void turnOn() {		
	}	
}
