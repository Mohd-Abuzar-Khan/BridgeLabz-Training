package com.stringbuilder;

public class ReverseString {

	public static void main(String []args) {
		
		//reverse a string string builder
		StringBuilder sb = new StringBuilder("Ananya");
		
		System.out.println(sb);
		
		sb.append("Shukla");
		
		System.out.println(sb);
		
		sb.insert(6,"-");
		
		System.out.println(sb);
		sb.reverse();
		
		System.out.println(sb);
	}
	
}