package com.linearsearch;

public class WordSearch {

    public static String findSentenceContainingWord(String[] sentences, String word) {

        for (String sentence : sentences) {
           
            if (sentence.toLowerCase().contains(word.toLowerCase())) {
                return sentence;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a powerful programming language",
            "Linear search is simple and effective",
            "Data structures are important in programming",
            "File handling in Java is easy"
        };

        String word = "search";

        String result = findSentenceContainingWord(sentences, word);
        System.out.println(result);
    }
}