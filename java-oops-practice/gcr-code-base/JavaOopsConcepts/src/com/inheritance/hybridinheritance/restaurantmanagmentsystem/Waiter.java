package com.inheritance.hybridinheritance.restaurantmanagmentsystem;

public class Waiter extends Person implements Worker {

	 Waiter(String name, int id) {
	     super(name, id);
	 }

	 @Override
	 public void performDuties() {
	     System.out.println("Waiter " + name + " is serving food to customers.");
	 }
}