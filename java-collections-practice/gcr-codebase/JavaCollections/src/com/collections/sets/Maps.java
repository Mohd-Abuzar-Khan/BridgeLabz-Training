package com.collections.sets;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	
	public static void main(String[] args) {
		
		
		Map<Integer, Character> map = new HashMap<>();
		
		map.put(21, 'a');
		map.put(22, 'b');
		map.put(23, 'c');
		map.put(24, 'd');

		for (int i : map.keySet()) {
			System.out.println(i);
			System.err.println(map.get(i));
		}
		
	}

	
	
}
