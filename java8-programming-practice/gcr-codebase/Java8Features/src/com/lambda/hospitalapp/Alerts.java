package com.lambda.hospitalapp;

public class Alerts {
	protected String name;
	protected String message;
	protected boolean show;
	
	public Alerts(String name,String message, boolean show) {
		this.name = name;
		this.message = message;
		this.show = show;
	}
	
	public String displayAlert() {
		return message; 
	}

}
