package com.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Copies a file using buffered and unbuffered streams and compares execution time
public class BufferedStreamsFileCopy {

    public static void main(String[] args) {
        String sourceFile = "largefile.txt";
        String bufferedCopy = "copy_buffered.txt";
        String unbufferedCopy = "copy_unbuffered.txt";

        long bufferedTime = copyWithBufferedStreams(sourceFile, bufferedCopy);
        long unbufferedTime = copyWithUnbufferedStreams(sourceFile, unbufferedCopy);

        System.out.println("Buffered Streams Time: " + bufferedTime + " ns (" +
                (bufferedTime / 1_000_000.0) + " ms)");
        System.out.println("Unbuffered Streams Time: " + unbufferedTime + " ns (" +
                (unbufferedTime / 1_000_000.0) + " ms)");
        System.out.println("Performance Improvement: " +
                String.format("%.2f", (double) unbufferedTime / bufferedTime) + "x faster");
    }

    // Copies a file using buffered streams
    private static long copyWithBufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis =
                     new BufferedInputStream(new FileInputStream(source), 4096);
             BufferedOutputStream bos =
                     new BufferedOutputStream(new FileOutputStream(dest), 4096)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            bos.flush();
            System.out.println("File copied using buffered streams");

        } catch (IOException exception) {
            System.err.println("Buffered stream error: " + exception.getMessage());
        }

        return System.nanoTime() - startTime;
    }

    // Copies a file using unbuffered streams
    private static long copyWithUnbufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied using unbuffered streams");

        } catch (IOException exception) {
            System.err.println("Unbuffered stream error: " + exception.getMessage());
        }

        return System.nanoTime() - startTime;
    }
}
