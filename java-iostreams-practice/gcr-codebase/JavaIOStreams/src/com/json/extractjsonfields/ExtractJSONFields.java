package com.json.extractjsonfields;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Reads a JSON file and prints selected fields
public class ExtractJSONFields {

    public static void main(String[] args) {
        String jsonFilePath = "src/com/json/extractjsonfields/data.json";

        try {
            // Read the JSON file as a string
            String jsonContent = Files.readString(Paths.get(jsonFilePath));

            // Convert the string into a JSONObject
            JSONObject jsonObject = new JSONObject(jsonContent);

            System.out.println("=== Extracted Fields ===");
            System.out.println("----------------------------------------");

            // Read fields safely using opt methods
            System.out.println("Name: " + jsonObject.optString("name", "N/A"));
            System.out.println("Email: " + jsonObject.optString("email", "N/A"));

            if (jsonObject.has("age")) {
                System.out.println("Age: " + jsonObject.optInt("age"));
            } else {
                System.out.println("Age: N/A");
            }

            System.out.println("----------------------------------------");

        } catch (IOException e) {
            System.err.println("Failed to read JSON file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid JSON format: " + e.getMessage());
        }
    }
}
