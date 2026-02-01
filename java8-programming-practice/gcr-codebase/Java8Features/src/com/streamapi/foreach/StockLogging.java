package com.streamapi.foreach;

import java.util.ArrayList;
import java.util.List;

public class StockLogging {

    public static void main(String[] args) {

        List<Double> stockPrices = new ArrayList<>();

        stockPrices.add(1023.45);
        stockPrices.add(1018.20);
        stockPrices.add(1031.75);
        stockPrices.add(1040.10);

        System.out.println("Live Stock Prices:");
        stockPrices.forEach(price ->
                System.out.println("Stock Price: ₹" + price)
        );
    }
}

