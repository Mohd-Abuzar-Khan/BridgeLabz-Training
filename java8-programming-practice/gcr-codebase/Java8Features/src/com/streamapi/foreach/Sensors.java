package com.streamapi.foreach;

import java.util.ArrayList;
import java.util.List;

public class Sensors {

    public static void main(String[] args) {

        List<Integer> readings = new ArrayList<>();

        readings.add(45);
        readings.add(78);
        readings.add(30);
        readings.add(90);
        readings.add(55);

        int threshold = 50;

        System.out.println("Readings above threshold:");
        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r ->
                        System.out.println("Sensor Reading: " + r)
                );
    }
}

