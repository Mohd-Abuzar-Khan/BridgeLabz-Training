package com.json.createstudentjson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

// Creates a JSON file that stores student data
public class CreateStudentJSON {

    public static void main(String[] args) {
        String jsonFilePath = "src/com/json/createstudentjson/student.json";

        try {
            // Create a JSON array to store subjects
            JSONArray subjects = new JSONArray();
            subjects.put("Mathematics");
            subjects.put("Physics");
            subjects.put("Chemistry");
            subjects.put("Computer Science");

            // Create a JSON object for the student
            JSONObject student = new JSONObject();
            student.put("name", "Abuzar Khan");
            student.put("age", 20);
            student.put("subjects", subjects);

            // Write the JSON object to a file with indentation
            try (FileWriter writer = new FileWriter(jsonFilePath)) {
                writer.write(student.toString(2));
            }

            // Print confirmation and JSON content
            System.out.println("Student JSON file created: " + jsonFilePath);
            System.out.println("\nJSON Content:");
            System.out.println(student.toString(2));

        } catch (IOException e) {
            System.err.println("Failed to create JSON file: " + e.getMessage());
        }
    }
}
