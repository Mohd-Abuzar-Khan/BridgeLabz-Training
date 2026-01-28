package com.json.mergetwojsonfiles;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Merges two JSON files into a single JSON object
public class MergeTwoJSONFiles {

    public static void main(String[] args) {
        String jsonFilePath1 = "src/com/json/mergetwojsonfiles/file1.json";
        String jsonFilePath2 = "src/com/json/mergetwojsonfiles/file2.json";
        String outputFilePath = "src/com/json/mergetwojsonfiles/merged.json";

        try {
            // Read and parse the first JSON file
            String jsonContent1 = Files.readString(Paths.get(jsonFilePath1));
            JSONObject object1 = new JSONObject(jsonContent1);

            // Read and parse the second JSON file
            String jsonContent2 = Files.readString(Paths.get(jsonFilePath2));
            JSONObject object2 = new JSONObject(jsonContent2);

            // Copy the first object
            JSONObject merged = new JSONObject(object1.toString());

            // Add fields from the second object
            for (String key : object2.keySet()) {
                merged.put(key, object2.get(key));
            }

            // Write merged JSON to file
            Files.writeString(Paths.get(outputFilePath), merged.toString(2));

            System.out.println("Merged JSON file created: " + outputFilePath);
            System.out.println("Total fields: " + merged.length());

        } catch (IOException e) {
            System.err.println("Failed to read or write JSON files: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid JSON format: " + e.getMessage());
        }
    }
}
