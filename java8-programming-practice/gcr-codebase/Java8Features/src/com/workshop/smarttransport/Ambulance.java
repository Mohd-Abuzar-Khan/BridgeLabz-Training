package com.workshop.smarttransport;

import java.time.LocalTime;

// Ambulance emergency service that implements the marker interface
public class Ambulance implements EmergencyService {

    private String destination;
    private LocalTime departureTime;
    private double fare;

    // Create an ambulance service with destination, time, and fare
    public Ambulance(String destination, LocalTime departureTime, double fare) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.fare = fare;
    }

    // Return the service name
    @Override
    public String getServiceName() {
        return "Ambulance";
    }

    // Return the destination
    @Override
    public String getDestination() {
        return destination;
    }

    // Return the fare
    @Override
    public double getFare() {
        return fare;
    }

    // Return the departure time
    @Override
    public LocalTime getDepartureTime() {
        return departureTime;
    }

    // Print emergency service details
    @Override
    public void printServiceDetails() {
        System.out.println("EMERGENCY AMBULANCE | Destination: " + destination
                + " | Departure: " + departureTime
                + " | Fare: ₹" + fare);
    }
}
