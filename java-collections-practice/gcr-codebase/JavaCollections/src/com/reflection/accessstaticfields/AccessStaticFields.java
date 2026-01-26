package com.reflection.accessstaticfields;

import java.lang.reflect.Field;

// Access and modify private static fields using reflection
public class AccessStaticFields {
    public static void main(String[] args) {
        try {
            Class<?> configClass = Configuration.class; // Load Configuration class

            Field apiKeyField = configClass.getDeclaredField("API_KEY"); // Get private static field

            apiKeyField.setAccessible(true); // Allow access to private field

            String currentValue = (String) apiKeyField.get(null); // Read current value
            System.out.println("Current API_KEY: " + currentValue); // Print current value

            apiKeyField.set(null, "new-api-key-67890"); // Update static field

            String newValue = (String) apiKeyField.get(null); // Read updated value
            System.out.println("Modified API_KEY: " + newValue); // Print updated value

            System.out.println("API_KEY from getter: " + Configuration.getApiKey()); // Confirm via getter

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage()); // Print error message
            e.printStackTrace(); // Print stack trace
        }
    }
}
