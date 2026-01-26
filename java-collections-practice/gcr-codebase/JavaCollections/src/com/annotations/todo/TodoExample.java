package com.annotations.todo;

import java.lang.reflect.Method;

/**
 * Beginner Level - Problem 2: Create a @Todo Annotation for Pending Tasks
 */
public class TodoExample {
    
    @Todo(task = "Implement user authentication", assignedTo = "Alice", priority = "HIGH")
    public void login() {
        System.out.println("Login method");
    }
    
    @Todo(task = "Add password reset functionality", assignedTo = "Bob", priority = "MEDIUM")
    public void resetPassword() {
        System.out.println("Reset password method");
    }
    
    @Todo(task = "Optimize database queries", assignedTo = "Charlie", priority = "LOW")
    public void queryDatabase() {
        System.out.println("Database query method");
    }
    
    public static void main(String[] args) {
        Class<?> clazz = TodoExample.class;
        Method[] methods = clazz.getDeclaredMethods();
        
        System.out.println("=== Pending Tasks ===");
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  Task: " + todo.task());
                System.out.println("  Assigned To: " + todo.assignedTo());
                System.out.println("  Priority: " + todo.priority());
                System.out.println();
            }
        }
    }
}
