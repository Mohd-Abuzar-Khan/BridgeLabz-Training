package com.stringbuffer;

public class ConcatenateString {

	public static String concatenateString(String [] arr) {
		
		StringBuilder sb= new StringBuilder();
		
		for(String s : arr) {
			sb.append(s);
		}
		
		return sb.toString();
	}
	public static void main(String[]args) {
		
		String[]arr= {"Hello ", "everyone ", "! ", "Whats ", "going ", "on ?"};
		
		String result = concatenateString(arr);
		
		System.out.println(result);
		
	}
}