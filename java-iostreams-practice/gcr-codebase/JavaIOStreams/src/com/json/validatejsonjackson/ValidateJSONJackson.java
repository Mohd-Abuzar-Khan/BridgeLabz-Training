package com.json.validatejsonjackson;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

// Validates JSON structure and required fields
public class ValidateJSONJackson {

    public static void main(String[] args) {
        String filePath = "src/com/json/validatejsonjackson/data.json";

        try {
            // Read JSON content from file
            String json = readFile(filePath).trim();

            System.out.println("=== JSON Validation ===");
            System.out.println("----------------------------------------");

            // Attempt to parse JSON
            JSONObject obj = new JSONObject(json);
            System.out.println("✓ JSON structure is valid");
            System.out.println("----------------------------------------");

            // Check for required fields
            validateRequiredFields(obj);

        } catch (IOException e) {
            System.err.println("Failed to read JSON file: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("✗ JSON structure is invalid");
            System.out.println("----------------------------------------");
            System.err.println("Reason: " + e.getMessage());
        }
    }

    // Reads file content as UTF-8 text
    private static String readFile(String path) throws IOException {
        byte[] data = Files.readAllBytes(Paths.get(path));
        return new String(data, StandardCharsets.UTF_8);
    }

    // Validates required fields in the JSON object
    private static void validateRequiredFields(JSONObject obj) {
        String[] requiredFields = {"name", "age", "email"};

        System.out.println("\n=== Required Fields Check ===");
        for (String field : requiredFields) {
            boolean present = obj.has(field);
            System.out.println(" Field '" + field + "' " + (present ? "is present" : "is missing"));
        }
    }
}
