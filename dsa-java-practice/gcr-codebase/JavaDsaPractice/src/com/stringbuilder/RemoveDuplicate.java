package com.stringbuilder;

import java.util.*;

public class RemoveDuplicate {
	
	public static String removeDuplicate(String str) {
		
        StringBuilder result = new StringBuilder();
		
        HashSet<Character> set=new HashSet<>();
        
        for(char ch : str.toCharArray()) {
        	
        	if(!set.contains(ch)) {
        		set.add(ch);
        		result.append(ch);
        	}
        }
        return result.toString();
	}
	

	public static void main(String[]args) {
		
		String str = "Ananya";
		
		String output= removeDuplicate(str);
		
		System.out.println("Resulting string is : "+ output);
        
	}
}