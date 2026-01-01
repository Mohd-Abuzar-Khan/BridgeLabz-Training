package com.inheritance.basicproblem.animalhierarchy;

public class Animal {
	public String name;
	public int age;
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void makeSound(){
		System.out.println("Animal makes a Sound");
	}

}
