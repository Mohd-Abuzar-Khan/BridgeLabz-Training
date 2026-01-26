package com.annotations.taskinfo;

/**
 * Exercise 4: TaskManager class with @TaskInfo annotation
 */
public class TaskManager {
    
    @TaskInfo(priority = "HIGH", assignedTo = "John")
    public void criticalTask() {
        System.out.println("Executing critical task");
    }
    
    @TaskInfo(priority = "LOW", assignedTo = "Jane")
    public void regularTask() {
        System.out.println("Executing regular task");
    }
}
