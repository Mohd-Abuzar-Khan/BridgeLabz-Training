package com.testing.userregeistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private UserRegistration registration;
    
    @BeforeEach
    void setUp() {
        registration = new UserRegistration();
    }
    
    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() -> {
            registration.registerUser("john_doe", "john@example.com", "password123");
        });
    }
    
    @Test
    void testInvalidUsername_Null() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser(null, "john@example.com", "password123");
        });
    }
    
    @Test
    void testInvalidUsername_Empty() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("", "john@example.com", "password123");
        });
    }
    
    @Test
    void testInvalidEmail_NoAtSymbol() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john_doe", "invalidemail", "password123");
        });
    }
    
    @Test
    void testInvalidPassword_TooShort() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john_doe", "john@example.com", "pass");
        });
    }
    
    @Test
    void testInvalidPassword_Null() {
        assertThrows(IllegalArgumentException.class, () -> {
            registration.registerUser("john_doe", "john@example.com", null);
        });
    }
}
