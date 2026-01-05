package com.encapsulationandpolymorphism.ridinghailing;

import java.util.ArrayList;
import java.util.List;

// Main application class
public class RideHailingApplication {

    public static void main(String[] args) {

        // Creating list of vehicles (Polymorphism)
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", "Abuzar"));
        vehicles.add(new Bike("BIKE202", "Karan"));
        vehicles.add(new Auto("AUTO303", "Charan"));

        // Calculate fare for a 10 km ride
        RideService.calculateRideFare(vehicles, 10);
    }
}

