package com.workshop.smarttransport;

// Marker interface for services with emergency privileges
public interface EmergencyService extends ITransportService {

    // Return highest priority for emergency services
    default int getPriority() {
        return 1;
    }

    // Activate the emergency siren
    default void activateSiren() {
        System.out.println("EMERGENCY: " + getServiceName() + " siren activated!");
    }
}
