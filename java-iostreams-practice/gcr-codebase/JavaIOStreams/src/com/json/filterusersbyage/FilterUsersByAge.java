package com.json.filterusersbyage;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Filters and prints users older than a given age
public class FilterUsersByAge {

    public static void main(String[] args) {
        String jsonFilePath = "src/com/json/filterusersbyage/users.json";
        int ageThreshold = 25;

        try {
            // Read the JSON file as text
            String jsonContent = Files.readString(Paths.get(jsonFilePath));

            // Parse the text into a JSON array
            JSONArray users = new JSONArray(jsonContent);

            System.out.println("=== Users Older Than " + ageThreshold + " Years ===");
            System.out.println("----------------------------------------");

            int matchCount = 0;

            for (int i = 0; i < users.length(); i++) {
                JSONObject user = users.getJSONObject(i);

                // Read age safely
                int age = user.optInt("age", 0);

                if (age > ageThreshold) {
                    matchCount++;
                    System.out.println("\nUser #" + matchCount + ":");

                    // Print basic fields
                    System.out.println("  Name: " + user.optString("name", "N/A"));
                    System.out.println("  Age: " + age);
                    System.out.println("  Email: " + user.optString("email", "N/A"));

                    // Print nested address city if present
                    JSONObject address = user.optJSONObject("address");
                    if (address != null) {
                        System.out.println("  City: " + address.optString("city", "N/A"));
                    }
                }
            }

            System.out.println("\n----------------------------------------");
            System.out.println("Total users older than " + ageThreshold + ": " + matchCount);

        } catch (IOException e) {
            System.err.println("Failed to read JSON file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid JSON format: " + e.getMessage());
        }
    }
}
