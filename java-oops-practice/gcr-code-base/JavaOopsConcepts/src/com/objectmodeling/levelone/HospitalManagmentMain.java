package com.objectmodeling.levelone;

public class HospitalManagmentMain {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Repair Hospital");

        Doctor d1 = new Doctor("Shukla", "Cardiologist");
        Doctor d2 = new Doctor("Mehta", "Neurologist");

        Patient p1 = new Patient("Rajesh", 30);
        Patient p2 = new Patient("Anamika", 25);

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Doctor-patient consultation (association)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p2);

        System.out.println();

        d1.showPatients();
        d2.showPatients();

        System.out.println();

        p1.showDoctors();
        p2.showDoctors();
    }
}
