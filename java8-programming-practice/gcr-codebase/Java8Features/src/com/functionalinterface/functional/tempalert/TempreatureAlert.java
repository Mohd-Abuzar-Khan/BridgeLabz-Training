package com.functionalinterface.functional.tempalert;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TempreatureAlert {
	
	public static void main(String[] args) {
		
		List<Integer> temp = Arrays.asList(97,66,65,74,33,84,104);
		
		int threshold = 75;
		
		Predicate<Integer> predicate = (x) -> x > threshold;
		
		for(int i : temp) {
			if(predicate.test(i)) {
				System.out.println("Alert! Threshold Temperature Crossed at " + i + " degree.");
			} 
		}
	}

}
