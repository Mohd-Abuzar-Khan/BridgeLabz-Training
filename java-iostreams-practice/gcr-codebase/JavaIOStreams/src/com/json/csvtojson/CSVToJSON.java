package com.json.csvtojson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVToJSON {
    public static void main(String[] args) {
        String csvFile = "src/com/json/csvtojson/data.csv";
        String jsonFile = "src/com/json/csvtojson/output.json";

        List<String[]> records = new ArrayList<>();
        String[] headers = null;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    headers = line.split(",");
                    isFirstLine = false;
                    continue;
                }
                String[] data = line.split(",");
                if (data.length == headers.length) {
                    records.add(data);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
            return;
        }

        try (FileWriter writer = new FileWriter(jsonFile)) {
            // Convert CSV records to JSON format
            writer.write("[\n");

            for (int i = 0; i < records.size(); i++) {
                String[] record = records.get(i);
                writer.write("  {\n");

                for (int j = 0; j < headers.length; j++) {
                    String header = headers[j].trim();
                    String value = record[j].trim();
                    boolean isNumber = false;
                    try {
                        Double.parseDouble(value);
                        isNumber = true;
                    } catch (NumberFormatException ignored) {
                    }

                    writer.write("    \"" + header + "\": ");
                    writer.write(isNumber ? value : "\"" + value + "\"");

                    writer.write(j < headers.length - 1 ? ",\n" : "\n");
                }

                writer.write(i < records.size() - 1 ? "  },\n" : "  }\n");
            }

            writer.write("]\n");
            writer.flush();

            System.out.println("CSV converted to JSON successfully: " + jsonFile);
            System.out.println("Total records converted: " + records.size());
        } catch (IOException e) {
            System.err.println("Error writing JSON file: " + e.getMessage());
        }
    }
}
