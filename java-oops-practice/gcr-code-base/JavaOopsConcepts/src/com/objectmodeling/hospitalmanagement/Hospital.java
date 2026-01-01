package com.objectmodeling.hospitalmanagement;
import java.util.ArrayList;
import java.util.List;

// Hospital contains doctors and patients (association)
public class Hospital {

    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add doctor to hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Add patient to hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Display all doctors and patients
    public void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);

        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("- " + d.getName());
        }

        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}
