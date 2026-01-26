package com.collections.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ToSortedList {
	
	public static void main(String[ ] args) {
		
		Set<Integer> set1 = new HashSet<>();
		
		set1.add(5);
		set1.add(3);
		set1.add(19);
		set1.add(1);
		
		ArrayList<Integer> list = new ArrayList<>(set1);
				
		Collections.sort(list);

		System.out.println(list);

		
	}

}
