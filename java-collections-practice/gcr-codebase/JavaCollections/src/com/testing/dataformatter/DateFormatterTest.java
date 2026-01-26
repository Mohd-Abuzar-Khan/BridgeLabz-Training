package com.testing.dataformatter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DateFormatterTest {
    private DateFormatter formatter;
    
    @BeforeEach
    void setUp() {
        formatter = new DateFormatter();
    }
    
    @Test
    void testValidDate() {
        assertEquals("12-05-2023", formatter.formatDate("2023-05-12"));
        assertEquals("01-01-2024", formatter.formatDate("2024-01-01"));
        assertEquals("31-12-2023", formatter.formatDate("2023-12-31"));
    }
    
    @Test
    void testInvalidDate_InvalidFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("12-05-2023");
        });
    }
    
    @Test
    void testInvalidDate_Null() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate(null);
        });
    }
    
    @Test
    void testInvalidDate_Empty() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("");
        });
    }
}
