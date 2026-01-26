package com.csv.detectduplicates;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

// Detects duplicate records in CSV based on ID column
public class DetectDuplicates {

    public static void main(String[] args) {
        String csvFile = "src/com/csv/detectduplicates/data.csv";
        Map<String, List<String>> idMap = readCSV(csvFile);
        printDuplicates(idMap);
    }

    // Reads CSV and groups lines by ID
    private static Map<String, List<String>> readCSV(String filePath) {
        Map<String, List<String>> idMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue; // skip empty lines

                if (isHeader) {
                    isHeader = false; // skip header for ID mapping
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length == 0) continue;

                String id = parts[0].trim();
                idMap.putIfAbsent(id, new ArrayList<>());
                idMap.get(id).add(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading CSV: " + e.getMessage());
        }
        return idMap;
    }

    // Prints duplicates from the ID map
    private static void printDuplicates(Map<String, List<String>> idMap) {
        System.out.println("=== Duplicate Detection ===");
        System.out.println("----------------------------------------");

        boolean found = false;
        for (Map.Entry<String, List<String>> entry : idMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                found = true;
                System.out.println("\nDuplicate ID: " + entry.getKey());
                System.out.println("Occurrences: " + entry.getValue().size());
                System.out.println("Records:");
                entry.getValue().forEach(record -> System.out.println("  - " + record));
            }
        }

        if (!found) {
            System.out.println("No duplicate IDs found.");
        }

        System.out.println("----------------------------------------");
    }
}
