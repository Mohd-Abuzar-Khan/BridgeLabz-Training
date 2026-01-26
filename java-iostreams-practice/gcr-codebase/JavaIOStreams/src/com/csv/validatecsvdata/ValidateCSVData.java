package com.csv.validatecsvdata;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

// Validates email and phone number fields in CSV records
public class ValidateCSVData {

    private static final String CSV_FILE_PATH = 
            "src/com/csv/validatecsvdata/data.csv";

    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("^\\d{10}$");

    public static void main(String[] args) {
        validateCSV(CSV_FILE_PATH);
    }

    // Validates CSV data row by row
    private static void validateCSV(String filePath) {
        int rowNumber = 0;
        int invalidCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            System.out.println("=== CSV Data Validation ===");
            System.out.println("----------------------------------------");

            while ((line = reader.readLine()) != null) {
                rowNumber++;
                line = line.trim();
                if (line.isEmpty()) continue;

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 4) continue;

                List<String> errors = validateRow(data);
                if (!errors.isEmpty()) {
                    invalidCount++;
                    printErrors(rowNumber, line, errors);
                }
            }

            System.out.println("\n----------------------------------------");
            System.out.println("Validation complete. Invalid rows: " + invalidCount);

        } catch (IOException e) {
            System.err.println("Failed to read CSV file: " + e.getMessage());
        }
    }

    // Returns list of validation errors for a row
    private static List<String> validateRow(String[] data) {
        List<String> errors = new ArrayList<>();
        String email = data[2].trim();
        String phone = data[3].trim();

        if (!EMAIL_PATTERN.matcher(email).matches()) {
            errors.add("Invalid email format: " + email);
        }
        if (!PHONE_PATTERN.matcher(phone).matches()) {
            errors.add("Invalid phone number (must be 10 digits): " + phone);
        }

        return errors;
    }

    // Prints detailed errors for a CSV row
    private static void printErrors(int rowNumber, String line, List<String> errors) {
        System.out.println("\nRow #" + rowNumber + " - INVALID:");
        System.out.println("  Data: " + line);
        System.out.println("  Errors:");
        errors.forEach(error -> System.out.println("    - " + error));
    }
}
