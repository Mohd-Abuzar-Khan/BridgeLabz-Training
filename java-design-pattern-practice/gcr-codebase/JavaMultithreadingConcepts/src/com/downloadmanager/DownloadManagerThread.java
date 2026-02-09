package com.downloadmanager;

public class DownloadManagerThread {

    public static void main(String[] args) throws InterruptedException {

        // Create download threads
        FileDownloader t1 = new FileDownloader("Document.pdf");
        FileDownloader t2 = new FileDownloader("Image.jpg");
        FileDownloader t3 = new FileDownloader("Video.mp4");

        // Start downloads
        t1.start();
        t2.start();
        t3.start();

        // Wait for all downloads to finish
        t1.join();
        t2.join();
        t3.join();

        // Print completion message
        System.out.println("All downloads complete!");
    }
}
