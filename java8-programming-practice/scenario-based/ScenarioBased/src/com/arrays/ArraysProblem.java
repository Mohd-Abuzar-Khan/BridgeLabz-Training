package com.arrays;

import java.util.Scanner;

public class ArraysProblem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] sales = {120, 80, 150, 90, 200, 75, 110};
		
		int[] temperatures = {32, 28, 31, 29, 35, 27, 30};
		
		ActivityOne(temperatures);
		ActivityTwo(temperatures);
		ActivityThree(temperatures);
		ActivityFour(sales);
		ActivityFive(sales);
		ActivitySix(sales);
		int target = 150;
		ActivitySeven(sales,target);
		int day = 2;
		int updatedValue = 95;
		ActivityEight(sales,day,updatedValue);

		
	}

	private static void ActivityEight(int[] sales, int day, int value) {
		for(int i = 0; i < sales.length; i++) {
			if(i+1 == day) {
				sales[i] = value;
				System.out.println("Updated sales for Day "+ (i+1) +" : " + value);
			}
			
		}
	}

	private static void ActivitySeven(int[] sales, int target) {
		for(int i = 0; i < sales.length; i++) {
			if(sales[i] == target) {
				System.out.println("Sale " + sales[i] + " found on Day " + (i + 1));
			}
			
		}
	}

	private static void ActivitySix(int[] sales) {
		int thresh = 100;
		int count = 0;
		for(int temp : sales) {
			if(temp > thresh) {
				count++;
			}
		}
		System.out.println("Number of high sales days (>100):" + count);
	}

	private static void ActivityFive(int[] sales) {
		int low = 1000000;
		int high = -1;
		
		int day1 = 0;
		int day2 = 0;
		
		for(int i = 0; i < sales.length; i++) {
			if(sales[i] > high) {
				high = sales[i];
				day1 = i + 1;
			}
			
		}
		
		for(int i = 0; i < sales.length; i++) {
			if(sales[i] < low) {
				low = sales[i];
				day2 = i + 1;
			}
			
		}
		
		System.out.println("Highest sale: " + high + " on day " + day1);
		System.out.println("Lowest sale: " + low +" on day " + day2);
		
	}

	private static void ActivityFour(int[] sales) {
		int sum = 0; 
		for(int s : sales) {
			sum+=s;
			
		}
		float avgTemp = (float) sum / sales.length;
		System.out.println("Total Sales: " + sum);
		System.out.println("Average Sales: " + String.format("%.1f", avgTemp));
	}

	private static void ActivityThree(int[] temperatures) {
		int thresh = 30;
		int count = 0;
		for(int temp : temperatures) {
			if(temp < thresh) {
				count++;
			}
		}
		System.out.println("Number of hot days (>30°C): " + count);
	}

	private static void ActivityTwo(int[] temperatures) {
		int low = 1000000;
		int high = -1;
		
		for(int temp : temperatures) {
			if(temp > high) {
				high = temp;
			}
		}
		
		for(int temp : temperatures) {
			if(temp < low) {
				low = temp;
			}
		}
		
		System.out.println("Highest Temperature: " + high+"°C");
		System.out.println("Lowest Temperature: " + low+"°C");
		
	}

	private static void ActivityOne(int[] temperatures) {
		int sum = 0; 
		for(int temp : temperatures) {
			sum+=temp;
		}
		float avgTemp = (float) sum / temperatures.length;
		System.out.println("Average Temperature: " + String.format("%.1f", avgTemp)+"°C");
	}
}
