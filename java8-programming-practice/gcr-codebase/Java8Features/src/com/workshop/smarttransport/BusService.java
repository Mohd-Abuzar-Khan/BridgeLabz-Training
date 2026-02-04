package com.workshop.smarttransport;

import java.time.LocalTime;

// Bus service that implements the transport interface
public class BusService implements ITransportService {

    private String destination;
    private LocalTime departureTime;
    private static final double BUS_FARE = 20.0;

    // Initialize service fields
    public BusService(String destination, LocalTime departureTime) {
        this.destination = destination;
        this.departureTime = departureTime;
    }

    // Return service attributes
    @Override
    public String getServiceName() {
        return "Bus	";
    }

    @Override
    public String getDestination() {
        return destination;
    }

    @Override
    public double getFare() {
        return BUS_FARE;
    }

    @Override
    public LocalTime getDepartureTime() {
        return departureTime;
    }
}
