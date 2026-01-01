package com.inheritance.basicproblem.employeemanagement;

public class EmployeeManagementMain {
	    public static void main(String[] args) {

	        Employee e1 = new Manager("Arif", 101, 80000, 10);
	        Employee e2 = new Developer("Zeeshan", 102, 60000, "Java");
	        Employee e3 = new Intern("Ananya", 103, 15000, "Summer");

	        e1.displayDetails();
	        System.out.println();

	        e2.displayDetails();
	        System.out.println();

	        e3.displayDetails();
	    }
	}
