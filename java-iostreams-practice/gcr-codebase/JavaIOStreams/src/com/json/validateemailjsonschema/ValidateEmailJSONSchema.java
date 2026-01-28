package com.json.validateemailjsonschema;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

// Reads a JSON file and validates all fields named "email".
public class ValidateEmailJSONSchema {

    // Pattern used to validate email format.
    private static final Pattern EMAIL_PATTERN =
        Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public static void main(String[] args) {
        String filePath = "src/com/json/validateemailjsonschema/data.json";

        try {
            // Read JSON content from file.
            String json = readFile(filePath).trim();

            System.out.println("=== Email Validation ===");
            System.out.println("----------------------------------------");

            // Parse JSON based on root type.
            if (json.startsWith("[")) {
                validateEmails(new JSONArray(json));
            } else {
                validateEmails(new JSONObject(json));
            }

            System.out.println("----------------------------------------");

        } catch (IOException e) {
            System.err.println("Failed to read JSON file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid JSON format: " + e.getMessage());
        }
    }

    // Reads file content as UTF-8 text.
    private static String readFile(String path) throws IOException {
        byte[] data = Files.readAllBytes(Paths.get(path));
        return new String(data, StandardCharsets.UTF_8);
    }

    // Starts email validation and tracks matches.
    private static void validateEmails(Object jsonData) {
        int[] emailCount = {0};
        traverse(jsonData, "$", emailCount);

        if (emailCount[0] == 0) {
            System.out.println("No email field found in JSON");
        }
    }

    // Traverses JSON objects and arrays.
    private static void traverse(Object current, String path, int[] emailCount) {

        if (current instanceof JSONObject) {
            JSONObject object = (JSONObject) current;

            for (String key : object.keySet()) {
                Object value = object.get(key);
                String currentPath = path + "." + key;

                // Validate fields named "email".
                if ("email".equalsIgnoreCase(key)) {
                    emailCount[0]++;
                    String email = String.valueOf(value);
                    boolean valid = EMAIL_PATTERN.matcher(email).matches();

                    System.out.println("Key: " + currentPath);
                    System.out.println("Email: " + email);
                    System.out.println("Status: " + (valid ? "Valid" : "Invalid"));
                    System.out.println();
                }

                traverse(value, currentPath, emailCount);
            }
            return;
        }

        if (current instanceof JSONArray) {
            JSONArray array = (JSONArray) current;

            for (int i = 0; i < array.length(); i++) {
                traverse(array.get(i), path + "[" + i + "]", emailCount);
            }
        }
    }
}
