package com.json.validatejsonjackson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Validate JSON structure and required fields
public class ValidateJSONJackson {
    public static void main(String[] args) {
        String jsonFile = "src/com/json/validatejsonjackson/data.json";
        
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) jsonContent.append(line);
            
            String json = jsonContent.toString().trim();
            
            System.out.println("=== JSON Validation ===");
            System.out.println("----------------------------------------");
            
            boolean isValid = validateJSON(json);
            System.out.println(isValid ? "✓ JSON structure is valid" : "✗ JSON structure is invalid");
            System.out.println("----------------------------------------");
            
            if (isValid) validateRequiredFields(json);
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
        }
    }
    
    private static boolean validateJSON(String json) {
        if (json == null || json.isEmpty()) return false;
        if (!json.startsWith("{") || !json.endsWith("}")) return false;
        
        int braceCount = 0;
        boolean inString = false;
        for (char c : json.toCharArray()) {
            if (c == '"' && (braceCount == 0 || json.charAt(json.indexOf(c) - 1) != '\\')) inString = !inString;
            else if (!inString) {
                if (c == '{') braceCount++;
                else if (c == '}') braceCount--;
                if (braceCount < 0) return false;
            }
        }
        return braceCount == 0;
    }
    
    private static void validateRequiredFields(String json) {
        String[] requiredFields = {"name", "age", "email"};
        System.out.println("\n=== Required Fields Check ===");
        for (String field : requiredFields) {
            System.out.println(" Field '" + field + "' " + (json.contains("\"" + field + "\"") ? "is present" : "is missing"));
        }
    }
}
