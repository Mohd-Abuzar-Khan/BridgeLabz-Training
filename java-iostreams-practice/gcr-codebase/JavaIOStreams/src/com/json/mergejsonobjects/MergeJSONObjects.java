package com.json.mergejsonobjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Merge two JSON objects into a single JSON object
public class MergeJSONObjects {
    public static void main(String[] args) {
        String jsonFile1 = "src/com/json/mergejsonobjects/object1.json";
        String jsonFile2 = "src/com/json/mergejsonobjects/object2.json";
        String outputFile = "src/com/json/mergejsonobjects/merged.json";
        
        Map<String, String> mergedFields = new HashMap<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile1))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) content.append(line);
            extractFields(content.toString(), mergedFields);
        } catch (IOException e) {
            System.err.println("Error reading first JSON file: " + e.getMessage());
            return;
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile2))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) content.append(line);
            extractFields(content.toString(), mergedFields);
        } catch (IOException e) {
            System.err.println("Error reading second JSON file: " + e.getMessage());
            return;
        }
        
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write("{\n");
            int count = 0;
            for (Map.Entry<String, String> entry : mergedFields.entrySet()) {
                writer.write("  \"" + entry.getKey() + "\": " + entry.getValue());
                writer.write(++count < mergedFields.size() ? ",\n" : "\n");
            }
            writer.write("}\n");
            writer.flush();
            
            System.out.println("Merged JSON created successfully: " + outputFile);
            System.out.println("Total fields: " + mergedFields.size());
        } catch (IOException e) {
            System.err.println("Error writing merged JSON: " + e.getMessage());
        }
    }
    
    // Extract key-value pairs from JSON string
    private static void extractFields(String json, Map<String, String> fields) {
        Pattern stringPattern = Pattern.compile("\"([^\"]+)\"\\s*:\\s*\"([^\"]+)\"");
        Matcher stringMatcher = stringPattern.matcher(json);
        while (stringMatcher.find()) {
            fields.put(stringMatcher.group(1), "\"" + stringMatcher.group(2) + "\"");
        }
        
        Pattern numberPattern = Pattern.compile("\"([^\"]+)\"\\s*:\\s*(\\d+(?:\\.\\d+)?)");
        Matcher numberMatcher = numberPattern.matcher(json);
        while (numberMatcher.find()) {
            fields.put(numberMatcher.group(1), numberMatcher.group(2));
        }
    }
}
