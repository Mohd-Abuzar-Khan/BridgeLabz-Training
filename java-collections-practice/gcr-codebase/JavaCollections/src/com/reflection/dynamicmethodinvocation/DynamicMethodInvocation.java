package com.reflection.dynamicmethodinvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

// Dynamic Method Invocation - Uses Reflection to dynamically call any method based on user input
public class DynamicMethodInvocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MathOperations mathOps = new MathOperations();
        
        try {
            Class<?> clazz = mathOps.getClass();
            
            System.out.print("Enter method name (add, subtract, multiply, divide): ");
            String methodName = scanner.nextLine();
            
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            // Get the method dynamically
            Method method;
            Object result;
            
            if (methodName.equals("divide")) {
                method = clazz.getMethod(methodName, double.class, double.class);
                result = method.invoke(mathOps, num1, num2);
            } else {
                method = clazz.getMethod(methodName, int.class, int.class);
                result = method.invoke(mathOps, (int) num1, (int) num2);
            }
            
            System.out.println("Result: " + result);
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
