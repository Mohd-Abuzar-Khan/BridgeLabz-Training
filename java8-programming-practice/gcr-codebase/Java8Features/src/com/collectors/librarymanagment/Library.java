package com.collectors.librarymanagment;


import java.util.*;
import java.util.stream.Collectors;

public class Library {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Clean Code", "Programming", 464));
        books.add(new Book("Think Like a Monk", "Self-Help", 352));
        books.add(new Book("Wings of Fire", "Fantasy", 180));
        books.add(new Book("The Hobbit", "Fantasy", 310));

        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream()
                     .collect(Collectors.groupingBy(
                         b -> b.genres,
                         Collectors.summarizingInt(b -> b.page)
                     ));

        System.out.println("Book statistics by genre:");
        System.out.println(statsByGenre);
    }
}
