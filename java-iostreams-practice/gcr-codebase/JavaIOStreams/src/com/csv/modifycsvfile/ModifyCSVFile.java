package com.csv.modifycsvfile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Updates salary for employees in a specific department
public class ModifyCSVFile {

    public static void main(String[] args) {
        String inputFile = "src/com/csv/modifycsvfile/employees.csv";
        String outputFile = "src/com/csv/modifycsvfile/employees_updated.csv";
        String targetDepartment = "IT";
        double increasePercent = 10.0;

        List<String> updatedLines = updateSalaries(inputFile, targetDepartment, increasePercent);
        writeCSV(outputFile, updatedLines);
    }

    // Reads CSV, updates salaries for the target department, and returns updated lines
    private static List<String> updateSalaries(String filePath, String departmentTarget, double percent) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                if (isHeader) {
                    lines.add(line);
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 4) {
                    System.err.println("Skipping invalid row: " + line);
                    continue;
                }

                String department = data[2].trim();
                try {
                    double salary = Double.parseDouble(data[3].trim());

                    if (department.equals(departmentTarget)) {
                        double newSalary = salary * (1 + percent / 100);
                        data[3] = String.format("%.2f", newSalary);
                        System.out.println("Updated: " + data[1] + " - Old Salary: " + salary + ", New Salary: " + newSalary);
                        line = String.join(",", data);
                    }

                } catch (NumberFormatException e) {
                    System.err.println("Skipping row with invalid salary: " + line);
                }

                lines.add(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading CSV: " + e.getMessage());
        }

        return lines;
    }

    // Writes updated CSV lines to a file
    private static void writeCSV(String outputFile, List<String> lines) {
        try (FileWriter writer = new FileWriter(outputFile)) {
            for (String line : lines) {
                writer.write(line + "\n");
            }
            System.out.println("\nUpdated CSV saved to: " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing CSV: " + e.getMessage());
        }
    }
}
