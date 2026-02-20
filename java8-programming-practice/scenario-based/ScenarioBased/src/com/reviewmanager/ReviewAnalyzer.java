package com.reviewmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReviewAnalyzer {
	
	public static List<Review> reviewBoard = new ArrayList<>();
	
	public static Set<Character> vowels = new HashSet<>(List.of('a','e','i','o','u','A','E','I','O','U'));
	
	public static void addReview(Review review) {
		reviewBoard.add(review);
		System.out.println("Review added successfully");
	}
	
	public static String formatMessage(String msg) {
		
		if (msg.length() > 12) {
			String ans = "";
			msg.toLowerCase();
			StringBuffer rev = new StringBuffer(msg);
			
			rev.reverse();
			char[] arr = String.valueOf(rev).toCharArray();
			
			for(char c : arr) {
				if(vowels.contains(c)) {
					ans = ans + '#';
				} else {
					ans = ans + c;
				}
			}
			System.out.println(ans);
			return ans;
		} else {
			System.out.println(msg.toUpperCase());

			return msg.toUpperCase();
		}
		
	
	}
	
	public static Map<String, Integer> countCharacters(String msg) {
		
		Map<String, Integer> res = new HashMap<>();
		
		char[] charArr = msg.toCharArray();
		
		for(char c : charArr) {
			int v = 0;
			int con = 0;
			if(Character.isLetter(c) && vowels.contains(c)) {
				v++;
				res.put("Vowels", v);
			} else if (Character.isLetter(c)) {
				con++;
				res.put("Consonants", con);
			}
		}
		
		return res;
		
	}
	
	public static List<String> getTopReviwers(int limit){
		List<String> res = new ArrayList<>();
		
		for(Review r : reviewBoard) {
			if (r.name.length() >= limit) {
				res.add(r.name);
			}
		}
		
		if(res.isEmpty()) {
			System.out.println("No reviewers found");
		} 
		
		for(String r : res) {
			System.out.println(r);
		}
		
		return res;
	}

}
