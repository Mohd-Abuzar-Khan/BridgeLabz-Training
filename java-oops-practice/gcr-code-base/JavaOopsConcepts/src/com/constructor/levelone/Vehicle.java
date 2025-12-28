package com.constructor.levelone;

public class Vehicle {

    // Instance Variables
    String ownerName;
    String vehicleType;

    // Class Variable (shared by all vehicles)
    static double registrationFee = 5000;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class Method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

