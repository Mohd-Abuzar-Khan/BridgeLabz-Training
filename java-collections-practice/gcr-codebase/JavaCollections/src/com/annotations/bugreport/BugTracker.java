package com.annotations.bugreport;

public class BugTracker {
    
    @BugReport(description = "Null pointer exception in login method")
    @BugReport(description = "Performance issue with large datasets")
    public void processData() {
        System.out.println("Processing data...");
    }
}
