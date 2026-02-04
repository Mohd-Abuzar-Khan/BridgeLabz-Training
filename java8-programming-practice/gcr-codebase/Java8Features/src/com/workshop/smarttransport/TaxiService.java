package com.workshop.smarttransport;

import java.time.LocalTime;

// Taxi service that implements the transport interface
public class TaxiService implements ITransportService {

    private String destination;
    private LocalTime departureTime;
    private static final double TAXI_FARE = 120.0;

    // Initialize service fields
    public TaxiService(String destination, LocalTime departureTime) {
        this.destination = destination;
        this.departureTime = departureTime;
    }

    // Return service attributes
    @Override
    public String getServiceName() {
        return "Taxi	";
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public double getFare() {
        return TAXI_FARE;
    }

    @Override
    public LocalTime getDepartureTime() {
        return departureTime;
    }
}
