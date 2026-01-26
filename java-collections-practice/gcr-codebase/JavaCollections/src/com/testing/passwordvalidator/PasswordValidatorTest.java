package com.testing.passwordvalidator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    private PasswordValidator validator = new PasswordValidator();
    
    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password123"));
        assertTrue(validator.isValid("MyPass1"));
        assertTrue(validator.isValid("SecurePass9"));
    }
    
    @Test
    void testInvalidPassword_TooShort() {
        assertFalse(validator.isValid("Pass1"));
        assertFalse(validator.isValid("Ab1"));
    }
    
    @Test
    void testInvalidPassword_NoUpperCase() {
        assertFalse(validator.isValid("password123"));
        assertFalse(validator.isValid("mypassword1"));
    }
    
    @Test
    void testInvalidPassword_NoDigit() {
        assertFalse(validator.isValid("Password"));
        assertFalse(validator.isValid("MyPassword"));
    }
    
    @Test
    void testInvalidPassword_Null() {
        assertFalse(validator.isValid(null));
    }
}
