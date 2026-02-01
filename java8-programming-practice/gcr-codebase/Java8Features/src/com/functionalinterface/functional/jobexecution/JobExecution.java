package com.functionalinterface.functional.jobexecution;

public class JobExecution implements Runnable{
	
	String name;
	

	public JobExecution(String name) {
		this.name = name;
	}

	@Override
    public void run() {
		System.out.println("Executing task " + name + " Thread  " + Thread.currentThread().getName());
    }

}
