package com.streamapi.stream.transformname;
import java.util.*;

public class TransformingName {
    public static void main(String[] args) {

        List<String> names = List.of("Abuzar", "Ananya", "Arif", "Laxmi");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}

