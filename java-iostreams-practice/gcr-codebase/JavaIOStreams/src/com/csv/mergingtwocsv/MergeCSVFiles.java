package com.csv.mergingtwocsv;

import java.io.*;
import java.util.*;

// Merges two CSV files by ID
public class MergeCSVFiles {

    public static void main(String[] args) {
        String file1 = "src/com/csv/mergingtwocsv/students1.csv";
        String file2 = "src/com/csv/mergingtwocsv/students2.csv";
        String outputFile = "src/com/csv/mergingtwocsv/students_merged.csv";

        Map<String, String[]> studentData = readCSVFile1(file1);
        mergeCSVFile2(file2, studentData);
        writeMergedCSV(outputFile, studentData);
    }

    // Reads first CSV 
    private static Map<String, String[]> readCSVFile1(String filePath) {
        Map<String, String[]> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 3) {
                    System.err.println("Skipping invalid row: " + line);
                    continue;
                }

                String[] studentInfo = new String[5]; // ID, Name, Age, Marks, Grade
                studentInfo[0] = data[0].trim();
                studentInfo[1] = data[1].trim();
                studentInfo[2] = data[2].trim();
                map.put(studentInfo[0], studentInfo);
            }

        } catch (IOException e) {
            System.err.println("Error reading file1: " + e.getMessage());
        }
        return map;
    }

    // Merges second CSV (ID, Marks, Grade)
    private static void mergeCSVFile2(String filePath, Map<String, String[]> studentData) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 3) {
                    System.err.println("Skipping invalid row: " + line);
                    continue;
                }

                String id = data[0].trim();
                if (studentData.containsKey(id)) {
                    String[] info = studentData.get(id);
                    info[3] = data[1].trim(); // Marks
                    info[4] = data[2].trim(); // Grade
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading file2: " + e.getMessage());
        }
    }

    // Writes merged CSV
    private static void writeMergedCSV(String outputFile, Map<String, String[]> studentData) {
        int mergedCount = 0;
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write("ID,Name,Age,Marks,Grade\n");

            for (String[] info : studentData.values()) {
                if (info[3] != null && info[4] != null) {
                    writer.write(String.join(",", info) + "\n");
                    mergedCount++;
                }
            }

            System.out.println("Merged CSV created: " + outputFile);
            System.out.println("Total merged records: " + mergedCount);

        } catch (IOException e) {
            System.err.println("Error writing merged file: " + e.getMessage());
        }
    }
}
