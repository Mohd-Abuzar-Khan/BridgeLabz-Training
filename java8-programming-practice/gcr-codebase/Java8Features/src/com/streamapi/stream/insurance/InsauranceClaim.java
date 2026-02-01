package com.streamapi.stream.insurance;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsauranceClaim {
	public static void main(String[] args) {

        List<Claim> list = new ArrayList<>();

        list.add(new Claim("Health", 5000));
        list.add(new Claim("Health", 7000));
        list.add(new Claim("Car", 12000));
        list.add(new Claim("Car", 8000));
        list.add(new Claim("Home", 15000));
        
		System.out.println("All available claim ");
		list.stream().forEach(System.out::println);

        Map<String, Double> avgClaim =
                list.stream()
                    .collect(Collectors.groupingBy(
                        c -> c.type,
                        Collectors.averagingDouble(c -> c.amount)
                    ));

        System.out.println("Average Claim Amount:");
        System.out.println(avgClaim);
    }

}
