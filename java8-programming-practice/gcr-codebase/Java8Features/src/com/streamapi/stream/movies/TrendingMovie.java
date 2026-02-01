package com.streamapi.stream.movies;

import java.util.*;

public class TrendingMovie {
    public static void main(String[] args) {

    	List<Movies> list = new ArrayList<>();

        list.add(new Movies("Inception", 8.8, 2010));
        list.add(new Movies("Oppenheimer", 9.1, 2023));
        list.add(new Movies("Dune", 8.5, 2021));
        list.add(new Movies("Interstellar", 8.7, 2014));
        list.add(new Movies("Avatar 2", 8.2, 2022));
        list.add(new Movies("Tenet", 7.9, 2020));

        list.stream()
              .filter(m -> m.releaseYear >= 2015)
              .sorted((a, b) -> Double.compare(b.rating, a.rating))
              .limit(5)
              .forEach(m -> 
                  System.out.println(m.name + " - " + m.rating)
              );
    }
}
