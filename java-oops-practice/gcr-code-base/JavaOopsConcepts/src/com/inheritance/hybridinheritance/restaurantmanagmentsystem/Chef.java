package com.inheritance.hybridinheritance.restaurantmanagmentsystem;

public class Chef extends Person implements Worker {

	 Chef(String name, int id) {
	     super(name, id);
	 }

	 @Override
	 public void performDuties() {
	     System.out.println("Chef " + name + " is cooking delicious meals.");
	 }
	}
