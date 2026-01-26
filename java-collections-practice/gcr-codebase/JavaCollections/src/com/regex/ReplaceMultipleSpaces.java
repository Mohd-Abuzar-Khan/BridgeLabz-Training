package com.regex;


public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String input = "This is an    example    with multiple      spaces.";

        // Replace one or more whitespace characters with a single space
        String output = input.replaceAll("\\s+", " ");

        System.out.println("Input:  " + input);
        System.out.println("Output: " + output);
    }
}
