package com.challengeproblem;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReadingComparison {

    public static void main(String[] args) throws Exception {

        String filePath = "largefile.txt"; // 100MB file

      
        long startFR = System.currentTimeMillis();
        long wordCountFR = countWordsUsingFileReader(filePath);
        long endFR = System.currentTimeMillis();


        long startISR = System.currentTimeMillis();
        long wordCountISR = countWordsUsingInputStreamReader(filePath);
        long endISR = System.currentTimeMillis();

        System.out.println("\nFileReader Word Count: " + wordCountFR);
        System.out.println("FileReader Time (ms): " + (endFR - startFR));

        System.out.println("\nInputStreamReader Word Count: " + wordCountISR);
        System.out.println("InputStreamReader Time (ms): " + (endISR - startISR));
    }

    
    static long countWordsUsingFileReader(String filePath) throws IOException {
        long count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        }
        return count;
    }

    static long countWordsUsingInputStreamReader(String filePath) throws IOException {
        long count = 0;

        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(filePath),
                        StandardCharsets.UTF_8))) {

            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        }
        return count;
    }
}