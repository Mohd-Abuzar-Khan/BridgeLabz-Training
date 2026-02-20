package com.melodyanalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MelodyAnalyzer {
	
	public static List<SongLyric> songBoard = new ArrayList<>();
	
	public static Set<Character> vowels = new HashSet<>(List.of('a','e','i','o','u','A','E','I','O','U'));
	
	
	public static void registerSong(SongLyric song) {
		songBoard.add(song);
	}
	
	public static String transformLyric(String lyric) {
		
		if(lyric.length() > 10) {
			
			String res = "";
			
			StringBuilder ly = new StringBuilder(lyric);
			ly.reverse();
			
			
			
			char[] charArr = ly.toString().toLowerCase().toCharArray();
			
			for(char ch : charArr) {
				if(vowels.contains(ch)) {
					res = res + "*";
				}else {
					res = res + ch;
				}
			}
			System.out.println(res);
			return res;
		} else {
			System.out.println(lyric.toUpperCase());
			return lyric.toUpperCase();
		}
	}
	
	public static  Map<String, Integer> countLetterTypes(String lyric) {
		
		Map<String, Integer> res = new HashMap<>();
		
		char[] charArr = lyric.toCharArray();
		
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
	
	public static List<String> getTopVowelSongs(int vowelThreshold){
		
		List<String> res = new ArrayList<>();
		
		for(SongLyric r : songBoard) {
			if (r.title.length() >= vowelThreshold) {
				res.add(r.title);
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
