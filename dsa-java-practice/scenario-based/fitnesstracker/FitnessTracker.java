package sorting.fitnesstracker;

import java.util.Arrays;

public class FitnessTracker {
	
	static int listSize = 0;
	static User[] userList = new User[listSize];
	
	public static void addUser(String name, int stepCount, String userId) {
		User user = new User(name, stepCount, userId);
		
		// Dynamically increasing the size of an array
		if(listSize <= userList.length) {
			User[] temp = new User[++listSize];
			
			for(int i = 0; i < listSize - 1; i++ ) {
				temp[i] = userList[i];
			}
			
			temp[listSize - 1 ] = user;
			userList = temp;
			
		}

		
		System.out.println(user.name + " added to leader board successfully ");
		
	}
	
	public static void sort() {
		for(int i = 0;  i < userList.length; i++) {
			for(int j = 0; j < userList.length; j++) {
				if(userList[i].steps < userList[j].steps) {
					User temp = userList[i];
					userList[i] = userList[j];
					userList[j] = temp;
				}
			}
		}
	}
	
	
	
	public static void displayLeaderBoard() {
		System.out.println("-----------------------------");
		System.out.println("Leader Board");
		System.out.println("-----------------------------");
		System.out.println("Name\t\tStep Count");
		System.out.println("-----------------------------");
		int i = 1;
		
		System.out.println(Arrays.toString(userList));
		for (User u : userList) {
			System.out.println((i) + " ) " + u.name + "\t" + u.steps);
			i++;
		}
		System.out.println("-----------------------------");

	}


	public static void main(String[] args) {
		
		// Adding user to leader board list
		addUser("Abuzar", 8450,"KLO75R");
		addUser("Rahul", 10230,"KTYO75R");
		addUser("Sneha", 7650,"KJL75R");
		addUser("Amit	", 12040,"KPF75R");
		addUser("Pooja", 9340,"KPF75R");
		addUser("Karan", 15620,"KPF75R");
		addUser("Neha", 6890,"KPF75R");
		addUser("Vikram", 11075,"KPF75R");
		addUser("Anjali", 9800,"KPF75R");
		addUser("Rohit", 13450,"KPF75R");
		addUser("Priya", 7200,"KPF75R");
		addUser("Sahil", 8900,"KPF75R");
		addUser("Meera", 10430, "KPF75R");
		addUser("Nikhil", 12560,"KPF75R");
		addUser("Kavita", 9600, "KPF75R");

		// Calling method to sort leader board
		sort();

		// Calling method to display user details in leader board
		displayLeaderBoard();

		
	}
}
