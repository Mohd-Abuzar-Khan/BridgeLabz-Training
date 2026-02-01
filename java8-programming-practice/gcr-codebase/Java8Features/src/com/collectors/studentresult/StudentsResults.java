package com.collectors.studentresult;

import java.util.*;
import java.util.stream.Collectors;

public class StudentsResults {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Abuzar", 'A'));
        list.add(new Student("Naman", 'B'));
        list.add(new Student("Laxmi", 'A'));
        list.add(new Student("Ananya", 'D'));

        Map<Character, List<String>> studentsByGrade =
                list.stream()
                    .collect(Collectors.groupingBy(
                        s -> s.grade,
                        Collectors.mapping(s -> s.name, Collectors.toList())
                    ));

        System.out.println("Students grouped by grade:");
        System.out.println(studentsByGrade);
    }
}
