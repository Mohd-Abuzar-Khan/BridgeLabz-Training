package com.regex;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

// Replaces bad words in a sentence with asterisks
public class CensorBadWords {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";

        List<String> badWords = Arrays.asList("damn", "stupid", "bad");

        String output = input;

        for (String badWord : badWords) {

            // Replace whole words, case-insensitive
            output = output.replaceAll("(?i)\\b" + Pattern.quote(badWord) + "\\b", "****");
        }

        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }
}
