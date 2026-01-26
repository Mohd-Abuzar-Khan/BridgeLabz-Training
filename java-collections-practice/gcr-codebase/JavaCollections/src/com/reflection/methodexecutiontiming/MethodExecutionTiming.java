package com.reflection.methodexecutiontiming;

import java.lang.reflect.Method;

//  Method Execution Timing - Uses Reflection to measure the execution time of methods dynamically
public class MethodExecutionTiming {
    
    // Measures execution time of a method
    public static long measureExecutionTime(Object obj, String methodName, Object... args) {
        try {
            Class<?> clazz = obj.getClass();
            
            // Get parameter types
            Class<?>[] paramTypes = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                paramTypes[i] = args[i].getClass();
            }
            
            // Get the method
            Method method = clazz.getMethod(methodName, paramTypes);
            
            // Measure execution time
            long startTime = System.nanoTime();
            method.invoke(obj, args);
            long endTime = System.nanoTime();
            
            return endTime - startTime;
            
        } catch (Exception e) {
            System.err.println("Error measuring execution time: " + e.getMessage());
            return -1;
        }
    }
    
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        
        System.out.println("=== Method Execution Timing ===");
        
        long time1 = measureExecutionTime(mathOps, "add", 10, 20);
        System.out.println("add(10, 20) execution time: " + time1 + " nanoseconds");
        
        long time2 = measureExecutionTime(mathOps, "multiply", 5, 4);
        System.out.println("multiply(5, 4) execution time: " + time2 + " nanoseconds");
        
        long time3 = measureExecutionTime(mathOps, "subtract", 100, 50);
        System.out.println("subtract(100, 50) execution time: " + time3 + " nanoseconds");
    }
}
