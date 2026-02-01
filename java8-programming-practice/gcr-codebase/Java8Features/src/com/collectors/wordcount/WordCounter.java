package com.collectors.wordcount;

import java.util.*;
import java.util.stream.Collectors;

public class WordCounter {

    public static void main(String[] args) {

        String paragraph = "java streams make java code more readable and streams are powerful";

        Map<String, Integer> wordCount =
                Arrays.stream(paragraph.split(" "))
                      .collect(Collectors.toMap(
                          word -> word,
                          word -> 1,
                          Integer::sum
                      ));

        System.out.println("Word Frequency:");
        System.out.println(wordCount);
    }
}
