package com.collections.mapinterface.basicproblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InvertAMap {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		Map<Integer, String> Invertedmap = new HashMap<>();

		
		
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 1);
		
		for(Map.Entry<String, ArrayList<Integer>> m : map.entrySet()) {
			Invertedmap.put(m.getValue(),m.getKey());
		}
		
		System.out.println(Invertedmap.toString());

	}
	
}
