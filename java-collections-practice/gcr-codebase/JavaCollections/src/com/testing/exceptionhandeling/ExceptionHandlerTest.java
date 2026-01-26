package com.testing.exceptionhandeling;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExceptionHandlerTest {
    private ExceptionHandler exceptionHandler = new ExceptionHandler();
    
    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> {
            exceptionHandler.divide(10, 0);
        });
    }
    
    @Test
    void testNormalDivision() {
        assertEquals(2.0, exceptionHandler.divide(10, 5), 0.001);
        assertEquals(3.5, exceptionHandler.divide(7, 2), 0.001);
    }
}
