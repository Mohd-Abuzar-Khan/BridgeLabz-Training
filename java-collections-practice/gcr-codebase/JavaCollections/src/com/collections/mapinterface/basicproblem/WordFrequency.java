package com.collections.mapinterface.basicproblem;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	
	public static void main(String[] args) {
		
		Map<String, Integer> words = new HashMap<>();
        
        String input = "Hello World, Hello java";
        
        String arr[] = input.split(" " );
        
        for(String str : arr) {
        	words.put(str, words.getOrDefault(str, 0) + 1 );
        }
        
        System.out.println(words);
		
	}

}
