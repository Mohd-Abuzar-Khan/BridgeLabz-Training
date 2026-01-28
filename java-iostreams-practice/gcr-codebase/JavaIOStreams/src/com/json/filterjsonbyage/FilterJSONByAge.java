package com.json.filterjsonbyage;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Filters users from a JSON array based on age
public class FilterJSONByAge {

    public static void main(String[] args) {
        String jsonFilePath = "src/com/json/filterjsonbyage/data.json";
        int ageThreshold = 25;

        try {
            // Read the JSON file as text
            String jsonContent = Files.readString(Paths.get(jsonFilePath));

            // Parse the text into a JSON array
            JSONArray users = new JSONArray(jsonContent);

            System.out.println("=== Filtered Records (Age > " + ageThreshold + ") ===");
            System.out.println("----------------------------------------");

            int matchCount = 0;

            for (int i = 0; i < users.length(); i++) {
                JSONObject user = users.getJSONObject(i);

                // Read age safely
                int age = user.optInt("age", 0);

                if (age > ageThreshold) {
                    matchCount++;

                    System.out.println("\nRecord #" + matchCount + ":");
                    System.out.println("  Name: " + user.optString("name", "N/A"));
                    System.out.println("  Age: " + age);
                    System.out.println("  Email: " + user.optString("email", "N/A"));
                }
            }

            System.out.println("\n----------------------------------------");
            System.out.println("Total records with age > " + ageThreshold + ": " + matchCount);

        } catch (IOException e) {
            System.err.println("Failed to read JSON file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid JSON format: " + e.getMessage());
        }
    }
}
