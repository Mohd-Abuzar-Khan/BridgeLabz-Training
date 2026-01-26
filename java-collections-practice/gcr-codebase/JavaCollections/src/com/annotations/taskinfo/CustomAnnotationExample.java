package com.annotations.taskinfo;

import java.lang.reflect.Method;

/**
 * Exercise 4: Create a Custom Annotation and Use It
 */
public class CustomAnnotationExample {
    public static void main(String[] args) {
        Class<?> clazz = TaskManager.class;
        Method[] methods = clazz.getDeclaredMethods();
        
        System.out.println("=== Task Information ===");
        for (Method method : methods) {
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("  Priority: " + taskInfo.priority());
                System.out.println("  Assigned To: " + taskInfo.assignedTo());
                System.out.println();
            }
        }
    }
}
