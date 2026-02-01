package com.functionalinterface.functional.lengthcheck;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class LengthChecker {
	public static void main(String[] args) {
		
		List<String> listOfString = Arrays.asList("Hey! Are you still mad at me?",
				"I have said sorry multiple times", "Sorry for my behaviour", "I Forgive you",
				"I really appreciate it");
		
		Function<String, Integer> checker = (str) -> str.length();
		
		for(String str : listOfString) {
			System.out.println("The total length of String [" + str + "] is " + checker.apply(str));
		}
		
	}
}
