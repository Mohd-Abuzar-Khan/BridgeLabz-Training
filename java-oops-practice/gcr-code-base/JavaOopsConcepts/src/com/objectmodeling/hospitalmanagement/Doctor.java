package com.objectmodeling.hospitalmanagement;
import java.util.ArrayList;
import java.util.List;

// Doctor class represents a doctor in the hospital
public class Doctor {

    private String name;
    private String specialization;

    // A doctor can consult multiple patients
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Doctor consults a patient (communication)
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());

        // Establish two-way association
        patients.add(patient);
        patient.addDoctor(this);
    }

    // Display all patients consulted by the doctor
    public void showPatients() {
        System.out.println("Patients consulted by Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }

    public String getName() {
        return name;
    }
}

