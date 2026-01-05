package com.encapsulationandpolymorphism.ridinghailing;

//Interface for GPS-related functionality
interface GPS {

 // Get the current location of the vehicle
 String getCurrentLocation();

 // Update the current location of the vehicle
 void updateLocation(String newLocation);
}

