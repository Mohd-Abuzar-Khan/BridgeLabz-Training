package com.printshop;

// Represents a single print task
class PrintJob implements Runnable {

    private final String jobName;     // Print job name
    private final int pages;          // Total pages
    private final String priorityTag; // Job priority

    public PrintJob(String jobName, int pages, String priorityTag) {
        this.jobName = jobName;
        this.pages = pages;
        this.priorityTag = priorityTag;
    }

    @Override
    public void run() {
        for (int page = 1; page <= pages; page++) {
            System.out.println("[" + priorityTag + "] Printing " +
                    jobName + " - Page " + page + " of " + pages);
            try {
                Thread.sleep(100); // Simulate print time
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(jobName + " interrupted");
                return;
            }
        }
    }
}
