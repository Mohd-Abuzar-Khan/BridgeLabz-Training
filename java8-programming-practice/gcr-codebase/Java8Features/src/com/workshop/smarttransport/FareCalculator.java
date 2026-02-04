package com.workshop.smarttransport;

// Functional interface for fare calculation
@FunctionalInterface
public interface FareCalculator {

    // Calculate fare for a transport service
    double calculateFare(ITransportService service);

    // Calculate fare after applying a discount
    default double calculateFareWithDiscount(ITransportService service, double discountPercent) {
        double baseFare = calculateFare(service);
        return baseFare - (baseFare * discountPercent / 100);
    }

    // Apply peak hour charge to base fare
    static double applyPeakSurcharge(double baseFare, boolean isPeak) {
        return isPeak ? baseFare * 1.5 : baseFare;
    }
}
