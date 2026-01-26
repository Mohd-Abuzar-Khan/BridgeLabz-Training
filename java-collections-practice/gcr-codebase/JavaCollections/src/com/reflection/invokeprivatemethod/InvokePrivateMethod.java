package com.reflection.invokeprivatemethod;

import java.lang.reflect.Method;

// Invoke Private Method - Uses Reflection to invoke the private multiply method from Calculator class
public class InvokePrivateMethod {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        try {
            // Get the Class object
            Class<?> clazz = calculator.getClass();
            
            // Get the private method 'multiply'
            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
            
            // Make the method accessible
            multiplyMethod.setAccessible(true);
            
            // Invoke the private method
            int result = (int) multiplyMethod.invoke(calculator, 5, 4);
            
            System.out.println("Result of multiply(5, 4): " + result);
            
        } catch (Exception e) {
            System.err.println("Error invoking method: " + e.getMessage());
        }
    }
}
