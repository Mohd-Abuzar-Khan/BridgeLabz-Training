package com.json.listtojsonarray;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Convert a list of Student objects into a JSON array
public class ConvertListToJSONArray {
    public static void main(String[] args) {
        String jsonFile = "src/com/json/listtojsonarray/students.json";
        
        // Sample list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe", 20, 85.5));
        students.add(new Student("Jane Smith", 21, 92.0));
        students.add(new Student("Bob Johnson", 19, 78.5));
        students.add(new Student("Alice Brown", 22, 88.0));
        
        try (FileWriter writer = new FileWriter(jsonFile)) {
            writer.write("[\n");
            
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                writer.write("  {\n");
                writer.write("    \"name\": \"" + student.getName() + "\",\n");
                writer.write("    \"age\": " + student.getAge() + ",\n");
                writer.write("    \"marks\": " + student.getMarks() + "\n");
                writer.write("  }" + (i < students.size() - 1 ? ",\n" : "\n"));
            }
            
            writer.write("]\n");
            writer.flush();
            
            System.out.println("List converted to JSON array successfully: " + jsonFile);
            System.out.println("Total students: " + students.size());
        } catch (IOException e) {
            System.err.println("Error writing JSON file: " + e.getMessage());
        }
    }
}
