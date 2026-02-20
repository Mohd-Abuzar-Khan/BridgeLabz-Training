package com.EcoTrails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TrailUtil {
	
	private List<Trail> listOfTaril = new ArrayList<>();
	

	public void addTrailRecord(Trail trail) {
		listOfTaril.add(trail);
		
	}

	
	public Trail getTrailById(String trailId) {
		for(Trail trail : listOfTaril) {
			if (trail.trailId == trailId) {
				return trail;
			}
		}
		return null;
	}

	public Set<Trail> getMostHikedTrails(){
		
		int high = -1;
		Trail res = null;
		
		Set<Trail> ans = new HashSet<>();
		
		
		for(Trail trail : listOfTaril) {
			if (trail.hikeCount > high ) {
				high = trail.hikeCount;
			}
		}
		
		for(Trail trail : listOfTaril) {
			if (trail.hikeCount == high ) {
				ans.add(trail);
			}
		}
		
		return ans;
		
	}

	public Map<String, Integer> getHikeCountByRegion() {
		
		Map<String, Integer> hikes = new HashMap<>();
		
		
		for(Trail trail : listOfTaril) {
			hikes.put(trail.region , hikes.getOrDefault(hikes.get(trail.region) + trail.hikeCount, trail.hikeCount));
		}
		
		return hikes;
	}

	public Map<String, List<Trail>> groupTrailsByDifficulty(){
		
		Map<String, List<Trail>> res = new HashMap<>();
		
		for(Trail trail : listOfTaril) {
			res.put(trail.difficulty , res.getOrDefault(res.get(trail.difficulty).add(trail), new ArrayList<Trail>()));
		}
		
		return res;
		
	}

	public boolean updateHikeCount(String trailId, int additionalHikes) {
		
		for(Trail trail : listOfTaril) {
			if (trail.trailId == trailId) {
				trail.hikeCount += additionalHikes;
				return true;
			}
		}
		
		return false;
	}

	public List<Trail> filterTrails(String region, String difficulty) {
		
		List<Trail> ans = new ArrayList<>();
		
		for(Trail t : listOfTaril) {
			if(t.region.equals(region) && t.difficulty.equals(difficulty)) {
				ans.add(t);
			}
		}
		
		return ans;
	}

	public Map<String, List<Trail>> getTopTrailsByRegion(int n){
		
		Map<String, List<Trail>> topRegion = new HashMap<>();
		
		for(Trail t : listOfTaril) {
			if(t.region.equals(region)) {
				ans.add(t);
			}
		}
		
		return topRegion;
		
	}

	public Map<String, String> getDifficultyStats() {
		
	}

	
	
	
}
