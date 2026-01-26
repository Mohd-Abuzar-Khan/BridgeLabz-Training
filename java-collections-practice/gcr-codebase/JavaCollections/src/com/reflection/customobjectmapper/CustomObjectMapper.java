package com.reflection.customobjectmapper;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// Create a Custom Object Mapper - Uses Reflection to set field values from a given Map
public class CustomObjectMapper {
    
    // Converts a Map to an object of the specified class
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create instance
            T instance = clazz.getDeclaredConstructor().newInstance();
            
            // Set field values from map
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object value = entry.getValue();
                
                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(instance, value);
                } catch (NoSuchFieldException e) {
                    System.err.println("Field not found: " + fieldName);
                }
            }
            
            return instance;
            
        } catch (Exception e) {
            throw new RuntimeException("Error creating object", e);
        }
    }
    
    public static void main(String[] args) {
        // Example usage
        Map<String, Object> studentData = new HashMap<>();
        studentData.put("name", "Bob");
        studentData.put("rollNumber", 102);
        
        Student student = toObject(Student.class, studentData);
        System.out.println("Created Student: " + student);
    }
}
