package com.StreamBuzz;

import java.util.*;

public class StreamBuzz {
	
	
	public static List<CreatorStats> EngagementBoard = new ArrayList<CreatorStats>();
	
	
	public static void RegisterCreator(CreatorStats record){
		EngagementBoard.add(record);
		System.out.println("Creator registered successfully");

	}
	
	
	public static Dictionary<String, Integer> getTopPostCounts(List<CreatorStats> records, double likeThreshold){
	
	    Dictionary<String, Integer> creatorsPost = new Hashtable<>();
	
	    for(CreatorStats cs : records){
	
	        int weekCount = 0;
	
	        double[] likes = cs.WeeklyLikes;
	
	        for(int j = 0; j < likes.length; j++){
	            if(likes[j] >= likeThreshold){
	                weekCount++;
	            }
	        }
	        
	        creatorsPost.put(cs.CreatorName, weekCount);
	    }
	    
	    Enumeration<String> k = creatorsPost.keys();
        while (k.hasMoreElements()) {
            String key = k.nextElement();
            System.out.println(key + " - " + creatorsPost.get(key));
        }
	

	    return creatorsPost;
	}

	
	
	public static double CalaculateAverageLikes(){
		int count = 0;
		double totalLikes = 0;
		
		for(CreatorStats cs : EngagementBoard){
			count++;
			for(int j =0 ; j <4 ; j++){
				totalLikes += cs.WeeklyLikes[j];
			}
		}
		double avg = (double) totalLikes / count*4;
		
		System.out.println("Overall average weekly likes: " + avg);
		return 0.0;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean playing = true;
		
		while(playing){
			
			System.out.println("1. Register Creator \n2. Show Top Posts \n3. Calculate Average Likes \n4. Exit");
			
			System.out.println("Enter your choice:");
			
			int choice = sc.nextInt();
			
			if (choice == 1){
				
				sc.nextLine();
				
				System.out.println("Enter Creator Name:");
				String name = sc.nextLine();

				System.out.println("Enter weekly likes (Week 1 to 4):");

				double[] likes = new double[4];

				for(int i = 0; i < likes.length; i++){
				    likes[i] = sc.nextDouble(); 
				}

				CreatorStats creator = new CreatorStats(name, likes);
				RegisterCreator(creator);
				
			} else if(choice == 2){
				System.out.println("Enter like threshold:");
				double threshold = sc.nextDouble();
				getTopPostCounts(EngagementBoard, threshold);
				
			} else if(choice == 3){
				
				CalaculateAverageLikes();
				
			} else if(choice == 4){
				System.out.println("Logging off - Keep Creating with StreamBuzz!");
				playing = false;
				
			} else {
				System.out.println("Please Enter a Valid number");
			}	
			
	}
		
}
	


	
	
	
	
}