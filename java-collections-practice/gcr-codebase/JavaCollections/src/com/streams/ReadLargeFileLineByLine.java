package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Reads a large file line by line and prints lines that contain a given word
public class ReadLargeFileLineByLine {

    public static void main(String[] args) {
        String fileName = "large_log.txt";
        String searchWord = "error";

        try {
            readAndFilterLines(fileName, searchWord);
        } catch (IOException exception) {
            System.err.println("File read error: " + exception.getMessage());
        }
    }

    // Filters and prints matching lines using a case-insensitive search
    private static void readAndFilterLines(String fileName, String searchWord)
            throws IOException {

        int lineNumber = 0;
        int matchCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            System.out.println(
                    "Searching for lines containing '" + searchWord + "'\n"
            );

            while ((line = reader.readLine()) != null) {
                lineNumber++;

                if (line.toLowerCase().contains(searchWord.toLowerCase())) {
                    matchCount++;
                    System.out.println("Line " + lineNumber + ": " + line);
                }
            }

            System.out.println("\n================================");
            System.out.println("Total lines processed: " + lineNumber);
            System.out.println("Matching lines: " + matchCount);
        }
    }
}
