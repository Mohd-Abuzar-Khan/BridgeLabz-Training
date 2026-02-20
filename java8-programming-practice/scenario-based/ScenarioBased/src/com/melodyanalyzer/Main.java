package com.melodyanalyzer;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean looping = true;
		

		
		while(looping) {
			System.out.println("Please choose a option \n1. Add Review\r\n"
					+ "2. Format Message\r\n"
					+ "3. Show Top Reviewers\r\n"
					+ "4. Exit");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				sc.nextLine();
				
				System.out.println("Enetr Username: ");
				String username = sc.nextLine();
				System.out.println("Enetr message:");
				String msg = sc.nextLine();
				
				SongLyric r = new SongLyric(username, msg);
				
				MelodyAnalyzer.registerSong(r);
				break;
			case 2 :
				sc.nextLine();

				System.out.println("Enter Message: ");
				String format = sc.nextLine();
				
				MelodyAnalyzer.transformLyric(format);
				break;
				
			case 3 :
				sc.nextLine();

				System.out.println("Enter vowel limit:");
				int limit = sc.nextInt();
				MelodyAnalyzer.getTopVowelSongs(limit);
				
				break;
				
			case 4:
				System.out.println("Logging off — Keep Creating with MelodyVerse!");
				looping = false;
				break;
			}
		}
		 
		
	}
}

