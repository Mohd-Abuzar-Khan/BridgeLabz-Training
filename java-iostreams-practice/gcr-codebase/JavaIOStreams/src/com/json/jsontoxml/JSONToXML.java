package com.json.jsontoxml;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Converts a JSON file into an XML file
public class JSONToXML {

    public static void main(String[] args) {
        String jsonFilePath = "src/com/json/jsontoxml/data.json";
        String xmlFilePath = "src/com/json/jsontoxml/output.xml";

        try {
            // Read JSON content from file
            String jsonContent = Files.readString(Paths.get(jsonFilePath)).trim();

            String xmlBody;

            // Handle JSON array by wrapping it in a root object
            if (jsonContent.startsWith("[")) {
                JSONObject wrapper = new JSONObject();
                wrapper.put("items", new JSONArray(jsonContent));
                xmlBody = XML.toString(wrapper);
            } else {
                xmlBody = XML.toString(new JSONObject(jsonContent));
            }

            // Add XML declaration and root element
            String xmlOutput =
                    "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<root>\n" +
                    xmlBody +
                    "\n</root>\n";

            // Write XML to file
            Files.writeString(Paths.get(xmlFilePath), xmlOutput);

            System.out.println("JSON converted to XML: " + xmlFilePath);

        } catch (IOException e) {
            System.err.println("Failed to read or write file: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Invalid JSON format: " + e.getMessage());
        }
    }
}
