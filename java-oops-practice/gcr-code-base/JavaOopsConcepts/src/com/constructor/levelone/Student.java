package com.constructor.levelone;

public class Student {

	public int rollNumber;
	protected String name;
	private double cgpa;
	
	// Constructor
    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getter for CGPA
    public double getCGPA() {
        return cgpa;
    }
    
    // Setter for CGPA
    public void setCGPA(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA value.");
        }
    }
    
    // Method to display student info
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
