package com.workshop.smarttransport;

// Represents a passenger in the transport system
public class Passenger {

    private String name;
    private String destination;
    private String route;
    private double balance;

    // Initialize passenger with destination as default route
    public Passenger(String name, String destination, double balance) {
        this.name = name;
        this.destination = destination;
        this.route = destination;
        this.balance = balance;
    }

    // Initialize passenger with a custom route
    public Passenger(String name, String destination, String route, double balance) {
        this.name = name;
        this.destination = destination;
        this.route = route;
        this.balance = balance;
    }

    // Return and update passenger attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Check if the passenger can pay the fare
    public boolean canAfford(double fare) {
        return balance >= fare;
    }

    // Deduct fare from balance
    public void deductFare(double fare) {
        if (!canAfford(fare)) {
            throw new IllegalStateException("Insufficient balance");
        }
        balance -= fare;
    }

    // Return passenger details as a string
    @Override
    public String toString() {
        return "Passenger{name='" + name
                + "', destination='" + destination
                + "', route='" + route
                + "', balance=₹" + balance + "}";
    }
}
