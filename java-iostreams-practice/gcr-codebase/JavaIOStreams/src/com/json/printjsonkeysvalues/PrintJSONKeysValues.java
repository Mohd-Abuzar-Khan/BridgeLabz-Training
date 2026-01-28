package com.json.printjsonkeysvalues;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Reads a JSON file and prints all keys and values
public class PrintJSONKeysValues {

    public static void main(String[] args) {
        String jsonFilePath = "src/com/json/printjsonkeysvalues/data.json";

        try {
            // Read JSON content from file
            String jsonContent = Files.readString(Paths.get(jsonFilePath)).trim();

            System.out.println("=== All Keys and Values ===");

            // Parse JSON as array or object
            if (jsonContent.startsWith("[")) {
                JSONArray array = new JSONArray(jsonContent);
                printValue(array, "$");
            } else {
                JSONObject object = new JSONObject(jsonContent);
                printValue(object, "$");
            }

            System.out.println("----------------------------------------");

        } catch (IOException e) {
            System.err.println("Failed to read JSON file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid JSON format: " + e.getMessage());
        }
    }

    // Prints objects and arrays using path notation
    private static void printValue(Object value, String path) {

        if (value instanceof JSONObject) {
            JSONObject object = (JSONObject) value;

            for (String key : object.keySet()) {
                printValue(object.get(key), path + "." + key);
            }
            return;
        }

        if (value instanceof JSONArray) {
            JSONArray array = (JSONArray) value;

            for (int i = 0; i < array.length(); i++) {
                printValue(array.get(i), path + "[" + i + "]");
            }
            return;
        }

        // Print primitive values
        System.out.println("Key: " + path + " | Value: " + value);
    }
}
