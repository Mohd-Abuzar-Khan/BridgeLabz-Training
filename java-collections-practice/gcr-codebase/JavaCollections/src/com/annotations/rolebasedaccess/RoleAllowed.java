package com.annotations.rolebasedaccess;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Advanced Level - Problem 5: Custom annotation @RoleAllowed
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAllowed {
    String value();
}
