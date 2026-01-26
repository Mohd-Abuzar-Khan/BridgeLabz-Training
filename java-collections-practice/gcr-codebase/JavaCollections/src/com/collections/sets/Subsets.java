package com.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Subsets {
	
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(2);
		set1.add(3);
		
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		Set<Integer> subset = new HashSet<>(set1);
		
		subset.retainAll(set2);
		
		if (!subset.isEmpty()) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}

}
