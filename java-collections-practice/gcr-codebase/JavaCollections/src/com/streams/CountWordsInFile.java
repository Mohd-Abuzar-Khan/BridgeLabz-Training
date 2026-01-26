package com.streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Counts words in a text file and shows the most frequent ones
public class CountWordsInFile {

    public static void main(String[] args) {
        String fileName = "text_file.txt";

        try {
            Map<String, Integer> wordCount = countWords(fileName);
            displayTopWords(wordCount, 5);

        } catch (IOException exception) {
            System.err.println("File read error: " + exception.getMessage());
        }
    }

    // Reads a file and counts word occurrences
    private static Map<String, Integer> countWords(String fileName) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase()
                        .replaceAll("[^a-zA-Z0-9\\s]", "")
                        .split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }

        return wordCount;
    }

    // Sorts and prints the top N words by frequency
    private static void displayTopWords(Map<String, Integer> wordCount, int topN) {
        List<Map.Entry<String, Integer>> entries =
                new ArrayList<>(wordCount.entrySet());

        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("Total unique words: " + wordCount.size());
        System.out.println("\nTop " + topN + " most frequent words:");
        System.out.println("================================");

        int limit = Math.min(topN, entries.size());
        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = entries.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
