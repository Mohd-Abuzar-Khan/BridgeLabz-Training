package com.EcoTrails;

public class Trail {
	protected String trailId;
	protected String name;
	protected String region;
	protected String difficulty;
	
	protected int hikeCount;
	
	public Trail() {

	}

	public Trail(String trailId, String name, String region, String difficulty, int hikeCount) {
		this.trailId = trailId;
		this.name = name;
		this.region = region;
		this.difficulty = difficulty;
		this.hikeCount = hikeCount;
	}
	
	
}
