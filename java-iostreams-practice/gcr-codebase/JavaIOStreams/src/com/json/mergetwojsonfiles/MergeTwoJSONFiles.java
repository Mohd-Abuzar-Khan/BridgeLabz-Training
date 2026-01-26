package com.json.mergetwojsonfiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Merge two JSON files into a single JSON object
public class MergeTwoJSONFiles {
    public static void main(String[] args) {
        String jsonFile1 = "src/com/json/mergetwojsonfiles/file1.json";
        String jsonFile2 = "src/com/json/mergetwojsonfiles/file2.json";
        String outputFile = "src/com/json/mergetwojsonfiles/merged.json";
        
        Map<String, String> mergedFields = new HashMap<>();
        
        readAndExtract(jsonFile1, mergedFields);
        readAndExtract(jsonFile2, mergedFields);
        
        writeMergedJSON(outputFile, mergedFields);
    }
    
    private static void readAndExtract(String filename, Map<String, String> fields) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) content.append(line);
            extractFields(content.toString(), fields);
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + filename);
        }
    }
    
    private static void writeMergedJSON(String filename, Map<String, String> fields) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("{\n");
            int count = 0;
            for (Map.Entry<String, String> entry : fields.entrySet()) {
                writer.write("  \"" + entry.getKey() + "\": " + entry.getValue());
                writer.write(++count < fields.size() ? ",\n" : "\n");
            }
            writer.write("}\n");
            writer.flush();
            
            System.out.println("Merged JSON file created successfully: " + filename);
            System.out.println("Total fields: " + fields.size());
        } catch (IOException e) {
            System.err.println("Error writing merged JSON: " + e.getMessage());
        }
    }
    
    private static void extractFields(String json, Map<String, String> fields) {
        Pattern stringPattern = Pattern.compile("\"([^\"]+)\"\\s*:\\s*\"([^\"]+)\"");
        Matcher stringMatcher = stringPattern.matcher(json);
        while (stringMatcher.find()) fields.put(stringMatcher.group(1), "\"" + stringMatcher.group(2) + "\"");
        
        Pattern numberPattern = Pattern.compile("\"([^\"]+)\"\\s*:\\s*(\\d+(?:\\.\\d+)?)");
        Matcher numberMatcher = numberPattern.matcher(json);
        while (numberMatcher.find()) fields.put(numberMatcher.group(1), numberMatcher.group(2));
        
        Pattern booleanPattern = Pattern.compile("\"([^\"]+)\"\\s*:\\s*(true|false)");
        Matcher booleanMatcher = booleanPattern.matcher(json);
        while (booleanMatcher.find()) fields.put(booleanMatcher.group(1), booleanMatcher.group(2));
    }
}
