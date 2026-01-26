package com.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Extracts currency values from a text
public class ExtractCurrencyValues {

    public static void main(String[] args) {
        String text = "The price is 5000 ruppees , and the discount is 1050 ruppees.";

        Pattern pattern = Pattern.compile("\\$?\\d+\\.?\\d*");
        Matcher matcher = pattern.matcher(text);

        List<String> currencyValues = new ArrayList<>();
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        System.out.println("Input text: " + text);
        System.out.println("Extracted currency values: " + String.join(", ", currencyValues));
    }
}
