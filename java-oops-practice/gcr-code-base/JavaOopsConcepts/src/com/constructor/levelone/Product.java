package com.constructor.levelone;

public class Product {

	// Attributes
	String productName;
	double price;
	
	// Class variable
	static int totalProducts = 0;
	
	
	// Constructor
	Product(String productName, double price){
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	// Instance Method
	public void displayProductDetails() {
		System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
	}
	
	// Class Method (Static Method)
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

}
