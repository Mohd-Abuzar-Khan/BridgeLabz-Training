package com.threadstatemonitoring;

// Runs a task in a separate thread
class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {

            // Simulate computation
            for (int i = 0; i < 1_000_000; i++) {
                int result = i * i;
            }

            // Simulate waiting
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(getName() + " interrupted");
        }
    }
}
