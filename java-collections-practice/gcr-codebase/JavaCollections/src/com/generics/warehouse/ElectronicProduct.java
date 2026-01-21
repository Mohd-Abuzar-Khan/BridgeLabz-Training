package com.generics.warehouse;

//Class representing electronic items
public class ElectronicProduct extends Product {

	// Constructor for electronic product
	public ElectronicProduct(String productName) {
		super(productName);
	}

	// Display electronic product details
	public void showDetails() {
		System.out.println("Electronic Product: " + productName);
	}
}
