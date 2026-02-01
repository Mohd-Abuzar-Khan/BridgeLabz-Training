package com.lambda.ecommerecesort;


public class Products{
	protected String name;
	protected int price;
	protected int rating;
	protected int discount;
	
	
	public Products(String name, int price, int rating, int discount) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}
	
	@Override
    public String toString() {
        return name + " " + price + " " + rating + " " + discount ;
    }
	
	
	

}
