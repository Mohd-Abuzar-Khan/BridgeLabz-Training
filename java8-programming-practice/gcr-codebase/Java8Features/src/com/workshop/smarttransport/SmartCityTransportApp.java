package com.workshop.smarttransport;

import java.time.LocalTime;
import java.util.*;

// Entry point for the smart city transport system
public class SmartCityTransportApp {

    public static void main(String[] args) {

        printHeader();

        // Load passengers and services
        List<Passenger> passengers = initializePassengers();
        List<ITransportService> services = initializeServices();

        // Show service dashboard once
        displayServiceDashboard(services);

        // Process each passenger
        for (Passenger passenger : passengers) {
            processPassenger(passenger, services);
        }

        printFooter();
    }

    // Print application header
    private static void printHeader() {
        System.out.println("===============================================");
        System.out.println("SMART CITY TRANSPORT MANAGEMENT SYSTEM");
        System.out.println("===============================================\n");
    }

    
    // Print application footer
    private static void printFooter() {
        System.out.println("\n===============================================");
        System.out.println("SYSTEM EXECUTION COMPLETE");
        System.out.println("===============================================");
    }

    // Initialize passengers
    private static List<Passenger> initializePassengers() {
        return List.of(
                new Passenger("Rahul", "Airport", "Route-A", 500.0),
                new Passenger("Priya", "Downtown", "Route-B", 300.0),
                new Passenger("Amit", "Tech Park", "Route-A", 450.0),
                new Passenger("Sneha", "Mall", "Route-C", 200.0),
                new Passenger("Vikram", "Central Station", "Route-B", 600.0)
        );
    }

    // Initialize transport services
    private static List<ITransportService> initializeServices() {
        List<ITransportService> services = new ArrayList<>();

        services.add(new BusService("Airport", LocalTime.of(8, 30)));
        services.add(new BusService("Downtown", LocalTime.of(9, 15)));
        services.add(new BusService("Mall", LocalTime.of(14, 0)));

        services.add(new MetroService("Airport", LocalTime.of(7, 45)));
        services.add(new MetroService("Central Station", LocalTime.of(18, 30)));
        services.add(new MetroService("Tech Park", LocalTime.of(8, 0)));

        services.add(new TaxiService("Airport", LocalTime.of(6, 0)));
        services.add(new TaxiService("Downtown", LocalTime.of(10, 30)));

        services.add(new Ambulance("City Hospital", LocalTime.of(15, 45), 500.0));
        services.add(new FireService("Industrial Area", LocalTime.of(11, 20), 0.0));

        return services;
    }

    // Display all available services
    private static void displayServiceDashboard(List<ITransportService> services) {
        System.out.println("AVAILABLE SERVICES");

        services.forEach(s ->
                System.out.printf(
                        "%s\t | %s\t | %s\t | ₹%.2f%n",
                        s.getServiceName(),
                        s.getDestination(),
                        s.getDepartureTime(),
                        s.getFare()
                )
        );

        System.out.println();
    }

    // Process booking for a single passenger
    private static void processPassenger(
            Passenger passenger,
            List<ITransportService> services
    ) {
        System.out.println("PASSENGER");
        System.out.println(passenger);

        ITransportService service = selectService(passenger, services);

        if (service == null) {
            System.out.println("No service available\n");
            return;
        }

        bookService(passenger, service);

        Trip trip = new Trip(passenger, service, LocalTime.now());

        runAnalytics(trip, services);

        System.out.println();
    }

    // Select service based on destination, balance, and time
    private static ITransportService selectService(
            Passenger passenger,
            List<ITransportService> services
    ) {
        return services.stream()
                .filter(s -> s.getDestination().equals(passenger.getDestination()))
                .filter(s -> passenger.canAfford(s.getFare()))
                .sorted(Comparator.comparing(ITransportService::getDepartureTime))
                .findFirst()
                .orElse(null);
    }

    // Deduct fare and confirm booking
    private static void bookService(Passenger passenger, ITransportService service) {
        passenger.deductFare(service.getFare());

        System.out.println("Booked: " + service.getServiceName());
        System.out.println("Departure: " + service.getDepartureTime());
        System.out.println("Remaining balance: ₹" + passenger.getBalance());
    }

    // Run analytics for the trip
    private static void runAnalytics(
            Trip trip,
            List<ITransportService> services
    ) {
        demonstrateDefaultMethods(services);
        demonstrateFunctionalInterfaces(trip.getService());
        demonstrateMarkerInterfaces(services);
    }

    // Show default interface behavior
    private static void demonstrateDefaultMethods(List<ITransportService> services) {
        services.stream()
                .limit(1)
                .forEach(ITransportService::printServiceDetails);
    }

    // Show functional interface usage
    private static void demonstrateFunctionalInterfaces(ITransportService service) {
        FareCalculator calculator = ITransportService::getFare;
        calculator.calculateFare(service);
    }

    // Show marker interface behavior
    private static void demonstrateMarkerInterfaces(List<ITransportService> services) {
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .map(s -> (EmergencyService) s)
                .forEach(EmergencyService::activateSiren);
    }
}
