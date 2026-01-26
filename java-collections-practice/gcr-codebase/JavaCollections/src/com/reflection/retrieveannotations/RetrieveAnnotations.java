package com.reflection.retrieveannotations;

import java.lang.annotation.Annotation;

// Retrieve Annotations at Runtime - Retrieves and displays the @Author annotation value at runtime
public class RetrieveAnnotations {
    public static void main(String[] args) {
        Class<?> bookClass = Book.class;
        
        // Check if the class has @Author annotation
        if (bookClass.isAnnotationPresent(Author.class)) {
            // Get the annotation
            Author authorAnnotation = bookClass.getAnnotation(Author.class);
            
            System.out.println("=== Annotation Retrieved ===");
            System.out.println("Author Name: " + authorAnnotation.name());
        } else {
            System.out.println("No @Author annotation found");
        }
        
        // Display all annotations
        System.out.println("\n=== All Annotations ===");
        Annotation[] annotations = bookClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
