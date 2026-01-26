package com.json.extractjsonfields;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractJSONFields {
    public static void main(String[] args) {
        String jsonFile = "src/com/json/extractjsonfields/data.json";

        // Read JSON file and extract specific fields using regex
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }

            String json = jsonContent.toString();

            System.out.println("=== Extracted Fields ===");
            System.out.println("----------------------------------------");

            Matcher nameMatcher = Pattern.compile("\"name\"\\s*:\\s*\"([^\"]+)\"").matcher(json);
            if (nameMatcher.find()) System.out.println("Name: " + nameMatcher.group(1));

            Matcher emailMatcher = Pattern.compile("\"email\"\\s*:\\s*\"([^\"]+)\"").matcher(json);
            if (emailMatcher.find()) System.out.println("Email: " + emailMatcher.group(1));

            Matcher ageMatcher = Pattern.compile("\"age\"\\s*:\\s*(\\d+)").matcher(json);
            if (ageMatcher.find()) System.out.println("Age: " + ageMatcher.group(1));

            System.out.println("----------------------------------------");
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
        }
    }
}
