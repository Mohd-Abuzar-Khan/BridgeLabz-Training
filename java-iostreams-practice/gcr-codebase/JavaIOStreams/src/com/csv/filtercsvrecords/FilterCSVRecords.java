package com.csv.filtercsvrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Filters and prints students who scored above the threshold
public class FilterCSVRecords {

    public static void main(String[] args) {
        String csvFile = "src/com/csv/filtercsvrecords/students.csv";
        int thresholdMarks = 80;

        filterStudentsByMarks(csvFile, thresholdMarks);
    }

    // Reads CSV and prints students with marks above threshold
    private static void filterStudentsByMarks(String filePath, int threshold) {
        int count = 0;

        System.out.println("=== Students with Marks > " + threshold + " ===");
        System.out.println("----------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                if (isHeader) {
                    System.out.println("Header: " + line);
                    System.out.println("----------------------------------------");
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 4) {
                    System.err.println("Skipping invalid row: " + line);
                    continue;
                }

                try {
                    int marks = Integer.parseInt(data[3].trim());
                    if (marks > threshold) {
                        count++;
                        System.out.printf("ID: %-5s | Name: %-15s | Age: %-5s | Marks: %-5s%n",
                                data[0].trim(), data[1].trim(), data[2].trim(), data[3].trim());
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Skipping row with invalid marks: " + line);
                }
            }

            System.out.println("----------------------------------------");
            System.out.println("Total qualifying students: " + count);

        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
