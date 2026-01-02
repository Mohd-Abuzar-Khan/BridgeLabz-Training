package com.inheritance.hybridinheritance.restaurantmanagmentsystem;

public class Main {
	
	 public static void main(String[] args) {

	     Worker chef = new Chef("Gordon", 101);
	     Worker waiter = new Waiter("Alex", 102);

	     chef.performDuties();
	     waiter.performDuties();
	 }
}

