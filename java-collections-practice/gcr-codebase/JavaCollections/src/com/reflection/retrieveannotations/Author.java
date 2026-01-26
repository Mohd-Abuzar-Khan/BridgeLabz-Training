package com.reflection.retrieveannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Custom annotation @Author with name field
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}
