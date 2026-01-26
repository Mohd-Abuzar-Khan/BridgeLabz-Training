package com.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class TwoEqualSet {
	
	public static void main(String[] args) {
		
		// Creating 2 set to compare
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(2);
		set2.add(1);
		

		int count = 0;

		
		for(int s : set1) {
			if (set2.contains(s)) {
				count++;
			}
		}
		
		if (count == set1.size()) {
			System.out.println("Both of the sets are equal");
		} else {
			System.out.println("Both of the sets are not equal");
		}

		
	}

}
