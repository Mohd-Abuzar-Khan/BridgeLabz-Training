package com.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
	
	
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		Set<Integer> union = new HashSet<>();

		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		
		Set<Integer> intersection = new HashSet<>(set1);
		
		union.addAll(set1);
		union.addAll(set2);
		
		 intersection.retainAll(set2);
		
		
		System.out.println(union);
		System.out.println(intersection);

	}

}
