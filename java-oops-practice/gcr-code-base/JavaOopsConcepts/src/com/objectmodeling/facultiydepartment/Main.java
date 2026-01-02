package com.objectmodeling.facultiydepartment;

public class Main {
    public static void main(String[] args) {

        // Create faculty members (independent entities)
        Faculty f1 = new Faculty(101, "Prof. Nakeeb");
        Faculty f2 = new Faculty(102, "Prof. Vays");

        // Create university
        University uni = new University("Tech University");

        // Create departments
        Department d1 = new Department(1, "Computer Science");
        Department d2 = new Department(2, "Mechanical Engineering");

        // Add departments to university (composition)
        uni.addDepartment(d1);
        uni.addDepartment(d2);

        // Add faculty to university (aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Faculty can exist independently
        f1.teach();
        f2.teach();

        // Close university (destroys departments only)
        uni.closeUniversity();

        // Faculty still exist after university is closed
        System.out.println("\nFaculty still active after university closure:");
        f1.teach();
        f2.teach();
    }
}
