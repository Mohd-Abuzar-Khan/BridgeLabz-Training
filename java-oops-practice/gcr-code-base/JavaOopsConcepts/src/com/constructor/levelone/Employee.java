package com.constructor.levelone;

public class Employee {

	public int employeeID;
	protected String department;
	private double salary;
	
    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    
    // Public method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }
    
    // Public method to access salary
    public double getSalary() {
        return salary;
    }

}
