package com.regex;

import java.util.Scanner;

public class Regex{

	public static void main(String[] args) throws InvalidPattern{
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		if(input.matches("^[A-Z]{2}[a-z]{2}@([2-8][0-9]{3}|9000)$")){
			System.out.println("Valid");
		} else {
			throw new InvalidPattern("not Valid");
		}
	}
	
}

public class InvalidPattern extends Exception {
	public InvalidPattern(String msg){
		super(msg);
	}
}
