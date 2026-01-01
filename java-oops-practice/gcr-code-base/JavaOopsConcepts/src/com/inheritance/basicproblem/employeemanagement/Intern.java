package com.inheritance.basicproblem.employeemanagement;

public class Intern extends Employee {
    String internshipType;

    public Intern(String name, int id, int salary, String internshipType) {
        super(name, id, salary);
        this.internshipType = internshipType;
    }

    @Override
    public void displayDetails() {
    	System.out.println("Intern Name: " + name);
        System.out.println("Intern ID: " + id);
        System.out.println("Salary: ₹" + salary);;
        System.out.println("Internship Type: " + internshipType);
    }
}
