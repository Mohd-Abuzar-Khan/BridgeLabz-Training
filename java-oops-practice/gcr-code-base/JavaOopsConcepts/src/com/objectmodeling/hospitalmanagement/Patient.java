package com.objectmodeling.hospitalmanagement;
import java.util.ArrayList;
import java.util.List;

// Patient class represents a patient in the hospital
public class Patient {

    private String name;
    private int age;

    // A patient can consult multiple doctors
    private List<Doctor> doctors;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    // Add doctor to patient's list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Display doctors consulted by patient
    public void showDoctors() {
        System.out.println("Doctors consulted by " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }

    public String getName() {
        return name;
    }
}
