package com.json.filterjsonbyage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterJSONByAge {
    public static void main(String[] args) {
        String jsonFile = "src/com/json/filterjsonbyage/data.json";
        int ageThreshold = 25;

        // Read JSON file and display records where age > threshold
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) jsonContent.append(line);

            String json = jsonContent.toString();
            System.out.println("=== Filtered Records (Age > " + ageThreshold + ") ===");
            System.out.println("----------------------------------------");

            List<String> records = extractRecords(json);
            int count = 0;
            for (String record : records) {
                int age = extractAge(record);
                if (age > ageThreshold) {
                    count++;
                    System.out.println("\nRecord #" + count + ":");
                    printRecord(record);
                }
            }

            System.out.println("\n----------------------------------------");
            System.out.println("Total records with age > " + ageThreshold + ": " + count);
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
        }
    }

    private static List<String> extractRecords(String json) {
        List<String> records = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\{[^}]*\\}").matcher(json);
        while (matcher.find()) records.add(matcher.group());
        return records;
    }

    private static int extractAge(String record) {
        Matcher matcher = Pattern.compile("\"age\"\\s*:\\s*(\\d+)").matcher(record);
        if (matcher.find()) return Integer.parseInt(matcher.group(1));
        return 0;
    }

    private static void printRecord(String record) {
        Matcher nameMatcher = Pattern.compile("\"name\"\\s*:\\s*\"([^\"]+)\"").matcher(record);
        Matcher ageMatcher = Pattern.compile("\"age\"\\s*:\\s*(\\d+)").matcher(record);
        Matcher emailMatcher = Pattern.compile("\"email\"\\s*:\\s*\"([^\"]+)\"").matcher(record);

        if (nameMatcher.find()) System.out.println("  Name: " + nameMatcher.group(1));
        if (ageMatcher.find()) System.out.println("  Age: " + ageMatcher.group(1));
        if (emailMatcher.find()) System.out.println("  Email: " + emailMatcher.group(1));
    }
}
