package com.functionalinterface.markerinterface.cloning;

public class Cloning {

	 public static void main(String[] args) {

	        try {
	        	Demo m1 = new Demo(1, "Demo");
	        	Demo m2 = (Demo) m1.clone();

	            System.out.println(m1.name);
	            System.out.println(m2.name);

	        } catch (CloneNotSupportedException e) {
	            System.out.println("Cloning is not allowed");
	        }
	    }
}
