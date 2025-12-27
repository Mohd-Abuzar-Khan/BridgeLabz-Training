package com.constructor.levelone;

public class PostgraduateStudent extends Student {
	
	String specialization;

    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Name: " + name);  // Accessing protected variable
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA());
    }

}
