package com.annotations.taskinfo;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Exercise 4: Custom annotation @TaskInfo
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface TaskInfo {
    String priority() default "MEDIUM";
    String assignedTo();
}
