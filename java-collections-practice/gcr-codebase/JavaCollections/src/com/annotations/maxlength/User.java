package com.annotations.maxlength;

import java.lang.reflect.Field;

/**
 * Intermediate Level - Problem 4: User class with @MaxLength validation
 */
public class User {
    @MaxLength(20)
    private String username;
    
    public User(String username) {
        // Validate using reflection
        validateFieldLength("username", username);
        this.username = username;
    }
    
    private void validateFieldLength(String fieldName, String value) {
        try {
            Field field = this.getClass().getDeclaredField(fieldName);
            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                int maxLen = maxLength.value();
                
                if (value != null && value.length() > maxLen) {
                    throw new IllegalArgumentException(
                        "Field '" + fieldName + "' exceeds maximum length of " + maxLen
                    );
                }
            }
        } catch (NoSuchFieldException e) {
            System.err.println("Field not found: " + fieldName);
        }
    }
    
    public String getUsername() {
        return username;
    }
}
