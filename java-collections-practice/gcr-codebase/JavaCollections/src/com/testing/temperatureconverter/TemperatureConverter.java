package com.testing.temperatureconverter;

/**
 * Problem 11: Temperature Converter
 */
public class TemperatureConverter {
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
