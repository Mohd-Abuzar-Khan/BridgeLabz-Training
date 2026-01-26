package com.csv.csvfromdatabase;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateCSVFromDatabase {

    // Generates a CSV file from database records (template with mock data)
    private static final String CSV_FILE_PATH =
            "src/com/csv/csvfromdatabase/employees_report.csv";

    @SuppressWarnings("unused")
    private static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter(CSV_FILE_PATH)) {
            writeHeader(writer);
            writeMockData(writer);
            writer.flush();
            System.out.println("CSV report generated: " + CSV_FILE_PATH);
        } catch (IOException e) {
            System.err.println("Failed to write CSV file: " + e.getMessage());
        }
    }

    private static void writeHeader(FileWriter writer) throws IOException {
        writer.append("Employee ID,Name,Department,Salary\n");
    }

    private static void writeMockData(FileWriter writer) throws IOException {
        writer.append("1,Abuzar Khan,IT,75000\n");
        writer.append("2,Jane Smith,HR,65000\n");
        writer.append("3,Bob Johnson,IT,80000\n");
        writer.append("4,Alice Brown,Finance,70000\n");
        writer.append("5,Charlie Wilson,IT,85000\n");
    }

   
}
