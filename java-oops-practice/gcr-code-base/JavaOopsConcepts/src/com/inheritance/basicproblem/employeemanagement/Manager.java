package com.inheritance.basicproblem.employeemanagement;

public class Manager extends Employee {
	public int teamSize;
	
	public Manager(String name, int id, int salary, int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}
	
	public void displayDetails() {
		System.out.println("Manager Name: " + name);
        System.out.println("Manager ID: " + id);
        System.out.println("Salary: ₹" + salary);
        System.out.println("Team Size: " + teamSize);        
        
	}
	

}
