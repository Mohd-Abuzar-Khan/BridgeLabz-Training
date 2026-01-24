package sorting.gamerzone;

public class GamerZone {
	
	public static void quickSort(User[] players, int low, int high ) {
		
		// Check if there are at least two elements to sort
        if (low < high) {

            // Partition the array and get pivot index
            int pivotIndex = partition(players, low, high);

            // Recursively sort elements before pivot
            quickSort(players, low, pivotIndex - 1);

            // Recursively sort elements after pivot
            quickSort(players, pivotIndex + 1, high);
        }
		
	}

    private static int partition(User[] players, int low, int high) {
		
    	int pivot = players[high].score;
    	
    	int i = low - 1;
    	
    	for(int j = low; j < high; j++) {
    		
    		if(players[j].score > pivot) {
    			i++;
    			swap(players, i, j);
    		}
    		
    	}
    	
    	swap(players, i + 1, high);
    	
    	return i + 1;
    	
    	
	}
    
    // Swap method to exchange two Player objects
    static void swap(User[] players, int i, int j) {
        User temp = players[i];
        players[i] = players[j];
        players[j] = temp;
    }

	public static void main(String[] args) {

        // Creating array of players with their scores
        User[] players = {
            new User("Abuzar", 4500),
            new User("John", 7200),
            new User("Alex", 5100),
            new User("Ravi", 9000),
            new User("Sara", 6800)
        };

        // Calling Quick Sort to rank players
        quickSort(players, 0, players.length - 1);

        // Displaying sorted leader board
        System.out.println("Leaderboard (High to Low):");
        for (User p : players) {
            System.out.println(p.name + " → " + p.score);
        }
    }

}
