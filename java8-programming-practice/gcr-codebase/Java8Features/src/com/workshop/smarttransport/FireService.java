package com.workshop.smarttransport;

import java.time.LocalTime;

// Fire service that implements the emergency marker interface
public class FireService implements EmergencyService {

    private String destination;
    private LocalTime departureTime;
    private double fare;

    // Initialize service fields
    public FireService(String destination, LocalTime departureTime, double fare) {
        this.destination = destination;
        this.departureTime = departureTime;
        this.fare = fare;
    }

    // Return service attributes
    @Override
    public String getServiceName() {
        return "Fire Service";
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public double getFare() {
        return fare;
    }

    @Override
    public LocalTime getDepartureTime() {
        return departureTime;
    }

    // Print service details
    @Override
    public void printServiceDetails() {
        System.out.println("FIRE SERVICE | Destination: " + destination
                + " | Departure: " + departureTime
                + " | Fare: ₹" + fare);
    }
}
