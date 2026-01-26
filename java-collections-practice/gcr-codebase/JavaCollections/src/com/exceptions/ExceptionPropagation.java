package com.exceptions;

// Demonstrates exception propagation through methods
public class ExceptionPropagation {

    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException exception) {
            System.out.println("Handled exception in main");
        }
    }

    // Calls method1, allowing exceptions to propagate
    public static void method2() {
        method1();
    }

    // Throws ArithmeticException
    public static void method1() {
        @SuppressWarnings("unused")
        int result = 10 / 0; // division by zero
    }
}
