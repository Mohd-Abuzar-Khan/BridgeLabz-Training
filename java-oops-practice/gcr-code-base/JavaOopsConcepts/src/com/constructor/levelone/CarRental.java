package com.constructor.levelone;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    // Default Constructor
    CarRental() {
        this("Mohit Dubey", "Standard", 5);
    }

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    double calculateCost() {
        double ratePerDay = 1000; 
        return rentalDays * ratePerDay;
    }
}

