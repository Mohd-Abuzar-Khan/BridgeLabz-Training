package com.testing.performance;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceTaskTest {
    private PerformanceTask performanceTask = new PerformanceTask();
    
    @Test
    @Timeout(2) // Test should fail if it takes more than 2 seconds
    void testLongRunningTask() throws InterruptedException {
        // This test will fail because the task takes 3 seconds
        // but timeout is set to 2 seconds
        String result = performanceTask.longRunningTask();
        assertEquals("Task completed", result);
    }
}
