package com.reflection.dependencyinjection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Annotation for dependency injection
@Retention(RetentionPolicy.RUNTIME)
public @interface Inject {
}
