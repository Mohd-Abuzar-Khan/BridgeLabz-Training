package com.streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsProblem {

    public static void main(String[] args) {

        // Question 1 : Character Frequency Count
        System.out.println("Q1 -------->");
        String input1 = "banana";

        Map<Character, Long> freq =
                input1.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));

        System.out.println(freq);


        // Question 2 : Word Frequency Count
        System.out.println("Q2 -------->");
        String input2 = "java is java and java is fast";

        Map<String, Long> freq2 =
                Arrays.stream(input2.split(" "))
                        .collect(Collectors.groupingBy(
                                w -> w,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ));

        System.out.println(freq2);


        // Question 3 : First Non-Repeating Character
        System.out.println("Q3 -------->");
        String input3 = "stress";

        Character first =
                input3.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .findFirst()
                        .orElse(null);

        System.out.println(first);


        // Question 4 : All Non-Repeating Characters
        System.out.println("Q4 -------->");
        String input4 = "programming";

        List<Character> unique =
                input4.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() == 1)
                        .map(Map.Entry::getKey)
                        .toList();

        System.out.println(unique);


        // Question 5 : Remove Duplicate Characters
        System.out.println("Q5 -------->");
        String noDuplicates =
                "banana".chars()
                        .distinct()
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining());

        System.out.println(noDuplicates);


        // Question 6 : Keep Only Characters Appearing Once
        System.out.println("Q6 -------->");
        String onlyUnique =
                "aabbccdde".chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                c -> c,
                                LinkedHashMap::new,
                                Collectors.counting()
                        ))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() == 1)
                        .map(e -> String.valueOf(e.getKey()))
                        .collect(Collectors.joining());

        System.out.println(onlyUnique);


        // Question 7 : Remove Non-Alphanumeric Characters
        System.out.println("Q7 -------->");
        String clean =
                "ja@va#8!!".chars()
                        .filter(Character::isLetterOrDigit)
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining());

        System.out.println(clean);


        // Question 8 : Keep Only Alphabets
        System.out.println("Q8 -------->");
        String alphabets =
                "java8stream2025".chars()
                        .filter(Character::isLetter)
                        .mapToObj(c -> String.valueOf((char) c))
                        .collect(Collectors.joining());

        System.out.println(alphabets);
        
        
        List<String> arr = List.of("Apple", "Cat", "Dog", "Man", "Pigeon", "buton");
        
        System.out.println(arr.stream().collect(Collectors.groupingBy(c -> c.length(), 
        		Collectors.counting())
        		).entrySet().stream().collect(null));
        
        
    }
}
