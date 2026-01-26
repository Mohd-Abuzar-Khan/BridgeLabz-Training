package com.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        String[] languages = {"Java", "Python", "JavaScript", "Go", "C", "C++", "C#", 
                              "Ruby", "PHP", "Swift", "Kotlin", "Rust", "Scala", "Perl"};

        List<String> foundLanguages = new ArrayList<>();

        for (String lang : languages) {
            Pattern pattern = Pattern.compile("\\b" + Pattern.quote(lang) + "\\b");
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                foundLanguages.add(lang);
            }
        }

        System.out.println("Input text: " + text);
        System.out.println("Extracted programming languages: " + String.join(", ", foundLanguages));
    }
}
