package com.annotations.jsonfield;

import java.lang.reflect.Field;

public class JsonSerializationExample {
    
    public static String toJSON(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder();
        json.append("{\n");
        
        Field[] fields = clazz.getDeclaredFields();
        int annotatedFieldCount = 0;
        
        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                if (annotatedFieldCount > 0) {
                    json.append(",\n");
                }
                
                JsonField jsonField = field.getAnnotation(JsonField.class);
                field.setAccessible(true);
                Object value = field.get(obj);
                
                json.append("  \"").append(jsonField.name()).append("\": ");
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }
                
                annotatedFieldCount++;
            }
        }
        
        json.append("\n}");
        return json.toString();
    }
    
    public static void main(String[] args) throws IllegalAccessException {
        JsonUser user = new JsonUser("john_doe", "john@example.com", "secret123");
        System.out.println("=== JSON Serialization ===");
        System.out.println(toJSON(user));
    }
}
