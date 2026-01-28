package com.json.csvtojson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Reads a CSV file and converts its rows into a JSON array
public class CSVToJSON {

    public static void main(String[] args) {
        String csvFilePath = "src/com/json/csvtojson/data.csv";
        String jsonFilePath = "src/com/json/csvtojson/output.json";

        List<String[]> records = new ArrayList<>();
        String[] headers = null;

        // Read the CSV file
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            boolean isHeaderRow = true;

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");

                if (isHeaderRow) {
                    headers = values;
                    isHeaderRow = false;
                    continue;
                }

                if (values.length == headers.length) {
                    records.add(values);
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to read CSV file: " + e.getMessage());
            return;
        }

        // Convert CSV data to JSON
        JSONArray jsonArray = new JSONArray();

        for (String[] record : records) {
            JSONObject jsonObject = new JSONObject();

            for (int i = 0; i < headers.length; i++) {
                String key = headers[i].trim();
                String value = record[i].trim();

                jsonObject.put(key, parseValue(value));
            }

            jsonArray.put(jsonObject);
        }

        // Write JSON output to file
        try (FileWriter writer = new FileWriter(jsonFilePath)) {
            writer.write(jsonArray.toString(2));
        } catch (IOException e) {
            System.err.println("Failed to write JSON file: " + e.getMessage());
            return;
        }

        // Print result
        System.out.println("CSV converted to JSON: " + jsonFilePath);
        System.out.println("Records processed: " + records.size());
    }

    // Parses a value as Integer, Double, or String
    private static Object parseValue(String value) {
        if (value == null || value.isEmpty()) {
            return "";
        }

        try {
            if (!value.contains(".")) {
                return Integer.parseInt(value);
            }
        } catch (NumberFormatException ignored) {
        }

        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException ignored) {
        }

        return value;
    }
}
