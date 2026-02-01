package com.streamapi.foreach;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaction {

    public static void main(String[] args) {

        List<String> transactions = new ArrayList<>();

        transactions.add("TXN101");
        transactions.add("TXN102");
        transactions.add("TXN103");

        transactions.forEach(id ->
                System.out.println(
                        LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}

