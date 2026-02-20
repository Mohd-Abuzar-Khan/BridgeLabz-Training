package com.codecrafts;

import java.util.Scanner;

public class CodeCrafts {
	
	public static void validateSubmission(String submissionCode) {
		
		
		String pattern = "^CC-([A-Z]{3}[0-9]{2}[A-Z])-([A-Z]{5}[0-9]{2})-";
		
		
//		String[] arr = submissionCode.split("-");
//		String userID = null;
//		String projectCode = null;
//		int duration = 0;
//		int score = 0;
//		
//		Submission s = null;
//		
//		if(arr[1].matches("^[A-Z]{3}[0-9]{2}[A-Z]{1}") || arr[2].matches("[A-Z]{5}[0-9]{2} ") || arr[3].matches("^[0-9]{5}[M*H]") || arr[4].matches("[0-9]{4}")) {
//			userID = arr[1];
//			projectCode = arr[2];
//			String time = arr[3];
//			if (time.charAt(1) == 'H') 
//			{
//				duration = (time.charAt(0) - '0') * 60;
//			} else {
//				duration = time - "0";
//			}
//			duration = Integer.parseInt(arr[3]);
//			
//			score = Integer.parseInt(arr[4]);
//		} else {
//			return s;
//		}
//		
//		s = new Submission(userID, projectCode, duration, score);
//		
//		return s;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		

	}

}
