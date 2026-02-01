package com.functionalinterface.functional.jobexecution;

import java.util.List;

public class AsynchronousThread {
	public static void main(String[] args) {
		
		List<String> jobs = List.of("first", "Second", "Third", "Four", "Five");

		for (String str : jobs) {
			JobExecution job = new JobExecution(str);
	        Thread t = new Thread(job);
	        t.start();  
		}
			
    }
}
