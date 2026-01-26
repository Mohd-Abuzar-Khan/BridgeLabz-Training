package com.csv.writecsvfile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// Creates a CSV file and writes employee records to it
public class WriteCSVFile {

    public static void main(String[] args) {
        String csvFile = "src/com/csv/writecsvfile/employees.csv";

        // Employee records as strings
        List<String[]> employees = List.of(
            new String[]{"1", "Abuzar Khan", "IT", "75000"},
            new String[]{"2", "Jane Smith", "HR", "65000"},
            new String[]{"3", "Bob Johnson", "IT", "80000"},
            new String[]{"4", "Alice Brown", "Finance", "70000"},
            new String[]{"5", "Charlie Wilson", "IT", "85000"},
            new String[]{"6", "Diana Prince", "HR", "68000"},
            new String[]{"7", "Edward Norton", "Finance", "72000"}
        );

        writeCSV(csvFile, employees);
    }

    // Writes the CSV file with header and records
    private static void writeCSV(String filePath, List<String[]> records) {
        try (FileWriter writer = new FileWriter(filePath)) {
            // Header
            writer.append("ID,Name,Department,Salary\n");

            // Write each record
            for (String[] record : records) {
                writer.append(String.join(",", record)).append("\n");
            }

            writer.flush();
            System.out.println("CSV file created successfully: " + filePath);
            System.out.println("Written " + records.size() + " employee records to the file.");
        } catch (IOException e) {
            System.err.println("Error writing CSV file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
