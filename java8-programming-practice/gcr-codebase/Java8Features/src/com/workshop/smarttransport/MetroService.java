package com.workshop.smarttransport;

import java.time.LocalTime;

/**
 * MetroService implementation
 * Demonstrates: Interface implementation
 */
public class MetroService implements ITransportService {
    private String destination;
    private LocalTime departureTime;
    private static final double METRO_FARE = 40.0;
    
    public MetroService(String destination, LocalTime departureTime) {
        this.destination = destination;
        this.departureTime = departureTime;
    }
    
    @Override
    public String getServiceName() {
        return "Metro	";
    }
    
    @Override
    public String getDestination() {
        return destination;
    }
    
    @Override
    public double getFare() {
        return METRO_FARE;
    }
    
    @Override
    public LocalTime getDepartureTime() {
        return departureTime;
    }
}