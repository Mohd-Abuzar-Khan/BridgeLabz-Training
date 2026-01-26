package com.streams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// Demonstrates inter-thread communication using piped streams
public class PipedStreamsThread {

    public static void main(String[] args) {
        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream);

            Thread writerThread = new Thread(new Writer(outputStream));
            Thread readerThread = new Thread(new Reader(inputStream));

            writerThread.start();
            readerThread.start();

            writerThread.join();
            readerThread.join();

            System.out.println("\nInter-thread communication completed");

        } catch (IOException | InterruptedException exception) {
            System.err.println("Execution error: " + exception.getMessage());
        }
    }
}

// Writes messages to a piped output stream
class Writer implements Runnable {

    private final PipedOutputStream outputStream;

    public Writer(PipedOutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        try {
            String[] messages = {
                    "Hello from Writer Thread!",
                    "This is message 2",
                    "This is message 3",
                    "End of messages"
            };

            for (String message : messages) {
                outputStream.write((message + "\n").getBytes());
                System.out.println("Writer sent: " + message);
                Thread.sleep(500);
            }

            outputStream.close();

        } catch (IOException | InterruptedException exception) {
            System.err.println("Writer error: " + exception.getMessage());
        }
    }
}

// Reads messages from a piped input stream
class Reader implements Runnable {

    private final PipedInputStream inputStream;

    public Reader(PipedInputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            int data;
            StringBuilder message = new StringBuilder();

            while ((data = inputStream.read()) != -1) {
                if (data == '\n') {
                    System.out.println("Reader received: " + message);
                    message.setLength(0);
                } else {
                    message.append((char) data);
                }
            }

            inputStream.close();

        } catch (IOException exception) {
            System.err.println("Reader error: " + exception.getMessage());
        }
    }
}
