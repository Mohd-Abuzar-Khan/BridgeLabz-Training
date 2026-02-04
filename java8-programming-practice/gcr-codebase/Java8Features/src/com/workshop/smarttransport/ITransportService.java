package com.workshop.smarttransport;

import java.time.LocalTime;

// Core interface for all transport services
public interface ITransportService {

    // Return service attributes
    String getDestination();
    String getServiceName();
    double getFare();
    LocalTime getDepartureTime();

    // Print common service details
    default void printServiceDetails() {
        System.out.println(
                getServiceName()
                        + " | Destination: " + getDestination()
                        + " | Departure: " + getDepartureTime()
                        + " | Fare: ₹" + getFare()
        );
    }

    // Check if the service runs during peak hours
    default boolean isPeakHour() {
        LocalTime time = getDepartureTime();
        int hour = time.getHour();
        return (hour >= 7 && hour < 10) || (hour >= 17 && hour < 21);
    }

    // Calculate distance using a simplified Haversine formula
    static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double earthRadius = 6371;
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                + Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return earthRadius * c;
    }
}
