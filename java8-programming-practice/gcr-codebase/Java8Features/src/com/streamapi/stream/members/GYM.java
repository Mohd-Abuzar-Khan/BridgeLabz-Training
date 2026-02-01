package com.streamapi.stream.members;

import java.time.LocalDate;
import java.util.*;

public class GYM {

    public static void main(String[] args) {

        List<Member> list = new ArrayList<>();

        list.add(new Member("Zary", LocalDate.now().plusDays(10)));
        list.add(new Member("Alex", LocalDate.now().plusDays(45)));
        list.add(new Member("John", LocalDate.now().plusDays(25)));

        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        list.stream()
            .filter(m -> m.Expiry.isAfter(today)
                      && m.Expiry.isBefore(limit))
            .forEach(System.out::println);
    }
}

