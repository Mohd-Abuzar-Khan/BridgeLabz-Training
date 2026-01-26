package com.csv.jsoncsvconverter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Converts between JSON and CSV formats
public class JSONCSVConverter {
    
    // Converts JSON file to CSV format
    public static void jsonToCSV(String jsonFile, String csvFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile));
             FileWriter writer = new FileWriter(csvFile)) {
            
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }
            
            String json = jsonContent.toString().trim();
            
            // Remove array brackets for parsing
            if (json.startsWith("[") && json.endsWith("]")) {
                json = json.substring(1, json.length() - 1).trim();
            }
            
            // Write CSV header row
            writer.append("ID,Name,Age,Marks\n");
            
            // Parse and convert JSON objects
            String[] objects = json.split("\\},\\s*\\{");
            for (int i = 0; i < objects.length; i++) {
                String obj = objects[i];
                obj = obj.replaceAll("[{}\"\\[\\]]", "");
                
                String[] fields = obj.split(",");
                String id = "", name = "", age = "", marks = "";
                
                for (String field : fields) {
                    String[] keyValue = field.split(":");
                    if (keyValue.length == 2) {
                        String key = keyValue[0].trim();
                        String value = keyValue[1].trim();
                        
                        if (key.equals("id")) id = value;
                        else if (key.equals("name")) name = value;
                        else if (key.equals("age")) age = value;
                        else if (key.equals("marks")) marks = value;
                    }
                }
                
                writer.append(id).append(",").append(name).append(",")
                      .append(age).append(",").append(marks).append("\n");
            }
            
            writer.flush();
            System.out.println("JSON converted to CSV: " + csvFile);
        } catch (IOException e) {
            System.err.println("Error converting JSON to CSV: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    // Converts CSV file to JSON format
    public static void csvToJSON(String csvFile, String jsonFile) {
        List<String[]> records = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            boolean isFirstLine = true;
            
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    // Skip the header row
                    isFirstLine = false;
                    continue;
                }
                
                // Parse CSV row and store as array
                String[] data = line.split(",");
                if (data.length == 4) {
                    records.add(new String[]{
                        data[0].trim(),
                        data[1].trim(),
                        data[2].trim(),
                        data[3].trim()
                    });
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
            e.printStackTrace();
            return;
        }
        
        // Write JSON array format
        try (FileWriter writer = new FileWriter(jsonFile)) {
            writer.append("[\n");
            
            // Convert each record to JSON object
            for (int i = 0; i < records.size(); i++) {
                String[] record = records.get(i);
                writer.append("  {\n");
                writer.append("    \"id\": ").append(record[0]).append(",\n");
                writer.append("    \"name\": \"").append(record[1]).append("\",\n");
                writer.append("    \"age\": ").append(record[2]).append(",\n");
                writer.append("    \"marks\": ").append(record[3]);
                if (i < records.size() - 1) {
                    writer.append("\n  },\n");
                } else {
                    writer.append("\n  }\n");
                }
            }
            
            writer.append("]");
            writer.flush();
            System.out.println("CSV converted to JSON: " + jsonFile);
        } catch (IOException e) {
            System.err.println("Error writing JSON file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        String jsonFile = "src/com/csv/jsoncsvconverter/students.json";
        String csvFile = "src/com/csv/jsoncsvconverter/students_from_json.csv";
        String jsonOutputFile = "src/com/csv/jsoncsvconverter/students_from_csv.json";
        
        System.out.println("=== JSON to CSV Conversion ===");
        jsonToCSV(jsonFile, csvFile);
        
        System.out.println("\n=== CSV to JSON Conversion ===");
        csvToJSON(csvFile, jsonOutputFile);
    }
}
