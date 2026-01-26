package com.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDiff {
	
	private static final Set<Integer> symmetric = new HashSet<>();

	public static void removeElement(int element) {
		symmetric.remove(element);
	}
	
	public static void main(String[] args) 
	{
		
		// Creating two set to find a symmetric set of the two of them
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(2);
		set2.add(5);
		
		Set<Integer> intersection = new HashSet<>(set1);
	
		intersection.retainAll(set2);
		
		symmetric.addAll(set1);
		symmetric.addAll(set2);
		
		symmetric.removeAll(intersection);
		
		System.out.println(symmetric);

	}
	

}
