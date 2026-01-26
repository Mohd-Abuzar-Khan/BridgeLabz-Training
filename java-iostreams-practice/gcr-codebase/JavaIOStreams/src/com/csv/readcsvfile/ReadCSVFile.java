package com.csv.readcsvfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Reads a CSV file and prints each record
public class ReadCSVFile {

    public static void main(String[] args) {
        String csvFile = "src/com/csv/readcsvfile/students.csv";
        readAndPrintCSV(csvFile);
    }

    // Reads a CSV and prints records in a structured format
    private static void readAndPrintCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            System.out.println("=== Student Details ===");
            System.out.println("----------------------------------------");

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

                String id = data[0].trim();
                String name = data[1].trim();
                String age = data[2].trim();
                String marks = data[3].trim();

                System.out.printf("ID: %-5s | Name: %-15s | Age: %-5s | Marks: %-5s%n",
                        id, name, age, marks);
            }

            System.out.println("----------------------------------------");

        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }
    }
}
