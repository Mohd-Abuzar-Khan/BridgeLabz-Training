package com.json.createstudentjson;

import java.io.FileWriter;
import java.io.IOException;

public class CreateStudentJSON {
    public static void main(String[] args) {
        String jsonFile = "src/com/json/createstudentjson/student.json";

        try (FileWriter writer = new FileWriter(jsonFile)) {

            // Write JSON object to file
            writer.write("{\n");
            writer.write("  \"name\": \"Abuzar Khan\",\n");
            writer.write("  \"age\": 20,\n");
            writer.write("  \"subjects\": [\n");
            writer.write("    \"Mathematics\",\n");
            writer.write("    \"Physics\",\n");
            writer.write("    \"Chemistry\",\n");
            writer.write("    \"Computer Science\"\n");
            writer.write("  ]\n");
            writer.write("}\n");

            writer.flush();
            System.out.println("Student JSON object created successfully: " + jsonFile);

            // Print JSON to console
            System.out.println("\nJSON Content:");
            System.out.println("{\"name\": \"John Doe\", \"age\": 20, \"subjects\": [\"Mathematics\", \"Physics\", \"Chemistry\", \"Computer Science\"]}");

        } catch (IOException e) {
            System.err.println("Error creating JSON file: " + e.getMessage());
        }
    }
}
