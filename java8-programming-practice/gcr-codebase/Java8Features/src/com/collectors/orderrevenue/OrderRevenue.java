package com.collectors.orderrevenue;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenue {

    public static void main(String[] args) {

        List<Order> list = new ArrayList<>();

        list.add(new Order("Zary", 1200));
        list.add(new Order("Alex", 800));
        list.add(new Order("Zary", 600));
        list.add(new Order("Alex", 400));

        Map<String, Double> revenueByCustomer =
                list.stream()
                    .collect(Collectors.groupingBy(
                        o -> o.customer,
                        Collectors.summingDouble(o -> o.total)
                    ));

        System.out.println("Revenue per customer:");
        System.out.println(revenueByCustomer);
    }
}
