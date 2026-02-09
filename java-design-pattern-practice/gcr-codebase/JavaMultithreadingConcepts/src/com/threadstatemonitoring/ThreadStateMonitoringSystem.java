package com.threadstatemonitoring;

import java.util.*;

// Runs the thread state monitoring system
public class ThreadStateMonitoringSystem {

    public static void main(String[] args) throws InterruptedException {

        // Create task threads
        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        // Add threads to monitor list
        List<Thread> threadList = Arrays.asList(t1, t2);

        // Create monitor thread
        StateMonitor monitor = new StateMonitor(threadList);

        // Start monitor
        monitor.start();

        // Start tasks
        t1.start();
        t2.start();

        // Wait for tasks to finish
        t1.join();
        t2.join();

        // Wait for monitor to finish
        monitor.join();
    }
}
