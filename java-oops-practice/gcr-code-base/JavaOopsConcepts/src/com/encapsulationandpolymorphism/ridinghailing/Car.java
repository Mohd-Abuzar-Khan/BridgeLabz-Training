package com.encapsulationandpolymorphism.ridinghailing;

//Car ride implementation
class Car extends Vehicle {

 public Car(String vehicleId, String driverName) {
     super(vehicleId, driverName, 15); // ₹15 per km
 }

 // Fare calculation logic for car
 @Override
 public double calculateFare(double distance) {
     return getRatePerKm() * distance;
 }
}

