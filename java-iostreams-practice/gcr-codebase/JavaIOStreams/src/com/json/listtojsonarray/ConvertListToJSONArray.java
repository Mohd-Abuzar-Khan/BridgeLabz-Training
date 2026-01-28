package com.json.listtojsonarray;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Converts a list of Student objects into a JSON array
public class ConvertListToJSONArray {

    public static void main(String[] args) {
        String jsonFilePath = "src/com/json/listtojsonarray/students.json";

        // Create sample student data
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe", 20, 85.5));
        students.add(new Student("Jane Smith", 21, 92.0));
        students.add(new Student("Bob Johnson", 19, 78.5));
        students.add(new Student("Alice Brown", 22, 88.0));

        try {
            // Build a JSON array from the student list
            JSONArray studentsArray = new JSONArray();

            for (Student student : students) {
                JSONObject studentJson = new JSONObject();
                studentJson.put("name", student.getName());
                studentJson.put("age", student.getAge());
                studentJson.put("marks", student.getMarks());

                studentsArray.put(studentJson);
            }

            // Write JSON output to file
            Files.writeString(Paths.get(jsonFilePath), studentsArray.toString(2));

            System.out.println("Student list converted to JSON: " + jsonFilePath);
            System.out.println("Total students: " + students.size());

        } catch (IOException e) {
            System.err.println("Failed to write JSON file: " + e.getMessage());
        }
    }
}
