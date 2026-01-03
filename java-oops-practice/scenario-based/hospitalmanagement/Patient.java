package hospitalmanagement;

//Abstract class representing a generic patient
abstract class Patient {

 private int patientId;
 private String name;
 private int age;
 private String medicalHistory; // Sensitive data (private)

 // Normal admission constructor
 public Patient(int patientId, String name, int age) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
     this.medicalHistory = "Not Provided";
 }

 // Emergency admission constructor (Overloaded)
 public Patient(int patientId, String name, int age, String medicalHistory) {
     this.patientId = patientId;
     this.name = name;
     this.age = age;
     this.medicalHistory = medicalHistory;
 }

 // Encapsulation: Getter
 public String getMedicalHistory() {
     return medicalHistory;
 }

 // Encapsulation: Setter
 public void setMedicalHistory(String medicalHistory) {
     this.medicalHistory = medicalHistory;
 }

 // Public method exposing limited information
 public String getSummary() {
     return "Patient ID: " + patientId +
            ", Name: " + name +
            ", Age: " + age;
 }

 // Polymorphic method
 abstract void displayInfo();
}
