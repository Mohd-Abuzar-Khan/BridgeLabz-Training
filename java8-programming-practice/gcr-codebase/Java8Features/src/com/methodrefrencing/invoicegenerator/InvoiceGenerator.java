package com.methodrefrencing.invoicegenerator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceGenerator {
	
	public static void main(String[] args) {
		
		// Created a list of transaction ID  
		List<String> listOfTransactions = Arrays.asList("MQK0874", "RLD984","LIK853");
		
		List<Invoice> invoices = listOfTransactions.stream().map(Invoice::new).collect(Collectors.toList());
		
		invoices.forEach(System.out::println);
	}
}
