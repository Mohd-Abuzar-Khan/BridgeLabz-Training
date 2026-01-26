package com.json.jsontoxml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Convert JSON file to XML file
public class JSONToXML {
    public static void main(String[] args) {
        String jsonFile = "src/com/json/jsontoxml/data.json";
        String xmlFile = "src/com/json/jsontoxml/output.xml";
        
        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile));
             FileWriter writer = new FileWriter(xmlFile)) {
            
            StringBuilder jsonContent = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) jsonContent.append(line);
            
            String json = jsonContent.toString().trim();
            
            writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<root>\n");
            
            convertJSONToXML(json, writer, 1);
            
            writer.write("</root>\n");
            writer.flush();
            
            System.out.println("JSON converted to XML successfully: " + xmlFile);
        } catch (IOException e) {
            System.err.println("Error converting JSON to XML: " + e.getMessage());
        }
    }
    
    private static void convertJSONToXML(String json, FileWriter writer, int indent) throws IOException {
        String indentStr = "  ".repeat(indent);
        
        Pattern stringPattern = Pattern.compile("\"([^\"]+)\"\\s*:\\s*\"([^\"]+)\"");
        Matcher stringMatcher = stringPattern.matcher(json);
        while (stringMatcher.find()) writer.write(indentStr + "<" + stringMatcher.group(1) + ">" + escapeXML(stringMatcher.group(2)) + "</" + stringMatcher.group(1) + ">\n");
        
        Pattern numberPattern = Pattern.compile("\"([^\"]+)\"\\s*:\\s*(\\d+(?:\\.\\d+)?)");
        Matcher numberMatcher = numberPattern.matcher(json);
        while (numberMatcher.find()) writer.write(indentStr + "<" + numberMatcher.group(1) + ">" + numberMatcher.group(2) + "</" + numberMatcher.group(1) + ">\n");
        
        Pattern booleanPattern = Pattern.compile("\"([^\"]+)\"\\s*:\\s*(true|false)");
        Matcher booleanMatcher = booleanPattern.matcher(json);
        while (booleanMatcher.find()) writer.write(indentStr + "<" + booleanMatcher.group(1) + ">" + booleanMatcher.group(2) + "</" + booleanMatcher.group(1) + ">\n");
    }
    
    private static String escapeXML(String value) {
        return value.replace("&", "&amp;")
                    .replace("<", "&lt;")
                    .replace(">", "&gt;")
                    .replace("\"", "&quot;")
                    .replace("'", "&apos;");
    }
}
