package com.threadstatemonitoring;

import java.time.LocalTime;
import java.util.*;

// Monitors the state of multiple threads
class StateMonitor extends Thread {

    private final List<Thread> threads; // Threads to monitor
    private final Map<String, Set<Thread.State>> stateHistory = new HashMap<>();

    public StateMonitor(List<Thread> threads) {
        this.threads = threads;
    }

    @Override
    public void run() {

        boolean allTerminated = false;

        // Initialize state history
        for (Thread thread : threads) {
            stateHistory.put(thread.getName(), new HashSet<>());
        }

        while (!allTerminated) {

            allTerminated = true;

            for (Thread thread : threads) {

                Thread.State state = thread.getState();
                stateHistory.get(thread.getName()).add(state);

                System.out.println("[Monitor] " + thread.getName() +
                        " is in " + state + " state at " + LocalTime.now());

                if (state != Thread.State.TERMINATED) {
                    allTerminated = false;
                }
            }

            try {
                Thread.sleep(500); // Check every 500 ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Monitor interrupted");
                return;
            }
        }

        // Print summary
        System.out.println("\n----- Summary -----");
        for (String name : stateHistory.keySet()) {
            System.out.println("Summary: " + name +
                    " went through " + stateHistory.get(name).size() + " states");
        }
    }
}
