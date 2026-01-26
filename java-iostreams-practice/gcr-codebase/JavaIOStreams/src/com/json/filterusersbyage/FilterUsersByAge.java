package com.json.filterusersbyage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Filters and prints users older than the age threshold
public class FilterUsersByAge {
    public static void main(String[] args) {
        String jsonFile = "src/com/json/filterusersbyage/users.json";
        int ageThreshold = 25;
        
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;
            
            while ((line = br.readLine()) != null) {
                jsonContent.append(line);
            }
            
            String json = jsonContent.toString();
            
            System.out.println("=== Users Older Than " + ageThreshold + " Years ===");
            System.out.println("----------------------------------------");
            
            List<String> users = extractUsers(json);
            int count = 0;
            
            for (String user : users) {
                int age = extractAge(user);
                if (age > ageThreshold) {
                    count++;
                    System.out.println("\nUser #" + count + ":");
                    printUser(user);
                }
            }
            
            System.out.println("\n----------------------------------------");
            System.out.println("Total users older than " + ageThreshold + ": " + count);
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private static List<String> extractUsers(String json) {
        List<String> users = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\{[^}]*\"age\"[^}]*\\}");
        Matcher matcher = pattern.matcher(json);
        
        while (matcher.find()) {
            users.add(matcher.group());
        }
        
        return users;
    }
    
    private static int extractAge(String user) {
        Pattern agePattern = Pattern.compile("\"age\"\\s*:\\s*(\\d+)");
        Matcher matcher = agePattern.matcher(user);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 0;
    }
    
    private static void printUser(String user) {
        Pattern namePattern = Pattern.compile("\"name\"\\s*:\\s*\"([^\"]+)\"");
        Pattern agePattern = Pattern.compile("\"age\"\\s*:\\s*(\\d+)");
        Pattern emailPattern = Pattern.compile("\"email\"\\s*:\\s*\"([^\"]+)\"");
        Pattern cityPattern = Pattern.compile("\"city\"\\s*:\\s*\"([^\"]+)\"");
        
        Matcher nameMatcher = namePattern.matcher(user);
        Matcher ageMatcher = agePattern.matcher(user);
        Matcher emailMatcher = emailPattern.matcher(user);
        Matcher cityMatcher = cityPattern.matcher(user);
        
        if (nameMatcher.find()) {
            System.out.println("  Name: " + nameMatcher.group(1));
        }
        if (ageMatcher.find()) {
            System.out.println("  Age: " + ageMatcher.group(1));
        }
        if (emailMatcher.find()) {
            System.out.println("  Email: " + emailMatcher.group(1));
        }
        if (cityMatcher.find()) {
            System.out.println("  City: " + cityMatcher.group(1));
        }
    }
}
