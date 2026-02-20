package com.streamapi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class AdvannceProblem {
	public static void main(String[] args) {
		
		
		// Question 20 : Count occurrences of each word
		String input20 = "Java is Java and Java is Fast";
		
		// how to firstly convert it into an string of array
		// then collect the words and print them 
		System.out.println(Arrays.stream(input20.split(" ")).collect(Collectors.groupingBy(w -> w, LinkedHashMap::new, Collectors.counting())));
		
		
		// Question 21 : Partition number into even and odd
		int[] input21 = {1,2,3,4,5,6};
		
		
//		System.out.println(Arrays.stream(input21).collect(Collectors.groupingBy( x -> x % 2 == 0, Even ), null, null));
		
	}
}
