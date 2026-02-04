package com.StreamBuzz;

// Class CreatorStats
public class CreatorStats{
	String CreatorName;
	public double[] WeeklyLikes = new double[4];
	

	public CreatorStats(String name, double[] likes) {
		this.CreatorName = name;
		this.WeeklyLikes = likes;
	}
	
}