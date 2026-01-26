package com.annotations.logging;

import java.lang.reflect.Method;

public class LoggingExample {
    
    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1000; i++) {
            // Quick operation
        }
    }
    
    @LogExecutionTime
    public void slowMethod() {
        try {
            Thread.sleep(100); // Simulate slow operation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void regularMethod() {
        System.out.println("Regular method without logging");
    }
    
    public static void main(String[] args) throws Exception {
        LoggingExample example = new LoggingExample();
        Class<?> clazz = example.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        
        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(example);
                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                
                System.out.println("Method: " + method.getName());
                System.out.println("Execution Time: " + duration + " nanoseconds (" + 
                                 (duration / 1_000_000.0) + " ms)");
                System.out.println();
            }
        }
    }
}
