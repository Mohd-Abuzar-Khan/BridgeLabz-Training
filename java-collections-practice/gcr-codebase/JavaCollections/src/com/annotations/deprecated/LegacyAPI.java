package com.annotations.deprecated;

/**
 * Exercise 2: Use @Deprecated to Mark an Old Method
 */
public class LegacyAPI {
    
    @Deprecated
    public void oldFeature() {
        System.out.println("This is the old feature");
    }
    
    public void newFeature() {
        System.out.println("This is the new feature");
    }
}
