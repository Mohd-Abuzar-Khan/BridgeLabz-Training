package com.methodrefrencing.patientmanagment;

public class Paitent {
	
	protected String name;
	protected int id;
	
	public Paitent(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void printID() 
	{
		System.out.println(id);
	}
	
}
