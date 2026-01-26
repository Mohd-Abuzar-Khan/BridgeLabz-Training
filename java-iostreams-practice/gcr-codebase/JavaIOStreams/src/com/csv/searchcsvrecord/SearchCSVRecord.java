package com.csv.searchcsvrecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchCSVRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = scanner.nextLine().trim();
        scanner.close();

        String csvFile = "src/com/csv/searchcsvrecord/employees.csv";
        searchEmployee(csvFile, searchName);
    }

    // Searches for employees by name in CSV
    private static void searchEmployee(String filePath, String searchName) {
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 4) continue;

                if (data[1].trim().equalsIgnoreCase(searchName)) {
                    printEmployee(data);
                    found = true;
                    break; // remove this if you want all matches
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Employee '" + searchName + "' not found.");
        }
    }

    // Prints a single employee record
    private static void printEmployee(String[] data) {
        System.out.println("\n=== Employee Found ===");
        System.out.printf("ID: %-5s | Name: %-15s | Department: %-10s | Salary: %-10s%n",
                data[0].trim(), data[1].trim(), data[2].trim(), data[3].trim());
    }
}
