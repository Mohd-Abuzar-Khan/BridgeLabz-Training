package com.testing.temperatureconverter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Problem 11: Testing Temperature Converter
 */
public class TemperatureConverterTest {
    private TemperatureConverter converter;
    
    @BeforeEach
    void setUp() {
        converter = new TemperatureConverter();
    }
    
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
        assertEquals(98.6, converter.celsiusToFahrenheit(37), 0.1);
    }
    
    @Test
    void testFahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
        assertEquals(37.0, converter.fahrenheitToCelsius(98.6), 0.1);
    }
    
    @Test
    void testRoundTripConversion() {
        double celsius = 25.0;
        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        double backToCelsius = converter.fahrenheitToCelsius(fahrenheit);
        assertEquals(celsius, backToCelsius, 0.001);
    }
}
