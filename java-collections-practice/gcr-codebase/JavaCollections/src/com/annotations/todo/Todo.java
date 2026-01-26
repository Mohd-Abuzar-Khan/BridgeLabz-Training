package com.annotations.todo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Beginner Level - Problem 2: Custom annotation @Todo
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
