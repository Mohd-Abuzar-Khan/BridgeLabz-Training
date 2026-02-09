package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LogicalStreamsProblem {
	public static void main(String[] args) {
		
		
		// Question 1 : Count vowels in a string
		long count = "programming"
					.toLowerCase()
					.chars()
					.filter(c -> "aieou".indexOf(c) != -1)
					.count();
		
		System.out.println("Question 1 Output:");
		System.out.println(count);
		
		
		// Question 2 : Count numbers of words
		long words = Arrays.stream("Java is very powerful".split(" "))
							.count();
		
		System.out.println("Question 2 Output:");
		System.out.println(words);
		
		
		// Question 3 : find even Numbers
		List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5)
							.stream()
							.filter(n -> n % 2 == 0)
							.collect(Collectors.toList());
		
		System.out.println("Question 3 Output:");
		System.out.println(arr);
		
		
		//Question 4 : Count String starting with 'a'
		long count4 = Arrays.asList("apple","banana","ant","car")
					.stream().filter(s -> s.startsWith("a"))
					.count();
		
		System.out.println("Question 4 Output:");
		System.out.println(count4);
		
		// Questions 5 : Remove Empty Strings
		List<String> empty = Arrays.asList("java","","spring","","boot")
				.stream().filter(s -> !s.isEmpty())
				.toList();
		
		System.out.println("Question 5 Output:");
		System.out.println(empty);
		
		
		// Question 6 : Find max
		int max = Arrays.asList(10,25,3,99,45)
				.stream()
				.max(Integer::compare)
				.get();
		
		System.out.println("Question 6 Output:");
		System.out.println(max);
		
		// Question 7 : Join strings with comma
		String join = Arrays.asList("Java","String", "Boot")
				.stream()
				.collect(Collectors.joining(" , "));
				
				
		System.out.println("Question 7 Output:");
		System.out.println(join);	
				
				
				
		// Question 8 : Character Frequency	
		Map<Character, Long> freq =
				"banana".chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println("Question 8 Output:");
		System.out.println(freq);
		
		// Question 9 : Flattens list of lists
		List<Integer> flat =
		        List.of(List.of(1,2), List.of(3,4), List.of(5))
		        .stream()
		        .flatMap(List::stream)
		        .toList();
		
		System.out.println("Question 9 Output:");
		System.out.println(flat);

	}
}
