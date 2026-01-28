package com.json.jsonfromdatabase;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Generates a JSON report from database records or mock data
public class GenerateJSONFromDatabase {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/testdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        String jsonFilePath = "src/com/json/jsonfromdatabase/employees_report.json";

        System.out.println("=== Generating JSON Report from Database ===");
        System.out.println("Update DB settings and add the JDBC driver if you enable database mode.");

        boolean useDatabase = false; // Set true to fetch data using JDBC

        try {
            // Build employee data
            JSONArray employees = useDatabase
                    ? fetchEmployeesFromDatabase()
                    : createMockEmployees();

            // Write JSON output to file
            Files.writeString(Paths.get(jsonFilePath), employees.toString(2));

            System.out.println("JSON report created: " + jsonFilePath);

            if (!useDatabase) {
                System.out.println("Using mock data. Enable database mode to fetch real records.");
            }

        } catch (IOException e) {
            System.err.println("Failed to write JSON file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Failed to generate JSON report: " + e.getMessage());
        }
    }

    // Creates mock employee data without a database
    private static JSONArray createMockEmployees() {
        JSONArray employees = new JSONArray();

        employees.put(createEmployee(1, "John Doe", "IT", 75000));
        employees.put(createEmployee(2, "Jane Smith", "HR", 65000));
        employees.put(createEmployee(3, "Bob Johnson", "IT", 80000));
        employees.put(createEmployee(4, "Alice Brown", "Finance", 70000));
        employees.put(createEmployee(5, "Charlie Wilson", "IT", 85000));

        return employees;
    }

    // Fetches employee records from the database using JDBC
    private static JSONArray fetchEmployeesFromDatabase() throws Exception {
        JSONArray employees = new JSONArray();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(
                     "SELECT id, name, department, salary FROM employees")) {

            while (resultSet.next()) {
                JSONObject employee = new JSONObject();
                employee.put("id", resultSet.getInt("id"));
                employee.put("name", resultSet.getString("name"));
                employee.put("department", resultSet.getString("department"));
                employee.put("salary", resultSet.getInt("salary"));

                employees.put(employee);
            }
        }

        return employees;
    }

    // Creates a single employee JSON object
    private static JSONObject createEmployee(int id, String name, String department, int salary) {
        JSONObject employee = new JSONObject();
        employee.put("id", id);
        employee.put("name", name);
        employee.put("department", department);
        employee.put("salary", salary);
        return employee;
    }
}
