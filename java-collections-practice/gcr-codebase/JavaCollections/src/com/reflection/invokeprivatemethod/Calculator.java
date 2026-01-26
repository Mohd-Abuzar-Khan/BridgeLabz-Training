package com.reflection.invokeprivatemethod;

// Calculator class with private method for reflection invocation demonstration
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    private int multiply(int a, int b) {
        return a * b;
    }
}
