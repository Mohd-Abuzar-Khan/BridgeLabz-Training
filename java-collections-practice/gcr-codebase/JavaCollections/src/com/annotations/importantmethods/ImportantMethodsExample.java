package com.annotations.importantmethods;

import java.lang.reflect.Method;

public class ImportantMethodsExample {
    
    @ImportantMethod(level = "CRITICAL")
    public void criticalOperation() {
        System.out.println("Critical operation executed");
    }
    
    @ImportantMethod(level = "HIGH")
    public void importantOperation() {
        System.out.println("Important operation executed");
    }
    
    public void regularOperation() {
        System.out.println("Regular operation executed");
    }
    
    public static void main(String[] args) {
        Class<?> clazz = ImportantMethodsExample.class;
        Method[] methods = clazz.getDeclaredMethods();
        
        System.out.println("=== Important Methods ===");
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  Level: " + annotation.level());
                System.out.println();
            }
        }
    }
}
