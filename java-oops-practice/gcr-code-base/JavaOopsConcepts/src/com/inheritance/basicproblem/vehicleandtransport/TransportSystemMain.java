package com.inheritance.basicproblem.vehicleandtransport;


public class TransportSystemMain {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(120,"Diesel",6);
        vehicles[1] = new Motorcycle(90,"Electric","Scooty");
        vehicles[2] = new Truck( 80, "Petrol", 14);

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println("------------------");
        }
    }
}

