package com.downloadmanager;

import java.util.Random;

// Handles file download using a thread
class FileDownloader extends Thread {

    private final String fileName; // File to download
    private final Random random = new Random(); // Delay simulator

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int progress = 0; progress <= 100; progress += 25) {
            System.out.println("[" + Thread.currentThread().getName() +
                    "] Downloading " + fileName + ": " + progress + "%");
            try {
                Thread.sleep(random.nextInt(500) + 200); // Random delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
