package com.constructor.levelone;

public class Course {

	String courseName;
	int duration;
	double fee;
	
	static String instituteName = "Technocrats";
	
	Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
	
    // Instance Method
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: ₹" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class Method (Static Method)
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

}
