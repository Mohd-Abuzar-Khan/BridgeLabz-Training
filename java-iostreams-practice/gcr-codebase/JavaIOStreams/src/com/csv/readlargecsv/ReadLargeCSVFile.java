package com.csv.readlargecsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Reads large CSV files in chunks to manage memory efficiently
public class ReadLargeCSVFile {
    
    private static final int DEFAULT_CHUNK_SIZE = 100;

    public static void main(String[] args) {
        String csvFile = "src/com/csv/readlargecsv/large_data.csv";
        readCSVInChunks(csvFile, DEFAULT_CHUNK_SIZE);
    }

    // Reads CSV in chunks and prints progress
    public static void readCSVInChunks(String filePath, int chunkSize) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;
            int totalRecords = 0;
            int chunkCount = 0;
            int recordsInChunk = 0;

            System.out.println("=== Reading Large CSV File in Chunks ===");
            System.out.println("Chunk size: " + chunkSize + " records");
            System.out.println("----------------------------------------");

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                if (isHeader) {
                    // Skip header
                    isHeader = false;
                    continue;
                }

                recordsInChunk++;
                totalRecords++;

                if (recordsInChunk >= chunkSize) {
                    chunkCount++;
                    processChunk(chunkCount, recordsInChunk, totalRecords);
                    recordsInChunk = 0;
                }
            }

            // Process remaining records in last chunk
            if (recordsInChunk > 0) {
                chunkCount++;
                processChunk(chunkCount, recordsInChunk, totalRecords);
            }

            System.out.println("----------------------------------------");
            System.out.println("Total chunks processed: " + chunkCount);
            System.out.println("Total records processed: " + totalRecords);

        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }

    // Processes a chunk (currently prints summary)
    private static void processChunk(int chunkNumber, int chunkRecords, int totalRecords) {
        System.out.println("Processed chunk #" + chunkNumber + 
                           " - Records: " + chunkRecords + 
                           " | Total so far: " + totalRecords);
    }
}
