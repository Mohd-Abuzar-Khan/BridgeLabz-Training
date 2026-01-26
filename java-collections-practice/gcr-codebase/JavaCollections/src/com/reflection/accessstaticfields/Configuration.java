package com.reflection.accessstaticfields;

// Configuration class with private static field for reflection access
public class Configuration {
    private static String API_KEY = "default-key-12345";
    
    public static String getApiKey() {
        return API_KEY;
    }
}
