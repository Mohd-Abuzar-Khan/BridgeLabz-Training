package com.reflection.generatejson;

import java.lang.reflect.Field;

//Generate a JSON Representation - Converts an object to a JSON-like string using Reflection
public class GenerateJSON {
    
    // Converts an object to JSON string using reflection
    public static String toJSON(Object obj) {
        if (obj == null) {
            return "null";
        }
        
        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            
            json.append("  \"").append(field.getName()).append("\": ");
            
            try {
                Object value = field.get(obj);
                
                if (value == null) {
                    json.append("null");
                } else if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else if (value instanceof Number || value instanceof Boolean) {
                    json.append(value);
                } else {
                    json.append("\"").append(value.toString()).append("\"");
                }
                
                if (i < fields.length - 1) {
                    json.append(",");
                }
                json.append("\n");
                
            } catch (IllegalAccessException e) {
                json.append("null");
            }
        }
        
        json.append("}");
        return json.toString();
    }
    
    public static void main(String[] args) {
        Student student = new Student("Alice", 101);
        System.out.println("=== JSON Representation ===");
        System.out.println(toJSON(student));
        
        Person person = new Person("John", 30);
        System.out.println("\n=== JSON Representation ===");
        System.out.println(toJSON(person));
    }
}
