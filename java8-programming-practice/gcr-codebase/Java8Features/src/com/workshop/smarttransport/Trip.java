package com.workshop.smarttransport;

import java.time.LocalTime;

// Represents a passenger trip
public class Trip {

    private Passenger passenger;
    private ITransportService service;
    private LocalTime bookingTime;
    private boolean peakHour;

    // Initialize trip details
    public Trip(Passenger passenger, ITransportService service, LocalTime bookingTime) {
        this.passenger = passenger;
        this.service = service;
        this.bookingTime = bookingTime;
        this.peakHour = service.isPeakHour();
    }

    // Return trip attributes
    public Passenger getPassenger() {
        return passenger;
    }

    public ITransportService getService() {
        return service;
    }

    public LocalTime getBookingTime() {
        return bookingTime;
    }

    public boolean isPeakHour() {
        return peakHour;
    }

    public double getTotalFare() {
        return service.getFare();
    }

    public String getRoute() {
        return passenger.getRoute();
    }

    // Return trip details as a string
    @Override
    public String toString() {
        return "Trip{passenger=" + passenger.getName()
                + ", service=" + service.getServiceName()
                + ", destination=" + service.getDestination()
                + ", fare=₹" + service.getFare()
                + ", peakHour=" + peakHour + "}";
    }
}
