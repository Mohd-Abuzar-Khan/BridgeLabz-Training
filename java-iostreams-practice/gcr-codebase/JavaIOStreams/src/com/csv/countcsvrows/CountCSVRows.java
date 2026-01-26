package com.csv.countcsvrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {

    // Counts non-empty data rows in a CSV file while skipping the header
    private static final String CSV_FILE_PATH =
            "src/com/csv/countcsvrows/data.csv";

    public static void main(String[] args) {
        int rowCount = countRows(CSV_FILE_PATH);
        System.out.println("Total number of records (excluding header): " + rowCount);
    }

    private static int countRows(String filePath) {
        int rowCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean skipHeader = true;
            while ((line = reader.readLine()) != null) {
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }
                if (!line.trim().isEmpty()) {
                    rowCount++;
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to read CSV file: " + e.getMessage());
        }
        return rowCount;
    }
}
