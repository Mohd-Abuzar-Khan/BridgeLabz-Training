package com.lambda.ecommerecesort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ecommerce {
	
	
	public static void main(String[] args) {
		
		List<Products> list = new ArrayList<>();
		
		list.add(new Products("Soap",40,4,20));
		list.add(new Products("Bread",75,2,25));
		list.add(new Products("Milk",110,3,35));
		list.add(new Products("Face Mask",83,5,40));
		
		
		Comparator<Products> prices = (p1,p2) -> p1.price - p2.price;
		Comparator<Products> rating = (p1,p2) -> p1.rating - p2.rating;
		Comparator<Products> discount = (p1,p2) -> p1.discount - p2.discount;

		
		Collections.sort(list, prices);
		System.out.println("Based on Prices: ");
		System.out.println(list.toString());
		System.out.println("---------------->");
		
		Collections.sort(list, rating);
		System.out.println("Based on Rating: ");
		System.out.println(list.toString());
		System.out.println("---------------->");


		Collections.sort(list, discount);
		System.out.println("Based on Discount: ");
		System.out.println(list.toString());
		System.out.println("---------------->");



		
	}

}
