package com.annotations.bugreport;

import java.lang.reflect.Method;

public class RepeatableAnnotationExample {
    public static void main(String[] args) {
        Class<?> clazz = BugTracker.class;
        Method[] methods = clazz.getDeclaredMethods();
        
        for (Method method : methods) {
            if (method.isAnnotationPresent(BugReports.class)) {
                BugReports bugReports = method.getAnnotation(BugReports.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Bug Reports:");
                
                for (BugReport bugReport : bugReports.value()) {
                    System.out.println("  - " + bugReport.description());
                }
            }
        }
    }
}
