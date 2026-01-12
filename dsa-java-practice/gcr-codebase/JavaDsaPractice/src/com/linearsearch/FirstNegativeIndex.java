package com.linearsearch;

public class FirstNegativeIndex {

	public static void main (String[]args) {
		
		int []arr= {2,5,7,4,6,-9,-3,-2};
		
		int index=-1;
		
		for(int i=0; i<arr.length; i++) {
		    
			if(arr[i]<0) {
				index=i;
				break;
			}
		}
		System.out.println("First negative index : "+ index+1);
	}
}