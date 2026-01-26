package com.json.javatojsoncar;

import java.io.FileWriter;
import java.io.IOException;

// Convert a Car object to JSON and save it to a file
public class ConvertCarToJSON {
    public static void main(String[] args) {
        String jsonFile = "src/com/json/javatojsoncar/car.json";

        Car car = new Car("Toyota", "Camry", 2023, 35000.00);

        try (FileWriter writer = new FileWriter(jsonFile)) {
            writer.write("{\n");
            writer.write("  \"brand\": \"" + car.getBrand() + "\",\n");
            writer.write("  \"model\": \"" + car.getModel() + "\",\n");
            writer.write("  \"year\": " + car.getYear() + ",\n");
            writer.write("  \"price\": " + car.getPrice() + "\n");
            writer.write("}\n");

            writer.flush();
            System.out.println("Car object converted to JSON successfully: " + jsonFile);
            System.out.println("\nCar JSON:");
            System.out.println("{");
            System.out.println("  \"brand\": \"" + car.getBrand() + "\",");
            System.out.println("  \"model\": \"" + car.getModel() + "\",");
            System.out.println("  \"year\": " + car.getYear() + ",");
            System.out.println("  \"price\": " + car.getPrice());
            System.out.println("}");
        } catch (IOException e) {
            System.err.println("Error writing JSON file: " + e.getMessage());
        }
    }
}
