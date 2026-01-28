package com.json.javatojsoncar;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Converts a Car object into JSON and saves it to a file
public class ConvertCarToJSON {

    public static void main(String[] args) {
        String jsonFilePath = "src/com/json/javatojsoncar/car.json";

        Car car = new Car("Toyota", "Camry", 2023, 35000.00);

        try {
            // Create a JSON object from Car fields
            JSONObject carJson = new JSONObject();
            carJson.put("brand", car.getBrand());
            carJson.put("model", car.getModel());
            carJson.put("year", car.getYear());
            carJson.put("price", car.getPrice());

            // Write JSON to file with indentation
            Files.writeString(Paths.get(jsonFilePath), carJson.toString(2));

            System.out.println("Car JSON file created: " + jsonFilePath);
            System.out.println("\nCar JSON:");
            System.out.println(carJson.toString(2));

        } catch (IOException e) {
            System.err.println("Failed to write JSON file: " + e.getMessage());
        }
    }
}
